#include <stdio.h>

int main() {
    int n = 5;
    int sum = 0;

    for (int i = 1; i <= n; i++) {
        sum += i;
    }

    printf("Sum of first %d numbers: %d\n", n, sum);
    return 0;
}


/* #include <stdio.h>

int main() {
    int n = 5;
    int sum = n * (n + 1) / 2;  // Use the formula for sum of first n numbers

    printf("Sum of first %d numbers: %d\n", n, sum);
    return 0;
} */