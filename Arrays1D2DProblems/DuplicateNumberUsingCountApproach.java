package Arrays1D2DProblems;
import java.util.Scanner;

public class DuplicateNumberUsingCountApproach {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the length of the array: ");
            int n = scanner.nextInt();
            int[] nums = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            int result = findDuplicate(nums);
            System.out.println("The repeated number is: " + result);
        }
        public static int findDuplicate(int[] nums) {
            int len = nums.length;
            int[] cnt = new int[len];
            for (int i = 0; i < len; i++) {
                cnt[nums[i]]++;
                if (cnt[nums[i]] > 1) {
                    return nums[i];
                }
            }
            return 0;
        }
    }



//this approach takes extra count memory space complexity O(n)

/* public static int findDuplicate(int[] nums) {
    HashSet<Integer> seen = new HashSet<>();  //hashset takes O(1) for lookup whereas arraylist uses O(n)
    // ArrayList<Integer> seen = new ArrayList<>();
    for (int num : nums) {
        // Check if the number has been seen before
        if (seen.contains(num)) {
            return num; // Return the duplicate number
        }
        seen.add(num); // Add the number to the set
    }

    return -1; // Return -1 if no duplicate is found
}
} */

// ArrayList maintains the insertion order i.e order of the object in which they are inserted. HashSet is an unordered collection and doesn't maintain any order. ArrayList 
//allows duplicate values in its collection. On other hand duplicate elements are not allowed in Hashset.