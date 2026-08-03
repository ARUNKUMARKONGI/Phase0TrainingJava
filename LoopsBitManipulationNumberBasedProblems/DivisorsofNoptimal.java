package LoopsBitManipulationNumberBasedProblems;

import java.util.Scanner;

public class DivisorsofNoptimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Divisors of " + n + " are:");
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " "); // First divisor
                if (i != n / i) {
                    System.out.print(n / i + " "); // Second divisor
                }
            }
        }
    }
}

/* Let n = 28.
Divisor Pairs:
The divisors of 28 come in pairs:
1 × 28 = 28
2 × 14 = 28
4 × 7 = 28

When we iterate up to √28 ≈ 5.29, we find:
1. For i = 1, 28 / 1 = 28. Print 1 and 28.
2. For i = 2, 28 / 2 = 14. Print 2 and 14
3. For i = 4, 28 / 4 = 7. Print 4 and 7.
Why It’s Efficient:

Instead of checking all numbers from 1 to 28, we only loop up to √28 and 
derive the divisor pairs. This halves the number of iterations in most cases, saving time.

With i != n / i (suppose n=36)
When i = 6:
Since i == n / i, we print 6 only once.
6==36/6=6 since both divisor and quotient same we print 6 only once

take n=31
When i = 1:
Since i != n / i, we print 1 and 31.
1 != 31/1=31 since both divisor and quotient are different we print both



print divisors of n in sorted order
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n / i; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");

                if(i != n / i)
                {
                    list.add(n / i);
                }
            }
        }

        for(int i = list.size() - 1; i >= 0; i--)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}
*/