import java.util.Scanner;

public class TrailingZeroesUsingFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer n: ");
        int n = scanner.nextInt();
        
        long factorial = calculateFactorial(n);
        int trailingZeroes = countTrailingZeroes(factorial);
        
        System.out.println("Number of trailing zeroes in " + n + "! is: " + trailingZeroes);
        
        scanner.close();
    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    
    public static int countTrailingZeroes(long number) {
        int count = 0;
        while (number > 0) {
            if (number % 10 == 0) {
                count++;
            } else {
                break; 
            }
            number /= 10; 
        }
        return count;
    }
}
