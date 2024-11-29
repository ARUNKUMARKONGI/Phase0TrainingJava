package Arrays1D2DProblems;

import java.util.Scanner;
public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Enter the size of the square matrix: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

       // System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
            int sum = 0;
            int len = matrix.length;
            System.out.println("length of the matrix:"+len);


            for (int i = 0; i < len; i++) {
                sum += matrix[i][i];
                // if(i!=c-i-1){
                //     sum1=sum1+arr1[i][c-i-1]; //adds overhead of checking condition for larger matrix size.
                //     }
                sum += matrix[i][len - 1 - i];  //in single loop we are summing
            }

            if (len % 2 == 1) {
                int mid = len / 2;
                sum -= matrix[mid][mid];
            }

            System.out.println("Diagonal Sum is: "+sum);
        }

    }


/*import java.util.*;
class DiagonalSum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || (i+j)==n-1){  //this uses 2 loops
                    sum=sum+arr[i][j];
                }

            }
        }
        System.out.println("Sum of Diagonals: "+sum);

    }

}*/
// take input matrix size 3
//elements
// 1 2 3
// 4 5 6
// 7 8 9
/* int sum1=0;
for(int i=0;i<c;i++){
    sum1=sum1+arr1[i][i];
    if(i!=c-i-1){
    sum1=sum1+arr1[i][c-i-1];
    }
} */