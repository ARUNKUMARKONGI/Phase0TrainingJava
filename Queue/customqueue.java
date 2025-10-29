import java.util.*;

public class customqueue {
    private int arr[];
    private int f, r, size, count;

    public customqueue(int size) {
        this.size = size;
        arr = new int[size];
        f = 0;
        r = -1;
        count = 0;
    }

    public void enqueue(int data) {
        if (count == size) {
            System.out.println("Queue Overflow");
            return;
        }
        r = (r + 1) % size;
        arr[r] = data;
        count++;
    }

    public int dequeue() {
        if (count == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int data = arr[f];
        f = (f + 1) % size;
        count--;
        return data;
    }

    public void display() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(arr[(f + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        int n = sc.nextInt();

        customqueue cq = new customqueue(n);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.display();
        System.out.println("Dequeued: " + cq.dequeue());
        cq.display();
        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60);
        cq.display();
    }
}
