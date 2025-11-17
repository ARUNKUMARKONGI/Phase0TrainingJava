package Arrays1D2DProblems;
import java.util.Scanner;


public class missingnumberusingxor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array (n-1 elements)
        int n = sc.nextInt();
        int[] nums = new int[n - 1];  // Array size n-1 (with 1 number missing)

        // Input the array elements
        for (int i = 0; i < n - 1; i++) {
            nums[i] = sc.nextInt();
        }

        // XOR all numbers from 1 to n
        int xorTotal = 0;
        for (int i = 1; i <= n; i++) {
            xorTotal ^= i;
        }

        // XOR all elements in the given array
        int xorArray = 0;
        for (int num : nums) {
            xorArray ^= num;
        }
       /*  int xorArray = 0;
        for (int i = 0; i < nums.length; i++) {
             xorArray ^= nums[i];
            } */

        // The missing number is the result of xorTotal ^ xorArray
        int missingNumber = xorTotal ^ xorArray;

        // Output the missing number
        System.out.println("Missing number: " + missingNumber);
    }
}

/* 5
1 2 3 5
xor from 1 to 5:1⊕2⊕3⊕4⊕5=1⊕2⊕3⊕4⊕5=1
XOR all numbers in the array (1, 2, 3, 5):
1⊕2⊕3⊕5=5 

missingNumber=xorTotal⊕xorArray=1⊕5=4 

*/