import java.util.Stack;
    
public class StackRecursion {
    static void printStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        System.out.println(top);
        
        printStack(stack);
        
        stack.push(top); // Push back the element to maintain the original stack
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        System.out.println("Stack elements are:");
        printStack(stack);
        System.out.println("stack:");
        printStack(stack);
    }
}
