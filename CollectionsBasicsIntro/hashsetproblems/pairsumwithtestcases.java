package hashsetproblems;
import java.util.*;
public class pairsumwithtestcases {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i] = s.nextInt();
            int k = s.nextInt();
            HashSet<Integer> h = new HashSet<>();
            boolean found = false;
            for(int i=0;i<n;i++){
                int need = k - a[i];
                if(h.contains(need)){
                    found = true;
                    break;
                }
                h.add(a[i]);
            }
            if(found) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
/* also asked as pair sum problem such that i!=j  */