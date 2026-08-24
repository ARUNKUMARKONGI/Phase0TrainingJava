package LoopsBitManipulationNumberBasedProblems;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] divisors = new int[1000];
        int count = 0;

        // Find divisors using sqrt(n)
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors[count++] = i;

                // Add the paired divisor
                if (i != n / i) {
                    divisors[count++] = n / i;
                }
            }
        }

        // Sort only the elements containing divisors
        Arrays.sort(divisors, 0, count); 

        // Print divisors
        for (int i = 0; i < count; i++) {
            System.out.print(divisors[i] + " ");
        }

        sc.close();
    }
}
//using sqrt(n) we can find all the divisors of n in O(sqrt(n)) time complexity.
//use arraylist as well to store the divisors and then sort it.
//Collections.sort() can be used to sort the arraylist.