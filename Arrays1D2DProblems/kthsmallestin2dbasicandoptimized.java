/*
Write a java program to find Kth Smallest element in a 2D array.

Input Format: enter the number of rows and columns on each line
              Then enter the 2D array elements
              At last, Enter the K, which indicates the kth Smallest element to be searched.
              

Input/Output Constraints:
----------------------------
Within Integer Range.


Test Case Examples:
-------------------
input=
4
3
 7   4   8
 3   5   89
12  56   10
14  45   100
4
output=
The 4th smallest element is: 7

input=
2
3
7 6 8
6 8 10
3
output=
The 3th smallest element is: 7

input=
3
4 
1 2 3 4
5 6 7 8 
9 1 2 3
6
output=
The 6th smallest element is: 3

input=
4
3
2423434 545 675445
3455423 455 12344
6786532 123 67865
9009846 859 89884
7
output=
The 7th smallest element is: 89884

*/
// Start writing your code from here

package Arrays1D2DProblems;
import java.util.Arrays;
import java.util.Scanner;
public class kthsmallestin2dbasicandoptimized {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read input from the user
          //  System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();

            //System.out.print("Enter the number of columns: ");
            int cols = scanner.nextInt();

            int[][] matrix = new int[rows][cols];

           // System.out.println("Enter the elements of the 2D array:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            //System.out.print("Enter the value of k: ");
            int k = scanner.nextInt();

            int kthSmallest = findKthSmallest(matrix, k);
            System.out.println("The " + k + "th smallest element is: " + kthSmallest);
        }

        private static int findKthSmallest(int[][] matrix, int k) {
            int rows = matrix.length;
            int cols = matrix[0].length;

            int[] flatArray = new int[rows * cols];
            int index = 0;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    flatArray[index++] = matrix[i][j];
                }
            }

            Arrays.sort(flatArray);

            return flatArray[k - 1];
        }
    }



// basic approach

// import java.util.Scanner;
// import java.util.Arrays;
// public class KthSmallestElement2D {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the number of rows:");
//         int rows = sc.nextInt();
        
//         System.out.println("Enter the number of columns:");
//         int columns = sc.nextInt();
        
//         int[][] array = new int[rows][columns];
//         System.out.println("Enter the elements of the 2D array:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < columns; j++) {
//                 array[i][j] = sc.nextInt();
//             }
//         }
        
//         System.out.println("Enter the value of k:");
//         int k = sc.nextInt();

//         int[] flatArray = new int[rows * columns];
//         int index = 0;
        
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < columns; j++) {
//                 flatArray[index++] = array[i][j];
//             }
//         }
//         System.out.println(Arrays.toString(flatArray));
        
//         for (int i = 0; i < flatArray.length; i++) {
//             int count = 0;
//             for (int j = 0; j < flatArray.length; j++) {
//                 if (flatArray[j] < flatArray[i]) {
//                     count++;
//                 }
//             }
//             if (count == k - 1) {
//                 System.out.println("The " + k + "th smallest element is: " + flatArray[i]);
//                 break;
//             }
//         }
//     }
// }

// Enter the value of k:
// 3
// [3, 4, 66, 34, 5, 7, 8, 77, 22]
// The 3th smallest element is: 5