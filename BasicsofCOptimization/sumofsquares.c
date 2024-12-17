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