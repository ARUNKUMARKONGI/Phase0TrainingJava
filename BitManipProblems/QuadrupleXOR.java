package LoopsBitManipulationNumberBasedProblems;

import java.util.HashMap;
import java.util.Map;

public class QuadrupleXOR {
    
    public static void main(String[] args) {
        // Sample input
        int[][] A = {{31, 8, 28, 10}, {27, 21}, {49, 73, 58, 30, 72, 44, 78, 23}};
        int[][] B = {{18, 7, 22, 5}, {39, 40}, {9, 40, 65, 92, 42, 87, 3, 27}};
        int[][] C = {{16, 25, 20, 14}, {64, 77}, {29, 40, 12, 3, 69, 9, 57, 60}};
        int[][] D = {{39, 9, 34, 19}, {36, 5}, {33, 99, 78, 16, 35, 97, 26, 12}};

        int T = 3; // Number of test cases
        int[] sizes = {4, 2, 8}; // Sizes of the arrays for each test case

        // Run the algorithm for each test case
        for (int t = 0; t < T; t++) {
            System.out.println(countQuadruples(A[t], B[t], C[t], D[t], sizes[t]));
        }
    }

    public static int countQuadruples(int[] A, int[] B, int[] C, int[] D, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        // Step 1: Store all possible XOR results of A[i] ^ B[j]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int xorAB = A[i] ^ B[j];
                map.put(xorAB, map.getOrDefault(xorAB, 0) + 1);
            }
        }
        
        // Step 2: Check for each pair C[k] ^ D[l] and look for its opposite in the map
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int xorCD = C[i] ^ D[j];
                if (map.containsKey(xorCD)) {
                    count += map.get(xorCD);
                }
            }
        }

        return count;
    }
}
