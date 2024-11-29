package Arrays1D2DProblems;
import java.util.*;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input
        int n = sc.nextInt(); // size of the array
        int d = sc.nextInt(); // number of left rotations
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }
        
        d = d % n;
        
        for (int i = d; i < n; i++) {
           System.out.print(arr[i]+ " ");
        }
        
        for (int i = 0; i < d; i++) {
            System.out.print(arr[i]+ " ");
        }
        //OR we can do using single loop

        /* for (int i = 0; i < n; i++) {
            System.out.print(arr[(i + d) % n] + " ");
        } */
        sc.close();
    }
}



/* 
 if array is [1,2,3] and d=5 

 after doing the left rotation of array 5 times: 

 the array will be [3,1,2] 

 now instead of doing left rotation 5 times: we can
 take d= d%n which is d=5%3 hence d=2.

 so doing 2 left rotations is sufficient.
 */



/* import java.util.*;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input
        int n = sc.nextInt(); // size of the array
        int d = sc.nextInt(); // number of left rotations
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        d = d % n;
        
        int[] rotatedArr = new int[n];
        
        for (int i = 0; i < n; i++) {
            rotatedArr[i] = arr[(i + d) % n];
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
        
        sc.close();
    }
} */


/* for right shift */