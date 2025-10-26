package QueueBasedProblems;

public class CustomArrayQueue {
    private int[] queue;
    private int f;
    private int r;
    private int capacity;
    private int size;

    public CustomArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.f = 0;
        this.r = -1;
        this.size = 0;
    }

    public void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        r = (r + 1) % capacity;
        queue[r] = item;
        size++;
        System.out.println("Enqueued: " + item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = queue[f];
        f = (f + 1) % capacity;
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        return queue[f];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getsize() {
        return size;
    }


    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(f + i) % capacity] + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        CustomArrayQueue queue = new CustomArrayQueue(5);
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.displayQueue();
        
        System.out.println("f element (peek): " + queue.peek());
       
            int dequeuedElement = queue.dequeue();
            System.out.println("Dequeued: " + dequeuedElement);
            queue.displayQueue();

            queue.enqueue(100);
            queue.displayQueue();
        
     
    }
}

