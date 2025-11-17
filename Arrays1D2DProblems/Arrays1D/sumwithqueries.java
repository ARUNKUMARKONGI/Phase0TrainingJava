package Arrays1D2DProblems;
import java.util.*;
public class sumwithqueries {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                int[] arr=new int[n];
                long sum=0;
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                    sum+=arr[i];
    
                }
               //System.out.println(sum);
                int q=sc.nextInt();
                while(q-->0){
                    long i=sc.nextInt();
                    long j=sc.nextInt();
                    long x=sc.nextInt();
                    sum+=(j-i+1)*x;
                }
                System.out.println(sum);
    
    
            }
        }
    }