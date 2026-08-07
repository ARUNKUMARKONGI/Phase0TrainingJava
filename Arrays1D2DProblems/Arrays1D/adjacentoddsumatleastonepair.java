package Arrays1D2DProblems.Arrays1D;
import java.util.*;
public class adjacentoddsumatleastonepair {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = s.nextInt();
        int ev = 0, od = 0;
        for(int i=0;i<n;i++){
            if(arr[i] % 2 == 0) ev++;
            else od++;
        }
        if(ev > 0 && od > 0) System.out.print("true");
        else System.out.print("false");
    }
}
