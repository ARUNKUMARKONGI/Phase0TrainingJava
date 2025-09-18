import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);
        
        System.out.println("Original Stack: " + stack);
        
        sortStack(stack);
        
        System.out.println("Sorted Stack: " + stack);
        for (int i = stack.size() - 1; i >= 0; i--) {
                    System.out.print(stack.get(i)+" "); 
        }

            // System.out.println();
            // while (!stack.isEmpty()) {
            //     System.out.print(stack.pop()+" "); 
            // }
       
    }
    
    static void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        
        while (!stack.isEmpty()) {
            int current = stack.pop();
            
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }
            tempStack.push(current);
        }
        
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
