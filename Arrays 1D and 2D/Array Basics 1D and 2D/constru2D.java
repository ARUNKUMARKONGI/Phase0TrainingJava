import java.util.*;
public class constru2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
         arr[i] = sc.nextInt();
        }
        System.out.println("original 1D array is: ");
        for(int i : arr)
         System.out.print(i+" ");

        int row=sc.nextInt();
        int col=sc.nextInt();

        int[][] arr2=new int[row][col];

        if((row*col)==N){
            System.out.println("possible");    
            }
            else{
            System.out.println("not possible");
            System.exit(0);
            }

            int index=0;

        for(int i =0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                  arr2[i][j]=arr[index++];  
            }
        }
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(arr2[i][j] + " ");
                }
                System.out.println();
            }
        
         /* for(int [] i:arr2){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
         } */
          

         //print diagonal sum of the matrix (square matrix 3*3)

         int sum=0;

         int len=arr2.length;
        /*  for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j || (i+j)==col-1){
                    sum+=arr2[i][j];
                }
            }
        } */

        for(int i=0;i<len;i++){
            sum=sum+arr2[i][i];
            sum=sum+arr2[i][len-i-1];
        }

        if(len%2==1) //this condition is needed only when we hav odd square matrix.
        {
            int middleindex=len/2;
            sum=sum-arr2[middleindex][middleindex];
        }
            System.out.println("Diagonal sum is: "+sum);

  }      
}
