package PatternProblems;
import java.util.*;
public class hollowrectangle {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||j==n-1||i==m-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}