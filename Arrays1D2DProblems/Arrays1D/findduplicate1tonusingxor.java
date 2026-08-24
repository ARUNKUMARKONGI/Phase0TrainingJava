package Arrays1D2DProblems.Arrays1D;

import java.util.Scanner;

import java.util.*;

public class findduplicate1tonusingxor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array_xor = 0;
        int range_xor = 0;

        for (int i = 0; i < n+1; i++) {
            array_xor ^= sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            range_xor ^= i;
        }

        int duplicate = array_xor ^ range_xor;

        System.out.println(duplicate);
    }
}

//sample test case
//input=5
//1 2 3 4 2 5
//output=2

//we need to enter 6 values since one number is duplicate