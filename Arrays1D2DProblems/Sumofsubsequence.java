package Arrays1D2DProblems;

import java.util.*;

public class Sumofsubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        long sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        long res = 1L << (n - 1); // Equivalent to 2^(n-1) long res = (long) Math.pow(2, n - 1);
        
        System.out.println(sum * res);
        sc.close();
    }
}
