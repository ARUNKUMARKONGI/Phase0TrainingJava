import java.util.*;
class VMSfiletracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] ignored = new int[m];
            int[] tracked = new int[k];
            for(int i=0; i<m; i++) ignored[i] = sc.nextInt();
            for(int i=0; i<k; i++) tracked[i] = sc.nextInt();
            int both = 0, neither = 0;
            for(int i=1; i<=n; i++){
                boolean inIgnored = false, inTracked = false;
                for(int j=0; j<m; j++) 
                if(ignored[j]==i) inIgnored = true;
                for(int j=0; j<k; j++)
                 if(tracked[j]==i) inTracked = true;
                if(inIgnored && inTracked) both++;
                if(!inIgnored && !inTracked) neither++;
            }
            System.out.println(both+" "+neither);
        }
    }
}

/* using hashset
 * 
 * import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            Set<Integer> ignored = new HashSet<>();
            Set<Integer> tracked = new HashSet<>();
            for(int i=0; i<m; i++) ignored.add(sc.nextInt());
            for(int i=0; i<k; i++) tracked.add(sc.nextInt());
            // Set<Integer> intersection = new HashSet<>(ignored);
            // intersection.retainAll(tracked);
            // int both = intersection.size();
            int both=0;
            int neither = 0;
            for(int i=1; i<=n; i++){
                if(ignored.contains(i) && tracked.contains(i)) both++;
                if(!ignored.contains(i) && !tracked.contains(i)) neither++;
            }
            System.out.println(both+" "+neither);
        }
    }
}


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            Set<Integer> ignored = new HashSet<>();
            Set<Integer> tracked = new HashSet<>();
            for(int i=0; i<m; i++) ignored.add(sc.nextInt());
            for(int i=0; i<k; i++) tracked.add(sc.nextInt());
            Set<Integer> intersection = new HashSet<>(ignored);
            intersection.retainAll(tracked);
            int both = intersection.size();
            int neither = 0;
            for(int i=1; i<=n; i++){
                if(!ignored.contains(i) && !tracked.contains(i)) neither++;
            }
            System.out.println(both+" "+neither);
        }
    }
}
1
4 2 2
1 2
3 2
Explanation
N = 4 → Files: {1, 2, 3, 4}
Ignored = {1, 2}
Tracked = {3, 2}
Tracked & Ignored → {2} → Count = 1
Untracked & Unignored
------------------------------
Unignored = {3, 4}
Untracked = {1, 4}

Common = {4} → Count = 1

output= 1 1 
both means tracked and ignored
neither means untracked and unignored

 */