package LinkedListProblems;

public class CustomLinkedList {
   
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;

    // Method to add an element at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to add an element at a specific position
    public void addAtIndex(int index, int data) {
        Node newNode = new Node(data);
        
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < index-1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Method to remove an element by value
    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Element not found.");
        } else {
            current.next = current.next.next;
        }
    }

    // Method to remove an element at a specific index
    public void removeAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        current.next = current.next.next;
    }

    // Method to display the elements of the LinkedList
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to get the size of the LinkedList
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Method to check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Method to get the element at a specific index
    public int get(int index) {
        Node current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }

        return current.data;
    }
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Initial Linked List:");
        list.display();

        list.addAtIndex(2, 25);
        System.out.println("After adding 25 at index 2:");
        list.display();

        // Removing an element by value
        list.remove(30);
        System.out.println("After removing 30:");
        list.display();

        // Removing an element at index 1
        list.removeAtIndex(1);
        System.out.println("After removing element at index 1:");
        list.display();

        // Getting an element at a specific index
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Is the list empty? " + list.isEmpty());
        System.out.println("Size of the list: " + list.size());
    }
}

