package LinkedListProblems;
import java.util.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original Linked List:");
        System.out.println(list);

       
        reverseLinkedList(list);

        System.out.println("Reversed Linked List:");
        System.out.println(list);
    }

    public static void reverseLinkedList(LinkedList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            Integer temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
        }
    }
}


/* For tasks like frequent insertions and deletions at both ends, the inbuilt LinkedList is often the better choice,
 while custom implementations 
might be preferred for educational purposes or highly specialized use cases. */