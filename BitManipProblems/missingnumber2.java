import java.util.*;
public class mis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int actual_sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            actual_sum += arr[i];
        }
        int total_sum = (n+1)*(n+2)/2;
        int missing = total_sum - actual_sum;
        System.out.println(missing);
    }
}
