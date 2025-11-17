package Arrays1D2DProblems.Arrays1D;
import java.util.Scanner;
public class missingnumbertricky {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        int res= (n+1)*(n+2)/2;
        System.out.println(res-sum);
    }
}


/*  using Xor approach
  Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            int xr_arr = 0;

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                xr_arr ^= arr[i];
            }
            int xr_range = 0;
            for(int i=1;i<=n+1;i++){
                xr_range ^= i;
            }
            int ans = xr_arr ^ xr_range;
            System.out.println(ans); */