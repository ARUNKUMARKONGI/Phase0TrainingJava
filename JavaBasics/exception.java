import java.util.*;
public class exception {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try{
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }catch(InputMismatchException e){
        System.out.println("invalid input:");
    }
}
}

/* import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (sc.hasNextInt()) {
                int b = sc.nextInt();
                int sum = a + b;
                System.out.println(sum);
            } else {
                System.out.println("invalid input");
            }
        } else {
            System.out.println("invalid input");
        }
    }
}
 */