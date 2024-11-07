package CollectionsBasicsIntro;

import java.util.HashSet;

public class HashsetBasics2 {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(100);
        set1.add(200);
        set1.add(50);
        System.out.println("Original Hash Set: " + set1);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(20);
        set2.add(40);
        set2.add(100);
        set1.retainAll(set2);
        System.out.println(set1);
        set2.clear();
        System.out.println(set2);

    }
}
