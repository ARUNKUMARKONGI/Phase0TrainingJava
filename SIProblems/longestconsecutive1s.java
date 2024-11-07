import java.util.*;

public class longestconsecutive1s {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxlength=0;
        int a=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1)
             a++;
             if(a>maxlength){
                 maxlength=a;
             }
        
           if(arr[i]==0){
              a=0;
         }
        }
        System.out.println(maxlength);
    }
}