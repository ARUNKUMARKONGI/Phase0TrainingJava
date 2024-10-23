import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallest {

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
