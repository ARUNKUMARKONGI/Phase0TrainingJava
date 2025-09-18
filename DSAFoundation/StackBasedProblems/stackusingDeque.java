import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class stackusingDeque {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        // Stack<Integer> stack = new Stack<>();//less efficient
        Scanner scanner = new Scanner(System.in);
 
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Push operation
                    System.out.print("Enter a number to push onto the stack: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                  
                    System.out.println(value + " pushed onto the stack.");
                    break;
                    
                case 2: // Pop operation
                    if (!stack.isEmpty()) {
                        int poppedValue = stack.pop();
                        System.out.println(poppedValue + " popped from the stack.");
                    } else {
                        System.out.println("Stack is empty. Cannot pop.");
                    }
                    break;
                    
                case 3: // Peek operation
                    if (!stack.isEmpty()) {
                        int topValue = stack.peek();
                        System.out.println("Top element is: " + topValue);
                    } else {
                        System.out.println("Stack is empty. Nothing to peek.");
                    }
                    break;

                case 4: // Display operation
                    if (!stack.isEmpty()) {
                        System.out.println("Stack elements in LIFO order:");
                        for (int element : stack) {
                            System.out.println(element);
                        }
                    
                    } else {
                        System.out.println("Stack is empty. Nothing to display.");
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}



/* Deque (Double-ended Queue) is an interface in Java that extends the Queue interface.
 It allows the insertion, removal, and access of elements from both ends (front and back). 
 Here Deque is an interface.
 ArrayDeque is class which is implementing the interface.

 ArrayDeque is a resizable-array implementation of the Deque interface. 
 It provides a way to store elements in a dynamic array that can grow as needed.
 
 
 Faster: Deque is Non-synchronized structures hence often perform better in 
 single-threaded scenarios because they do not incur the overhead of managing 
 locks or waiting for access. 
 Operations can be completed more quickly since there is no waiting involved.
 
 
 
 
 
                case 4: // Display operation alternative
                    if (!stack.isEmpty()) {
                        System.out.println("Stack elements in LIFO order:");
                        Integer[] elements = stack.toArray(new Integer[0]);
                        for (int i = elements.length - 1; i >= 0; i--) {
                            System.out.println(elements[i]);
                        }
                    } else {
                        System.out.println("Stack is empty. Nothing to display.");
                    }
                    break;*/