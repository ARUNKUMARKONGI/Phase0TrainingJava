package Arrays1D2DProblems;

import java.util.Scanner;

public class rightrotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of the array
        int d = sc.nextInt(); // number of right rotations
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        d = d % n; 
        int shift = n - d; 
        //last d elements come to front
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[(i + shift) % n] + " ");
        }
        sc.close();
    }
}

