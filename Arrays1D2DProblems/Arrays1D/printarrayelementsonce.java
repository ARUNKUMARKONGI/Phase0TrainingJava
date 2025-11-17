package Arrays1D2DProblems;
import java.util.*;
public class printarrayelementsonce {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        // HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        // System.out.println("Elements printed only once (duplicates removed):");
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            
            // Check if the element has appeared before in the array
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true; // Mark as duplicate
                    break;
                }
            }
            
            // Print the element if it is not a duplicate
            if (isDuplicate == false) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

/* better approach using hashset
-------------------------------
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (set.add(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        
        sc.close();
    } */