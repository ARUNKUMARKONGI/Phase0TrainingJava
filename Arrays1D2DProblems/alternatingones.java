package Arrays1D2DProblems;
import java.util.*;
public class alternatingones {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); 
            int[] arr = new int[n];
    
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }
    
            boolean flag = true;
    
            for (int i = 0; i < n; i++) {
                if (arr[i] != (i % 2==0?1:0)) {
                    flag = false;
                    break;
                }
            }
    
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
 /*    At even indices (i % 2 == 0), the value should be 1.
    At odd indices (i % 2 == 1), the value should be 0. */