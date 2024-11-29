package CollectionsBasicsIntro.hmapproblems;

import java.util.HashMap;
import java.util.Scanner;

public class FindDuplicatesUsingHashmap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        for (var entry : map.entrySet())
            if (entry.getValue() > 1)
                System.out.println(entry.getKey() + " " + entry.getValue());
    }
}

