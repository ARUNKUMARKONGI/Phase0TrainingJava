package LinkedList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class DeleteMiddle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> ll = new LinkedList<>();

        int numElements = scanner.nextInt();

        for (int i = 0; i < numElements; i++) {
            ll.add(scanner.nextInt());
        }

        System.out.println("Original Linked List:");
        System.out.println(ll);

        deleteMiddle(ll);

        System.out.println("Linked List after deletion of middle:");
        System.out.println(ll);

        scanner.close();
    }

    public static void deleteMiddle(LinkedList<Integer> list) {
        if (list == null || list.size() <= 1) {
            return;
        }

        int mid = list.size() / 2;
        // list.remove(middleIndex);

        ListIterator<Integer> iterator = list.listIterator();

        for (int i = 0; i < mid+1; i++) {
            iterator.next();
        }

        iterator.remove();
    }
}









/* The list.remove(mid) operation has to traverse the list to find the element at the specified index, 
which takes O(n) time complexity. On the other hand, 
using an Iterator to reach the middle element directly takes O(n/2) time complexity, which is more efficient.



private static void deleteMiddleElement(ll<Integer> list) {
        if (list == null || list.size() <= 1) {
            return;
         }


        int middleIndex = size / 2;

        list.remove(middleIndex);  //here it traverses index based so takes O(n)
    } */


/* deletions in the middle of the list are possible using ArrayDeque, 
but it is not as efficient as with a ll. Here's why:

Deletions in the Middle with ArrayDeque:
ArrayDeque is backed by a dynamically resizable array.
This means when you remove an element from the middle, all subsequent elements must be shifted to the left to fill the gap,
which has O(n) time complexity. Specifically:
You have to find the element at the middle, which requires linear traversal (O(n)).
After removal, the array must shift all elements after the removed element by one position (O(n)).
Deletions in the Middle with ll:
In a ll, elements are connected via pointers (or links). When you remove an element from the middle:
Traversal to find the element is also O(n).
However, once you find the element, removing it is O(1) because you 
only need to adjust the pointers of the neighboring nodes, without shifting any other elements. 


Use ArrayDeque when your use case focuses on stack, queue, or deque operations (front/back insertions/deletions).
Use ll when you need dynamic resizing and will perform frequent insertions or
 deletions in the middle of the list.*/
