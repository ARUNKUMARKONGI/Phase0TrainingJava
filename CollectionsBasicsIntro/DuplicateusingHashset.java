package CollectionsBasicsIntro;
import java.util.*;
public class DuplicateusingHashset {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] nums = new int[size];
            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < size; i++) {
                nums[i] = scanner.nextInt();
            }

            Set<Integer> numSet = new HashSet<>();
            int duplicate = -1;

            for (int num : nums) {
                if (numSet.add(num)==false) {
                    duplicate = num;
                    break;
                }
            }

            if (duplicate != -1) {
                System.out.println("Duplicate number: " + duplicate);
            } else {
                System.out.println("No duplicate found.");
            }
        }
    }
