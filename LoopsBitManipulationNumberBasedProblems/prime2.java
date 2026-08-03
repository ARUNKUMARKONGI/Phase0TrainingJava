import java.util.Scanner;
  import java.util.*;
public class prime2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 1)
        {
            System.out.println("Not Prime");
            return;
        }

        boolean prime = true;

        for(int i = 2; i <= n / i; i++)
        {
            if(n % i == 0){
                prime = false;
                break;
            }
        }
        if(prime)
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}