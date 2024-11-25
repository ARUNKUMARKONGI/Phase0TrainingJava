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
