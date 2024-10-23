package QueueBasedProblems;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ReverseFirstKElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            deque.addLast(sc.nextInt());
        }

        int k = 3; 

        Deque<Integer> tempStack = new ArrayDeque<>();

        // Step 1: Push first k elements into the stack (to reverse them)
        for (int i = 0; i < k; i++) {
            tempStack.push(deque.pollFirst());
        }

        // Step 2: Add back elements from the stack to the deque (reversed)
        while (!tempStack.isEmpty()) {
            deque.addLast(tempStack.pop());
        }

        // Step 3: Rotate the remaining elements to the back of the deque to maintain their order
        for (int i = 0; i < deque.size() - k; i++) {
            deque.addLast(deque.pollFirst());
        }

        // Print the final deque
        System.out.println("Queue after reversing first " + k + " elements: " + deque);
    }
}







//following program we are using poll and add methods 
/* import java.util.*;

public class ReverseFirstKQueue {
	// Function to reverse first k elements of the queue
	public static void reverseFirstK(Queue<Integer> q, int k){
		Deque<Integer> d = new ArrayDeque<>();

		// Dequeue the first k elements of the queue and
		// push them onto a deque
		for (int i = 0; i < k; i++) {
			d.push(q.poll());
		}

		// Pop the elements from the deque and enqueue them
		// back into the queue
		while (!d.isEmpty()) {
			q.add(d.pop());
		}

		// Dequeue the remaining elements from the queue and
		// enqueue them back into the queue
		for (int i = 0; i < q.size() - k; i++) {
			q.add(q.poll());
		}
	}

	// Driver code.
	public static void main(String[] args){
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		q.add(90);
		q.add(100);

		int k = 5;

		// function call.
		reverseFirstK(q, k);

		while (!q.isEmpty()) {
			System.out.print(q.peek() + " ");
			q.poll();
		}
	}
} */
