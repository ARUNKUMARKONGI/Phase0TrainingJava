package hmapproblems;

import java.util.*;

public class UniqueElementswithoutduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        HashMap<Integer, Integer> freq_map = new HashMap<>();
        for(int x : arr) {
            freq_map.put(x, freq_map.getOrDefault(x,0) + 1);
        }
        for(int x : arr) {
            if(freq_map.get(x) == 1) System.out.print(x + " ");
        }
    }
}
/* n=5
 * input=4 3 2 2 1
 * output=4 3 1
 */