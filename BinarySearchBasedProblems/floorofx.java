package BinarySearchBasedProblems;
/* find floor of x in a given array for t queries  */
import java.util.*;
public class floorofx {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int t=sc.nextInt();
        while(t-- >0){
            int x=sc.nextInt();
            int l=0;
            int r=n-1;
            int ans=-1;
            while(l<=r){
                int mid=(l+r)/2;
                if(a[mid]<=x){
                    ans=a[mid];
                    l=mid+1;
                } else {
                    r=mid-1;
                }
            }
            System.out.println(ans);
        }
    }
}

/* what is floor of x: The floor of x in an array is the greatest element 
in the array that is less than or equal to x. 
If no such element exists, the floor is considered to be -1.
 sample input: 
6
2 8 4 10 5 1
4
6
3
11
0
output:
5
2
10
-1
Explaination:
For x=6, the floor is 5 (greatest element ≤ 6). 
For x=3, the floor is 2 (greatest element ≤ 3).
For x=11, the floor is 10 (greatest element ≤ 11).
For x=0, there is no element ≤ 0, so the floor is -1
 */