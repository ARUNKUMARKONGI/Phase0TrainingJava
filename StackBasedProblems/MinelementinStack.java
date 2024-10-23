import java.util.Stack;

class MinStack {
    Stack<Integer> stack;       
    Stack<Integer> minStack;    
    
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }
 
    public void pop() {
        if (!stack.isEmpty()) {
            int removed = stack.pop();
            if (removed == minStack.peek()) {
                minStack.pop();
            }
        }
    }
    
    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        return -1;
    }
}

public class MinelementinStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        
        minStack.push(5);
        minStack.push(2);
        minStack.push(8);
        minStack.push(1);
        minStack.push(3);
        
        System.out.println("Minimum element in the stack: " + minStack.getMin());  // Should print 1
        
        minStack.pop();  // Pop element 3
        System.out.println("Minimum element after popping: " + minStack.getMin());  // Should print 1
        
        minStack.pop();  // Pop element 1
        System.out.println("Minimum element after popping: " + minStack.getMin());  // Should print 2
    }
}
