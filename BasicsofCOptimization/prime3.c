#include <stdio.h>
#include <math.h>

//number of test cases and prime numbers upto n
int isPrime(int n) {
    if (n <= 1) {
        return 0; 
    }
    for (int i = 2; i <= sqrt(n); i++) {
        if (n % i == 0) {
            return 0; 
        }
    }
    return 1; 
}

void printUptoN(int n) {
    for (int i = 2; i <= n; i++) {
        if (isPrime(i)) {
            printf("%d ", i);
        }
    }
    printf("\n");
}

int main() {
    int testcases = 3;
    int n;
    for (int i = 0; i < testcases; i++) {
        scanf("%d", &n);
        printUptoN(n);
    }
    return 0;
}
