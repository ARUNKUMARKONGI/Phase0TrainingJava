package BinarySearchBasedProblems;
import java.util.Arrays;
public class findlastoccrruence {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4};
        int x = 5;

        int[] result = findFirstAndLast(arr, x);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findFirstAndLast(int[] arr, int x) {
        int first = findFirstOccurrence(arr, x);
        int last = findLastOccurrence(arr, x);

        // If x is not found
        if (first == -1) {
            return new int[]{-1};
        }

        return new int[]{first, last};
    }

    public static int findFirstOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x) {
                result = mid;  // Update result and keep searching on the low side
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static int findLastOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x) {
                result = mid;  // Update result and keep searching on the high side
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
