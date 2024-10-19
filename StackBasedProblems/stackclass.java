import java.util.Stack;

public class stackclass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println("Stack after pushing elements: " + stack);
        
        // Peek at the top element
        int topElement = stack.peek();
        System.out.println("Top element (peek): " + topElement);
        
        // Pop elements from the stack
        System.out.println("Popping elements from the stack:");
        while (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println("Popped element: " + poppedElement);
            System.out.println("Current stack: " + stack);
        }
        
        // Check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        }
    }
}
