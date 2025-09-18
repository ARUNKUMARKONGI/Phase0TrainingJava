import java.util.Scanner;
public class fibonacci_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += fibonacci(i);
        }
        System.out.println("Sum: " + sum);
    }
    static int fibonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
