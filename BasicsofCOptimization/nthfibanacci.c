#include <stdio.h>

int main() {
    int n = 5;
    int dp[n + 1];
    dp[0] = 0;
    dp[1] = 1;
    int sum = dp[0] + dp[1];

    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
        sum += dp[i]; 
    }
    printf("Fibonacci sequence up to %d: ", n);
    for (int i = 0; i <= n; i++) {
        printf("%d ", dp[i]);
    }
    printf("\n");


    printf("Sum of Fibonacci sequence up to %d: %d\n", n, sum);

    return 0;
}


// O(n) time and O(n) space using dynamic programming
/* 
 static int nthFibonacci(int n){
        // Base case: if n is 0 or 1, return n
        if (n <= 1) {
            return n;
        }
        // Recursive case: sum of the two preceding
        // Fibonacci numbers
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    public static void main(String[] args){
        int n = 5;
        int result = nthFibonacci(n);
        System.out.println(result);
    }
    
    At each recursive call, two new calls are made recursion takes O(2^n) bcz of stack calls
     */