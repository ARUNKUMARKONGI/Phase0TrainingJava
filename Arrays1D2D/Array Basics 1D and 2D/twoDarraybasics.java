import java.util.Scanner;
public class twoDarraybasics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[][] myNumbers = { {1, 2, 3, 4},
                              {4,5,6,7,5},
                              {5, 6, 7}
                            };
        System.out.println(myNumbers[1][2]); // Outputs 7
        System.out.println("number of rows in 2D array: "+myNumbers.length);

        System.out.println("number of columns in 2nd row: "+myNumbers[1].length);

        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
              System.out.print(myNumbers[i][j]+" ");
            }
            System.out.println();
          }


          System.out.println("2D array printed using enhanced loop: ");
          //print using enhanced loop for 2D Array
            for (int[] griet : myNumbers) {
                 //this iterates no of rows
             for (int i : griet) {   
                    //inner for loop prints each value from row
                 System.out.print(i+" ");
             }
             System.out.println();
            }
  }
}

