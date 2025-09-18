package hmapproblems;

import java.util.*;

public class FindDuplicatesasPerInsertionOrderUsingHashmapHashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = input.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(input[i]);

        HashMap<Integer, Integer> freq_map = new HashMap<>();
        for (int x : arr) {
            freq_map.put(x, freq_map.getOrDefault(x, 0) + 1);
        }

        HashSet<Integer> printed = new HashSet<>();
        for (int x : arr) {
            if (freq_map.get(x) > 1 && !printed.contains(x)) {
                System.out.print(x + " ");
                printed.add(x);
            }
        }
    }
}
/* input= 4 3 3 4 1
 * output= 4 3
 */
