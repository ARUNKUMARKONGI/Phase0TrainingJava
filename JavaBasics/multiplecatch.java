import java.sql.DriverManager;
import java.util.InputMismatchException;
import java.util.Scanner;

public class multiplecatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=a/b;
        int result=Integer.parseInt("abcd");
        System.out.println("div of a and b is: "+res);
        }catch(InputMismatchException e){
            System.out.println("pls enter only integer values");
        }catch(ArithmeticException e){
            System.out.println("you are trying to divide by zero");
        }catch(NumberFormatException e){
            System.out.println("u r trying to convert string to int");
        }
        
    }
}
