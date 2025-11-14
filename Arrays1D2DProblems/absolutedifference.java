package Arrays1D2DProblems;

import java.util.*;

public class absolutedifference {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = s.nextInt();
            }
        }
        long primary = 0;
        long secondary = 0;
        for(int i=0;i<n;i++){
            primary += arr[i][i];
            secondary += arr[i][n-1-i];
        }
        long diff = primary - secondary;
        if(diff < 0) diff = -diff;
        System.out.println(diff);
    }
}
/* 
-10   0   5
 0   -5   0
 5    0  -5 
 
 primary=-20
 secondary=10 
-20 - 10= -30.. abs diff is 30

or      int diff = Math.abs(primary - secondary);
        System.out.print(diff);
*/