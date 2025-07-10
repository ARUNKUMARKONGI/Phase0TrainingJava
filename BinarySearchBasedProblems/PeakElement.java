package BinarySearchBasedProblems;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        

        int peakIndex = findPeakElement(arr, n);
        System.out.println("Peak element index: " + peakIndex);
        
        sc.close();
    }
    

    public static int findPeakElement(int[] nums, int n) {
        int low = 0;
        int high = n - 1;
        
        while (low < high) {
            int mid = (low + high) / 2;
            
            // Check if mid is greater than its next element
            if (nums[mid] > nums[mid + 1]) {
                high = mid;  // Continue searching in the left half
            } else {
                low = mid + 1;  // Continue searching in the right half
            }
        } 
        return low;             // 'low' will be the index of the peak element
    }
}
/* 

input=7
1 1 2 3 6 5 4
output=
Peak element index: 4

input=5
1 2 1 0 1
output=Peak element index: 1

A peak element is an element that is strictly greater than its neighbors.

The array does not need to be sorted; it can be unsorted. The key condition
 is that it must not be strictly monotonic (i.e., it should have both increasing and decreasing values).
 
 
  if ((mid == 0 || nums[mid] >= nums[mid - 1]) && (mid == n - 1 || nums[mid] >= nums[mid + 1])) {
                return mid; // mid is a peak
            }*/