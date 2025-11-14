package hmapproblems;
import java.util.*;
public class FindFrequencywithQueries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = s.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                int x = arr[i];
                if(map.containsKey(x))
                        map.put(x, map.get(x)+1);
                else map.put(x,1);
            }
            int q = s.nextInt();
            while(q-- > 0){
                int key = s.nextInt();
                if(map.containsKey(key))
                 System.out.println(map.get(key));
                else System.out.println(0);
            }
        }
    }
}


/* 1 (t test cases)
5 (array size)
2 3 3 5 2
3 (queries)
3 (search key)
2 (search key)
4 (search key)
Output:
2   
2
0 */