package TreeBasedProblems;

import java.util.Deque;
import java.util.ArrayDeque;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class CustomTree {

    private TreeNode root;

    CustomTree() {
        root = null;
    }

    // Insert elements in level order
    public void insert(int data) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
            return;
        }

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();

            if (temp.left == null) {
                temp.left = newNode;
                break;
            } else {
                queue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                break;
            } else {
                queue.add(temp.right);
            }
        }
    }

    // Post-order Traversal (Left, Right, Root) - Single method
    public void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    // Level-order Traversal (Breadth-first search)
    public void levelOrder() {
        System.out.print("Level-order Traversal: ");
        if (root != null) {
            Deque<TreeNode> queue = new ArrayDeque<>();
            queue.add(root);
            
            while (!queue.isEmpty()) {
                TreeNode current = queue.poll();
                System.out.print(current.data + " ");

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CustomTree tree = new CustomTree();

        // Insert elements
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);

        // Post-order traversal
        System.out.print("Post-order Traversal: ");
        tree.postOrder(tree.root); // Directly access root node
        System.out.println();

        // Level-order traversal
        tree.levelOrder(); 
    }
}