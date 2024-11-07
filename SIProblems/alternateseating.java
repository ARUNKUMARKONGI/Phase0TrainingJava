/*
 You are given an integer N, denoting the number of people who need to be seated, 
and a list of M seats, where 0 represents a vacant seat and 1 represents an already occupied seat. 
Find whether all N people can find a seat, provided that no two people can sit next to each other.

Constraints
---------
1 ≤ N ≤ 10^5 (number of ppl)
1 ≤ M ≤ 10^5 (number of seats)
Ai ∈ {0, 1}

Input:
2
7
0 0 1 0 0 0 1
Output:
YES */

package SIProblems;
import java.util.*;

public class alternateseating {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] seats = new int[M];
        
        for (int i = 0; i < M; i++) {
            seats[i] = sc.nextInt();
        }

        int count = 0;
        
        for (int i = 0; i < M; i++) {
            if (seats[i] == 0) {
                if (i == 0 || seats[i - 1] == 0) {
                    count++;
                    i++; 
                }
            }
        }

        if (count >= N) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


