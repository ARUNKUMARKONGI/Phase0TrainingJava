package QueueBasedProblems;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        
     /* we can use add method also to insert only difference is add throws Illegal state exception
    if we there is no space.
    whereas offer returns false. */

        System.out.println("Queue after enqueueing elements: " + queue);
        

        int frontElement = queue.peek();
        System.out.println("Front element (peek): " + frontElement);
        

        System.out.println("Dequeuing elements from the queue:");
        while (!queue.isEmpty()) {
            int dequeuedElement = queue.poll();
            System.out.println("Dequeued element: " + dequeuedElement);
            System.out.println("Current queue: " + queue);
        }
        
        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
        }
    }
}
