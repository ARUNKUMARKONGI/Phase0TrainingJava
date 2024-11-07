package CollectionsBasicsIntro;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListBasics {
        public static void main(String[] args) {
            LinkedList<Integer> llist = new LinkedList<>();

            llist.add(5);
            llist.add(10);
            llist.add(15);
            llist.add(20);
            llist.add(10);

            System.out.println("Initial LinkedList: " + llist);

            llist.addFirst(2);
            llist.addLast(25);
            llist.add(3, 12);
            System.out.println("LinkedList after adding elements: " + llist);

            System.out.println("Element at index 2: " + llist.get(2));

            llist.set(1, 8);  
            System.out.println("LinkedList after updating element at index 1: " + llist);

            llist.removeFirst();
            llist.removeLast();
            llist.remove(Integer.valueOf(15)); 
            System.out.println("LinkedList after removing elements: " + llist);

            System.out.println("Does LinkedList contain 20? " + llist.contains(20));

            llist.removeFirstOccurrence(10);

            System.out.println(llist);
            llist.removeIf(n -> n % 2 == 0);
            System.out.println(llist);

           
        }
    }
