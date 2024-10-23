public class CustomStack {
    private int[] st;
    private int top;
    private int capacity;

    public CustomStack(int size) {
        st = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow: Cannot push " + value);
        } else {
            st[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop");
            return -1;
        } else {
            return st[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return st[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements:\n");
            for (int i = top; i >= 0; i--) {
                System.out.println(st[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Peek element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        stack.display();

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack size: " + stack.size());

        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70); 
     
        stack.display();
    }
}





/* public void push(int x) {
    if (top == SIZE - 1) {
        System.out.println("Stack Overflow!!");
        return;
    } else {
        top++;
        mainStack[top] = x;
    }

    if (minTop == -1 || x <= minStack[minTop]) {
        minTop++;
        minStack[minTop] = x;
    }
} */