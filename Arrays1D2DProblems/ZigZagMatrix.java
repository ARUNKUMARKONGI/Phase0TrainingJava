package Arrays1D2DProblems;
import java.util.*;

public class ZigZagMatrix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
            for(int j=0;j<m;j++){
                
                System.out.print(arr[i][j]+" ");
            }
            }
            else{
                for(int j=m-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
       
    }
}



/* n, m = map(int, input().split())
matrix = [list(map(int, input().split())) for _ in range(n)]
result = []
for i in range(n):
    if i % 2 == 0:
        result.extend(matrix[i])
    else:
        result.extend(matrix[i][::-1])
print(*result) */
