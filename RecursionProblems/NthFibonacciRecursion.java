import java.util.Scanner;

public class NthFibonacciRecursion {
    static int nthFibonacci(int n) {
        if (n <= 1) 
            return n;
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nthFibonacci(i) + " ");
        }

        int result = nthFibonacci(n - 1);
        System.out.println("\nNth Fibonacci is: " + result);
    }
}



//iterative approach is better as recursion takes O(n) space for storing n function calls.
