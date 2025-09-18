package PatternProblems;
import java.util.*;
public class HollowInvertedLeftTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) { 
            for (int j = 1; j <= i; j++) { 
                if (j == 1 || j == i || i == n) { 
                    // Print '*' for first column, last column, or top row(i==n)
                    System.out.print("* ");
                } else {
                    // Print spaces for the hollow part
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
    }
}

/* example test case
 * n=5
 * * * * * *
 * *       *
 * *     *
 * *   *
 * * *
 * *
 * *
 * *
 * *
 * *
 * *
 */