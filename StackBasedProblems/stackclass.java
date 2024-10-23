import java.util.Stack;

public class stackclass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println("Stack after pushing elements: " + stack);
        
     
        int topElement = stack.peek();
        System.out.println("Top element (peek): " + topElement);
        
      
        System.out.println("Popping elements from the stack:");
        while (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println("Popped element: " + poppedElement);
            System.out.println("Current stack: " + stack);
        }
     
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        }
    }
}

/* in general inbuilt stack is optimized and can be used in problem solving
 unless if they ask to use custom class and not depend on inbuilt class
 */