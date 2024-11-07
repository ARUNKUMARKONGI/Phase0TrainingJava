package SIProblems;
import java.util.*;
public class catalannumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N < 0) {
            System.out.println(0);
            return;
        }

        long catalan = 1;
        for (int i = 0; i < N; i++) {
            catalan = catalan * (2 * (2 * i + 1)) / (i + 2);
        }

        System.out.println(catalan);
    }
}


/* Cn=(2n)!/(n+1)!n!

​Cn+1= (2(2n+1))/(n+2) * Cn */
​


