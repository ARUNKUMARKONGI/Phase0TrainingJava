package CollectionsBasicsIntro;

import java.util.*;

public class HashsetBasics3 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(100);
        set1.add(12);
        set1.add(200);
        set1.add(50);
        set1.add(10);
        System.out.println("Original Hash Set: " + set1);
        //Collections.reverse(set1); //reverse doesnt work on hashset

        

        LinkedList<Integer> lset = new LinkedList<>(set1);
        Iterator<Integer> it = lset.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}