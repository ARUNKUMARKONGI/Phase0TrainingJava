package BinarySearchBasedProblems;

import java.util.*;
class cielofx {
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
                if(a[mid]>=x){
                    ans=a[mid];
                    r=mid-1;
                } else {
                    l=mid+1;
                }
            }
            System.out.println(ans);
        }
    }
}
/* ceil of x is the smallest element in the array that is greater than or equal to x.
If no such element exists, the ceil is considered to be -1.
 sample input:
 6
2 8 4 10 5 1
4
6
3
11
0
output:
8
4
-1
1
*/ 