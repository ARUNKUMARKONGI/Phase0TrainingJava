import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //  int n1=n+1;
        // int sum = n1*(n1+1) / 2;
        int sum = (n + 1) * (n + 2) / 2;
        int actual_sum = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            actual_sum += x;
        }
        int missing = sum - actual_sum;
        System.out.println(missing);
    }
}

/* 5
1 2 4 5 6
→ Expected numbers: 1 2 3 4 5 6
→ Missing = 3 */