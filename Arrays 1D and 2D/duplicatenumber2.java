package Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class duplicatenumber2 {
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
       
    /* public static int findDuplicate(int[] nums) 
    {
    HashSet<Integer> seen = new HashSet<>(); 
     //hashset takes O(1) 
    //for lookup whereas arraylist uses O(n)
    // ArrayList<Integer> seen = new ArrayList<>();
    for (int num : nums) {
        // Check if the number has been seen before
        if (seen.contains(num)) {
            return num; 
        }
        seen.add(num); 
    }

    return -1; 
}  */

public static int findDuplicate(int[] nums) 
{
HashSet<Integer> seen = new HashSet<>(); 
 //hashset takes O(1) 
//for lookup whereas arraylist uses O(n)
// ArrayList<Integer> seen = new ArrayList<>();
for (int num : nums) {
    // Check if the number has been seen before
    if (!seen.add(num)) {
        return num; 
    }
}

return -1; 
} 
}


//this approach takes extra count memory space complexity O(n)
// ArrayList maintains the insertion order i.e order of the object in which they are inserted. HashSet is an unordered collection and doesn't maintain any order. ArrayList 
//allows duplicate values in its collection. On other hand duplicate elements are not allowed in Hashset.