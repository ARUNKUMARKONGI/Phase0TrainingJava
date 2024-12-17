import java.util.Arrays;
import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        Arrays.sort(arr);
        
        int i = 0, j = n - 1;
        while (i < j) {
            int currentSum = arr[i] + arr[j];
            if (currentSum == target) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                i++;
                j--;
            } else if (currentSum < target) {
                i++;
            } else {
                j--;
            }
        }
    }
}

// O(nlogn)
//2 pointer: O(n/2)
// in general O(nlogn)
//space complexity: O(1)