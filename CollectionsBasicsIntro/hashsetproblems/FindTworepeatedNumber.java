package CollectionsBasicsIntro.hashsetproblems;
import java.util.*;

import java.util.*;

public class FindTworepeatedNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                result.add(num);
            } else {
                seen.add(num);
            }
        }

        System.out.println("Repeated numbers: " + result);
    }
}


