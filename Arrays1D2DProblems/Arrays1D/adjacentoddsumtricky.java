package Arrays1D2DProblems;
import java.util.*;
public class adjacentoddsumtricky {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = s.nextInt();
        int c_even = 0, c_odd = 0;
        for(int i=0;i<n;i++){
            if(a[i] % 2 == 0) c_even++;
            else c_odd++;
        }
        if(Math.abs(c_even - c_odd) <= 1) 
            // if the difference between the count of even and odd numbers is at most 1, we can rearrange them
        System.out.print("TRUE");
        else System.out.print("FALSE");
    }
}

/* Can you rearrange an array so that every adjacent pair has an odd sum? 
If possible print TRUE, else FALSE.”

test case example:
Input: 5
1 2 3 4 5
Output: TRUE
Explanation: We can rearrange the array as 1 2 3 4 5 or 3 2 1 4 5 etc.
 In all these cases, every adjacent pair has an odd sum.
 */
