// import java.util.Scanner;

// public class Main {

//     public static int countSquares(int n, int i) {
//         if (i * i > n) {
//             return 0;
//         }
//         return 1 + countSquares(n, i + 1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(countSquares(n, 1));
//     }
// }
import java.util.Scanner;

public class recursivesqrtfloor {

    public static int recursiveSqrtFloor(int n, int low, int high) {
        if (low > high) return high;

        int mid = (low + high) / 2;
        if (mid * mid == n) {
            return mid;
        } else if (mid * mid < n) {
            return recursiveSqrtFloor(n, mid + 1, high);
        } else {
            return recursiveSqrtFloor(n, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = recursiveSqrtFloor(n, 1, n);
        System.out.println(ans);
    }
}
