package hmapproblems;

import java.util.*;

public class UniqueElementsprintatleastonce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        HashSet<Integer> seen = new HashSet<>();
        for(int x : arr) {
            if(seen.contains(x)== false) {
                System.out.print(x + " ");
                seen.add(x);
            }
        }
    }
}
/* 
 * input=6 
 * 3 3 4 4 2 1
 * output= 3 4 2 1
 * 
 */