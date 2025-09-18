package hmapproblems;

import java.util.*;

public class Uniqueelementssort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (String s : input) {
            int num = Integer.parseInt(s);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        TreeSet<Integer> result = new TreeSet<>();
        for (int key : freq.keySet()) {
            if (freq.get(key) >= 1 ) {
                result.add(key);
            }
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
