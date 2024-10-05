import java.util.InputMismatchException;
import java.util.Scanner;

public class singletrycatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=a+b;
        System.out.println("div of a and b is: "+res);
        }catch(InputMismatchException e){
            System.out.println("pls enter only integer values");
        }
        
        sc.close();
    }
}
