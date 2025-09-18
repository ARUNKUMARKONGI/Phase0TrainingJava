package CollectionsBasicsIntro.hmapproblems;

import java.util.*;

public class FindDuplicatesFirstcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        
        HashMap<Integer, Integer> freq_map = new HashMap<>();
        LinkedHashSet<Integer> duplicates = new LinkedHashSet<>();
        
        for(int x : arr) {
            freq_map.put(x, freq_map.getOrDefault(x, 0) + 1);
            if(freq_map.get(x) >1) {
                duplicates.add(x);
            }
        }
        
        for(int x : duplicates) {
            System.out.print(x + " ");
        }
    }
}



/* input= 4 3 3 4 1
 * output= 3 4
 */