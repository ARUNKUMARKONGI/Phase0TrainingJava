package Arrays1D2DProblems;
import java.util.*;
public class SegmentKeySearch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int flag = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == x) {
                    flag = 1;
                }
                if ((i + 1) % k == 0 || i == n - 1) {
                    if (flag == 0) {
                        System.out.println(false);
                        return;
                    }
                    flag = 0;
                }
            }
            System.out.println(true);
        }
    }
    
