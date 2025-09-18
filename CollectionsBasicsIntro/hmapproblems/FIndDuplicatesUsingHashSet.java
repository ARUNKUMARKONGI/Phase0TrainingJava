import java.util.*;

public class FindDuplicatesUsingHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        
        HashSet<Integer> seen = new HashSet<>();
        LinkedHashSet<Integer> duplicates = new LinkedHashSet<>();
        
        for(int x : arr) {
            if(!seen.add(x)) {
                duplicates.add(x);
            }
        }
        
        for(int x : duplicates) {
            System.out.print(x + " ");
        }
    }
}
/* 8
 * input=4 3 3 4 2 1 56 2
 * output=3 4 2
 */