/* Given an array, find two elements whose sum is equal to the sum of all 
the remaining elements.

Mathematically,

a + b = TotalSum - (a + b)
Rearranging,
2 × (a + b) = Total Sum
a + b = Total Sum / 2
So the problem becomes:
Find a pair whose sum is Total Sum / 2.

test case:
arr = [4, 6, 2, 8]
Total Sum
20
Required
20 / 2 = 10
Pair
2 + 8 = 10
Remaining elements
4 + 6 = 10

Condition satisfied.
*/
package Arrays1D2DProblems.Arrays1D;
import java.util.HashSet;
import java.util.Scanner;

public class array2elementssum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        if (sum % 2 != 0) {
            System.out.println("No Pair");
            return;
        }

        int target = sum / 2;

        HashSet<Integer> set = new HashSet<>();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            int need = target - arr[i];

            if (set.contains(need)) {

                System.out.println(need + " " + arr[i]);
                found = true;
                break;
            }

            set.add(arr[i]);
        }

        if (!found)
            System.out.println("No Pair");

          sc.close();
    }
  
}
//test case
// Input: 4 6 2 8
// Output: 2 8