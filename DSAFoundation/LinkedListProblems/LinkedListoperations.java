package LinkedListProblems;
import java.util.LinkedList;
import java.util.ListIterator; 

public class LinkedListoperations{
    public static void main(String[] args) {
        // Creating an object of the LinkedList class
        LinkedList<Integer> ll = new LinkedList<>();
        /* for linked list operations deque is not efficient and doesnt support
         enough functions.
         */

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(2,100);

        System.out.println("Current elements: " + ll);
        ListIterator<Integer> itr = ll.listIterator(2); 
  
        // Iterating through the created list from the position 
        System.out.println("The list is as follows:"); 
        while(itr.hasNext()){ 
           System.out.println(itr.next()); 
        } 

    
        int indexToRemove = 2; // 3rd element (0-based index)
        int removedElement = ll.get(indexToRemove); // Store the removed element
        ll.remove(indexToRemove); // Remove the 3rd element

        System.out.println("Removed the 3rd element: " + removedElement);

        // Insert a new element at the 3rd position
        int newElement = 100;
        ll.add(indexToRemove, newElement); // Insert at the 3rd position

        // Display final elements
        System.out.println("Final elements after reinserting the new element: " + ll);

        // Additional operations to demonstrate LinkedList methods
        ll.remove(Integer.valueOf(2)); // Remove element by value
        ll.remove(3); // Remove element at index 3
        ll.removeFirst(); // Remove the first element
        ll.removeLast(); // Remove the last element

        System.out.println("Elements after additional removals: " + ll);
    }
}
