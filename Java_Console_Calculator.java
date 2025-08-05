import java.util.Scanner;
import java.util.*;
import java.lang.Math;

public class Java_Console_Calculator{
    static Scanner sc = new Scanner(System.in);
     
    //Addition Method
    public static void Addition(){  
        System.out.println("------Addition------");
        
        System.out.print("Enter the number of numbers : ");
        int n = sc.nextInt();
        if(n>25){
            System.out.println("Limit Exceded");
            return;
        }

        int sum = 0;

        for(int i =0; i<n; i++){
            System.out.print("Enter number: ");
            int input = sc.nextInt();            
            sum = sum + input;

            if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            System.out.println("Limit Exceeded");
            return;
            }

        }
        System.out.println(sum);
    }

    //Subtraction Method
    public static void Subtraction(){
        System.out.println("------Subtraction------");
        
        System.out.print("Enter the number of numbers : ");
        int n = sc.nextInt();
        if(n>25){
            System.out.println("Limit Exceded");
            return;
        }

        int sub = 0;

        for(int i =0; i<n; i++){
            System.out.print("Enter number: ");
            int input = sc.nextInt();            
            if(i==0){
                sub = input;
            }
            else{
                sub = sub - input;
            }

            if (sub > Integer.MAX_VALUE || sub < Integer.MIN_VALUE) {
            System.out.println("Limit Exceeded");
            return;
        }

        }
        System.out.println(sub);
    }

    //Multiplication Method
    public static void Multiplication(){   
        System.out.println("------Multiplication------");
        
        System.out.print("Enter the number of numbers : ");
        int n = sc.nextInt();
        if(n>25){
            System.out.println("Limit Exceded");
            return;
        }

        int mul = 1;

        for(int i =0; i<n; i++){
            System.out.print("Enter number: ");
            int input = sc.nextInt();            
            mul *=input;

            if (mul > Integer.MAX_VALUE || mul < Integer.MIN_VALUE) {
            System.out.println("Limit Exceeded");
            return;
        }

        }
        System.out.println(mul);
    }

    //Division Method
    public static void Division(){
        System.out.println("------Division------");

        System.out.print("Enter numerator (top number): ");
        double num = sc.nextInt();

        System.out.print("Enter denominator (bottom number): ");
        double den = sc.nextInt();

        if(den == 0){
            System.out.println("undefined");
            return;            
        }
        else if (num == 0){
            System.out.println(0);
            return;
        }
        else{
            double result = num/den;
            if (result > Double.MAX_VALUE || result < Double.MIN_VALUE) {
            System.out.println("Limit Exceeded");
            return;
        }
            System.out.println(result);            
        }        
    }

    //Power Method
    public static void Power(){
        System.out.println("------Power------");

        System.out.print("Enter power value: ");
        double power = sc.nextInt();

        System.out.print("Enter the number: ");
        double number = sc.nextInt();

        double result = Math.pow(number, power);
        System.out.println(result);
    }

    //SquareRoot Method
    public static void SquareRoot(){
        System.out.println("------SquareRoot------");

        System.out.print("Enter the Number: ");
        double Number = sc.nextInt();

        if(Number<0){
            System.out.println("undefined");
            return;
        }

        double result = Math.sqrt(Number);
        System.out.println(result);
    }
    public static void main(String [] args){

        boolean m = true;
        while(m == true){
            //calculator Options
            System.out.println("------Calculator------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Squareroot");
            System.out.println("7. Exit");
            System.out.print("Enter the index value to choose: ");

            int index = sc.nextInt();
            //switch loop
            switch(index){
                case 1:
                    Addition();
                    break;

                case 2:
                    Subtraction();
                    break;

                case 3:
                    Multiplication();
                    break;

                case 4:
                    Division();
                    break;

                case 5:
                    Power();
                    break;

                case 6:
                    SquareRoot();
                    break;

                case 7:
                    m = false;
                    System.out.println("Thank you for using the calculator. Goodbye!");
                    break;               

        }
        }
        
    }
}