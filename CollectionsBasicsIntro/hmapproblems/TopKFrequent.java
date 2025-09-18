import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of array
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        // Step 1: Count frequencies
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }

        // Step 2: Find top K elements using only loops
        System.out.println("Output:");
        for (int i = 0; i < k; i++) {
            int maxFreq = -1;
            int chosenNum = Integer.MIN_VALUE;

            // Loop through map to find the number with highest freq
            for (int num : freqMap.keySet()) {
                int freq = freqMap.get(num);

                // Pick number with higher frequency
                // If tie, pick the LARGER number
                if (freq > maxFreq || (freq == maxFreq && num > chosenNum)) {
                    maxFreq = freq;
                    chosenNum = num;
                }
            }

            // Print the chosen number
            System.out.print(chosenNum + " ");

            // Remove from map so it's not chosen again
            freqMap.remove(chosenNum);
        }

        sc.close();
    }
}