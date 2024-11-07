package SIProblems;
import java.util.HashMap;
import java.util.*;
public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int sum=0;
        Map<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            count.put(arr[i],count.getOrDefault(arr[i],0)+1);

        }
        double mean=(double)sum/n;
        double median=0;
        if(n%2==0){
           median=(arr[(n/2)-1]+arr[(n/2)])/2.0;
        }
        else{
            median=arr[n/2];
        }
        int mode=arr[0];
        int maxcount=0;
        for(int i=0;i<n;i++){
            int curcount=count.get(arr[i]);
            if(curcount>maxcount)
            {
                maxcount=curcount;
                mode=arr[i];
            }
        }
    
        System.out.printf("%.2f %.2f %d",mean,median,mode);

        

    }
}

