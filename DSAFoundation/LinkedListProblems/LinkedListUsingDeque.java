package LinkedListProblems;
import java.util.Deque;
import java.util.ArrayDeque;
// import java.util.LinkedList;

public class LinkedListUsingDeque {
    public static void main(String[] args) {
        // Creating a Deque that acts as a Linked List
        Deque<String> deque = new ArrayDeque<>(30); //initialcapacity30
     

        // Adding elements at the end (similar to LinkedList's addLast)
        deque.addLast("Car");
        deque.addLast("Bike");
        deque.addLast("Bus");
        // Adding elements at the front (similar to LinkedList's addFirst)
        deque.addFirst("Train");
 

        // Traversing the Deque (Linked List)
        System.out.println("Elements in deque: " + deque);

        // Accessing the first and last elements
        System.out.println("First element: " + deque.peekFirst());  // Similar to getFirst()
        System.out.println("Last element: " + deque.peekLast());    // Similar to getLast()

        // Removing elements from both ends
        deque.pollFirst();  
        deque.pollLast();   

        // Display after removal
        System.out.println("Deque after removing first and last: " + deque);

        // Check if deque is empty
        if (deque.isEmpty()) {
            System.out.println("The deque is empty.");
        } else {
            System.out.println("The deque is not empty.");
        }
    }
}

   /* LinkedList<String> d= new LinkedList<String>();
    * left side is the interface right side is the class.
    Queue<String> d=new LinkedList<>();// 
      here since interface is the queue it can only support queue functions like add and remove.
    Queue<String> d= new ArrayDeque<String>(); //this is more efficient

    Deque<String> d=new ArrayDeque<String>(); 
    here inteface is Deque hence it can support addFirst PollLast etc functions.

    Feature	           ArrayDeque	                   LinkedList
    ----------          ---------                       ------------------
   Memory Overhead	   Lower (contiguous memory)	   Higher (node references)
  Add/Remove           Time ComplexityO(1)(amortized)	O(1)
Access Time Complexity	O(n) (iterative)	            O(n) (iterative)
  Cache Performance	    Better (contiguous)	             Worse (scattered)
  
    */