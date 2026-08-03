#include <stdio.h>

int main() {
    int n = 5;
    int sum = n * (n + 1) * (2 * n + 1) / 6;  // Formula for sum of squares
    
    printf("Sum of squares: %d\n", sum);
    return 0;
}


/* #include <stdio.h>

int main() {
    int n = 5;  // Example input
    int sum = 0;

    for (int i = 1; i <= n; i++) {
        sum += i * i;  // Add square of the current number
    }

    printf("Sum of squares using loop: %d\n", sum);
    return 0;
} */

//sample test case n=5
//sum=1^2+2^2+3^2+4^2+5^2=55
/* Explanation of formula:
The formula for the sum of squares of the first n natural numbers is:   
Sum = n(n + 1)(2n + 1) / 6
Where:
n = The number up to which you want to calculate the sum of squares.
Derivation:
1. Consider the polynomial P(n) = a*n^3 + b*n^2 + c*n + d
2. We know that the sum of squares is a cubic polynomial in n.
3. By solving for coefficients a, b, c, and d using known values of the sum of squares for small n (like n=1, 2, 3, 4), we find:
   a = 1/3, b = 1/2, c = 1/6, d = 0
4. Thus, we get the formula:
