package Arrays1D2DProblems;
import java.util.*;
public class missingnumber1ton {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        int n = sc.nextInt(); 
        int[] nums = new int[n - 1]; // Since one number is missing

    
        for (int i = 0; i < n - 1; i++) {
            nums[i] = sc.nextInt();
        }


        int totalSum = n * (n + 1) / 2;  
        //bracket (n+1) evaluated then multiplied with n then /2

 
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
 * we need to enter 3 input only 1 2 3
 * missing number is 4
 * total sum of natural numbers upto 4 is 10 (1,2,3,4)
 * actual array sum is 6 so 10-6=4
 */