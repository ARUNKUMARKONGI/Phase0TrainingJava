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


/* 1+2+3+⋯+n
You could try adding numbers one by one, but that’s slow for large 𝑛

Reverse Trick (Gauss’ Method)
Write numbers in normal order and reverse order:
1   2   3   ... n
n  n-1 n-2  ... 1

Now, add the columns vertically:

1+n = n+1
2+(n-1) = n+1
3+(n-2) = n+1
...
Each column sums to n+1, and there are n columns.
Total sum of both sequences = n*(n+1)

But we counted the sum twice, so divide by 2 → n(n+1)/2
Advantages of this method:
It allows you to pair first + last, second + second-last, etc., automatically
Avoids thinking about loops or complicated algebra
Provides a visual and intuitive pattern





*/