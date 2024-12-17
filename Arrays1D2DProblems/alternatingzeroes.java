package Arrays1D2DProblems;

import java.util.*;

public class alternatingzeroes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }

        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (arr[i] != i % 2) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

/* 

For even indices, the value should be 0.
For odd indices, the value should be 1. */