
/* Input: arr = [1, 3, 5, 4, 2]
output=True

input=3 2 1 0
output=false

input=1 2 3 4 5
output=false

A valid bitonic sequence must have at least one element before and one element after the peak.

its increasing upto certain element and then decreases
*/

package SIProblems;
import java.util.*;
public class bitonicsequence {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        if (N < 3) {
            System.out.println(false);
            return;
        }

        int i = 0;

        while (i < N - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == N - 1) {
            System.out.println(false);
            return;
        }

        while (i < N - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        System.out.println(i == N - 1);
    }
}

