package ProblemsOnStrings;

import java.util.Scanner;

public class StringGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P = sc.nextLine();
        String Q = sc.nextLine();

        if ((P + Q).equals(Q + P) == false)  { //cant compare strings with == 
            System.out.println(-1);
        } else {
            int gcdLength = gcd(P.length(), Q.length());
            System.out.println(P.substring(0, gcdLength));
        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

/*P=ABABAB
Q=ABAB
P + Q = "ABABABABAB".
Q + P = "ABABABABAB".
Since P + Q == Q + P, proceed.
Lengths: len(P) = 6, len(Q) = 4.
GCD of 6 and 4 is 2.
Extract P.substring(0, 2) = "AB". */