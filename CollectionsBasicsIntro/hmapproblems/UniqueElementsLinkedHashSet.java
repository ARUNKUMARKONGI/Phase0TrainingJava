import java.util.*;

public class UniqueElementsLinkedHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(String s : input) set.add(Integer.parseInt(s));
        for(int x : set) System.out.print(x + " ");
    }
}


/* import java.util.*;

public class UniqueIgnoreOrderHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        HashSet<Integer> set = new HashSet<>();
        for(String s : input) set.add(Integer.parseInt(s));
        for(int x : set) System.out.print(x + " ");
    }
}

import java.util.*;

public class UniqueElementsHashMapOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        HashMap<Integer, Integer> map = new HashMap<>();
        for(String s : input) {
            int num = Integer.parseInt(s);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key : map.keySet()) {
            System.out.print(key + " ");
        }
    }
}

 */

 /* input= 4 3 3 4 1
 * output= 4 3 1
 */