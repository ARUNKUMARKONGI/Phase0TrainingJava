package Arrays1D2DProblems;
import java.util.*;
import java.util.*;

public class alternativeseating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Number of people
        int M = sc.nextInt(); // Number of seats
        int[] seats = new int[M];

        for (int i = 0; i < M; i++) {
            seats[i] = sc.nextInt(); // Read the seats array
        }

        int count = 0;
        int i = 0;

        while (i < M) {
            if (seats[i] == 0) {
                if (i == 0 || seats[i - 1] == 0) {
                    count++; // Seat a person here
                    i++; // Skip the next seat
                }
            }
            i++; // Move to the next seat
        }

        if (count >= N) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

/*
// import java.io.*;
// import java.util.*;
//  public class Main {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int size = sc.nextInt();
//     int[] arr = new int[size];
//     for(int i = 0 ; i<size; i++)
//     arr[i] = sc.nextInt();
//     int count = 0;
//     for(int i = 0; i<size-1;i++){
//         if(arr[i] == 0 && arr[i+1] == 0) n--;
//     }
//     System.out.println(n<=0 ? "YES" : "NO");

//     }
// } 
// */
