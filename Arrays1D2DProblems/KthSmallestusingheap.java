package Arrays1D2DProblems;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallestusingheap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of rows and columns
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Read matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Read the value of k
        int k = scanner.nextInt();

        // Find the k-th smallest element
        int kthSmallest = findKthSmallest(matrix, k);
        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
    }

    private static int findKthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Min-heap to store the smallest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all elements from the matrix into the min-heap
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                minHeap.offer(matrix[i][j]);
            }
        }
        System.out.println(minHeap);  //doesn't guaranteed the order as sorted 

        // Extract the smallest element k times
        int kthSmallest = -1;
        for (int i = 0; i < k; i++) {
            kthSmallest = minHeap.poll();
        }

        return kthSmallest;
    }
}
/* 
In a min-heap, the smallest element is always at the root (top) of the heap,
 and every parent node has a value less than or equal to its children.
 
 For a min-heap each pop operation will remove the smallest element, 
 effectively sorting the elements in ascending 
 order over multiple pops.
 
 Example: [7, 10, 3, 1, 5, 8, 4]
 
      1
    /   \
   5     3
  / \   / \
 7   10 8  4
 
 step by step creation of min heap
 ------------------------------------
     7
   /
  10
  
  
    3
   / \
  10  7
  
    1
   / \
  3   7
 /
10

    1
   / \
  3   7
 / \ /
10 5 8

    1
   / \
  3   4
 / \ / \
10 5 8  7

Insert 4 as the right child of 3. 
We swap 4 with 7 to maintain the min-heap property, as 4 is smaller than 7.

Suppose k = 4. 4th smallest elemnt is 5


after first poll 1 is removed.
    3
   / \
  5   4
 / \  /
7   10 8

after second poll 3 is removed.
    4
   / \
  5   8
 / \
7   10

after 3rd poll 4 is removed.
    5
   / \
  7   8
 /
10

after 4th poll 5 is removed.
    7
   / \
  10  8
  */