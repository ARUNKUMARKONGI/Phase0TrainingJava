package SIProblems;
import java.util.*;
public class missingnumber {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int[] arr=new int[99];
        int sum=0;
        for(int i=0;i<99;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];

        }
        int total =100*(100+1)/2;
        System.out.println(total-sum);
    }
}

