package Arrays1D2DProblems;
import java.util.*;
public class adjacentoddsum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) 
           a[i] = s.nextInt();
        boolean flag = false;
        for(int i=0;i<n-1;i++){
            int sum = a[i] + a[i+1];
            if(sum % 2 != 0){
                flag = true;
                break;
            }
        }
        if(flag) System.out.print("TRUE");
        else System.out.print("FALSE");
    }
}
