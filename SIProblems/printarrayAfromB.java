/* Given two arrays, A and B, for each index 'i' in array B, print the 
corresponding element from array A if B[i] is within the range of A, otherwise print -1.

Constraints
----------
1 <= N <= 100
1 <= A[k] <= 1000
1 <= M <= 100
0 <= B[i] <= 1000
*/


package SIProblems;
import java.util.*;
public class printarrayAfromB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int[]arr2=new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            if(arr2[i]>=0 && arr2[i]<n)
            System.out.print(arr1[arr2[i]]+" ");
            else
            System.out.print("-1 ");
        }

    }
}

