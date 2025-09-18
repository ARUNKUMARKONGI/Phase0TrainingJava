import java.util.Scanner;
public class fibonacci_sum_series {
    static int nth_fibonacci(int n) {
        if (n <= 1)
            return n;
        return nth_fibonacci(n - 1) + nth_fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print("Fibonacci Series: ");
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int val = nth_fibonacci(i);
            System.out.print(val + " ");
            sum += val;
        }
        
        int nth = nth_fibonacci(n - 1);
        
        System.out.println("\nNth Fibonacci is: " + nth);
        System.out.println("Sum of Fibonacci terms: " + sum);
    }
}
