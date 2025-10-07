import java.util.Scanner;
public class Fibanacci_Series_Sum_Nth_Term{
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci Series:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int f = fib(i);
            System.out.print(f + " ");
            sum += f;
        }
        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println(n + "th Fibonacci number = " + fib(n-1));
    }
}
