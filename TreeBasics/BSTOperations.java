/* input=
1 12
1 45
1 3
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


import java.util.*;

class Node {
    int item;
    Node left, right;
    public Node(int item) {
        this.item = item;
        left = right = null;
    }
}
public class BSTOperations {
    public static Node root;

    public static Node insert(Node root, int data) {
        if (root == null) return new Node(data);
        if (data <= root.item)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);
        return root;
    }

    public static int countnodes(Node root) {
        if (root == null) return 0;
        return 1 + countnodes(root.left) + countnodes(root.right);
    }

    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.item + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.item + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, value;
        while (true) {
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    value = sc.nextInt();
                    root = insert(root, value);
                    break;
                case 2:
                    System.out.println("Nodes: " + countnodes(root));
                    break;
                case 3:
                    preorder(root);
                    System.out.println();
                    break;
                case 4:
                    postorder(root);
                    System.out.println();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
