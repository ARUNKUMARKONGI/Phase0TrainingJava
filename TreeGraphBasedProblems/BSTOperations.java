/* input=
1 12
1 45
1 3
18
1 8
1 6
1 9
1 34
2
3
4
5
6
7
output=
Invalid Choice!!
Number of nodes in BST is: 7
Height of BST is: 4
Minimum Value in BST is: 3
Maximum Value in BST is: 45
Level Order traversal of BST is:                                                
12->3->45->8->34->6->9->  

*/

import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BSTOperations{
    Node root;

    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data <= root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    int minValue(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    int maxValue(Node node) {
        Node current = node;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    void display() {
        if (root == null) {
            System.out.println("BST is empty");
            return;
        }
        System.out.println("Level Order traversal of BST is:");
        Deque<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + "->");
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BSTOperations bst = new BSTOperations();
        Scanner scanner = new Scanner(System.in);
        int ch, n;

        while (true) {
            // System.out.println("Enter your choice (1: Insert, 2: Node Count, 3: Height, 4: Min Value, 5: Max Value, 6: Level Order, 7: Exit): ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    // System.out.print("Enter value to insert: ");
                    n = scanner.nextInt();
                    bst.root = bst.insert(bst.root, n);
                    break;

                case 2:
                    System.out.println("Number of nodes in BST is: " + bst.countNodes(bst.root));
                    break;

                case 3:
                    System.out.println("Height of BST is: " + bst.height(bst.root));
                    break;

                case 4:
                    if (bst.root == null) {
                        System.out.println("BST is empty. Can not find the value");
                    } else {
                        System.out.println("Minimum Value in BST is: " + bst.minValue(bst.root));
                    }
                    break;

                case 5:
                    if (bst.root == null) {
                        System.out.println("BST is empty. Can not find the value");
                    } else {
                        System.out.println("Maximum Value in BST is: " + bst.maxValue(bst.root));
                    }
                    break;

                case 6:
                    bst.display();
                    break;

                case 7:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!!");
            }
        }
    }
}
