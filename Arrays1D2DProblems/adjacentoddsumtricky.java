package Arrays1D2DProblems;
import java.util.*;
public class adjacentoddsumtricky {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = s.nextInt();
        int c_even = 0, c_odd = 0;
        for(int i=0;i<n;i++){
            if(a[i] % 2 == 0) c_even++;
            else c_odd++;
        }
        if(Math.abs(c_even - c_odd) <= 1) 
        System.out.print("TRUE");
        else System.out.print("FALSE");
    }
}

/* Can you rearrange an array so that every adjacent pair has an odd sum? 
If possible print TRUE, else FALSE.” */
