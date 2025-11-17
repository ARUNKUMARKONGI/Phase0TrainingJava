package Arrays1D2DProblems;

import java.util.Scanner;

public class PairsWithSumusingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int count = countPairsWithSumK(array, k);
        System.out.println("Number of pairs with sum " + k + ": " + count);
    }

    private static int countPairsWithSumK(int[] nums, int target) {
        int count = 0;
        int[] res = new int[10000];

        for (int num : nums) {
            int complement = target - num;
            count += res[complement];
            res[num]++;
        }

        return count;
    }
}

/* public static int countPairs(int[] nums, int target) {
    int count = 0;
    int n = nums.length;

 
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) { 
            if (nums[i] + nums[j] == target) {
                count++;
            }
        }
    }

    return count; */


   /*  for (int i = 0; i < nums.length; i++) {
        int num = nums[i];            
        int complement = target - num; 
        count += res[complement];    
        res[num]++;                
    } */