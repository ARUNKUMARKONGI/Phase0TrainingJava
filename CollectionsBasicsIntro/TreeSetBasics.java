package CollectionsBasicsIntro;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetBasics {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        set.add(3);
        set.add(100);
        System.out.println(set);
        System.out.println("Reverse Set: "+set.descendingSet());
        System.out.println("Head(less) Set: "+set.headSet(24));
        System.out.println("Head Set: "+set.headSet(12,true));
        System.out.println("SubSet: "+set.subSet(3,50)); //returns values between 3 to 50 excluding them
        System.out.println("SubSet: "+set.subSet(3,true,50,false)); //returns values including 3 but excluding 50
        System.out.println("Tail(greater) set: "+set.tailSet(15,false));
        System.out.println("Maximum : "+set.pollFirst());
        System.out.println("Minimum: "+set.pollLast());
            /*t.add(null);
            System.out.println(t);*/

        TreeSet<Integer> revset = new TreeSet<>(Comparator.reverseOrder());
        revset.addAll(set);
        System.out.println("reversed tree set: "+revset);

    }
}
/*TreeSet is based on the fact that null does not have a natural order
        and, therefore, cannot be placed in a well-defined position within the tree structure.*/