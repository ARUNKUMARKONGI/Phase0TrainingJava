import java.util.Scanner;

public class xor_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans;
        if (n % 4 == 0)ans = n;
        else if (n % 4 == 1) ans = 1;
        else if (n % 4 == 2) ans = n + 1;
        else ans = 0;
        System.out.println(ans);
    }
}


/* The XOR of numbers from 1 to n follows a pattern that repeats every 4 numbers.

Let’s compute step by step:

For n = 1 → 1

For n = 2 → 1 ⊕ 2 = 3

For n = 3 → 1 ⊕ 2 ⊕ 3 = 0

For n = 4 → 1 ⊕ 2 ⊕ 3 ⊕ 4 = 4

For n = 5 → 1 ⊕ 2 ⊕ 3 ⊕ 4 ⊕ 5 = 1

For n = 6 → result = 7

For n = 7 → result = 0

For n = 8 → result = 8 */