package Arrays1D2DProblems;
import java.util.*;
public class missingnumberfrom0ton {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];  
     
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int totalSum = n * (n + 1) / 2;

        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }

        int missingNumber = totalSum - arraySum;

        System.out.println("Missing number: " + missingNumber);
    }
}
/* 
 * N=4
 * we need to enter 4 inputs  0 1 2 3 since considering zero
 * missing number is 4
 * total sum of natural numbers upto 4 is 10 (1,2,3,4)
 * actual array sum is 6 so 10-6=4
 */

