#include <stdio.h>
#include <math.h>

//prime numbers upto given count
int main() {
    int n, count = 0, i = 1, flag = 1;
    scanf("%d", &n);

    while (1) {
        i++;
        flag = 1;
        for (int j = 2; j <= sqrt(i); j++) {
            if (i % j == 0) {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            printf("%d ", i);
            count++;
        }
        if (count == n) {
            break;
        }
    }

    printf("\n");
    return 0;
}


/* alternative approach
---------------------
#include <stdio.h>
#include <math.h>

int primeChecker(int n) {
    if (n <= 1) {
        return 0; // Not prime
    }
    for (int i = 2; i <= sqrt(n); i++) {
        if (n % i == 0) {
            return 0; // Not prime
        }
    }
    return 1; // Prime
}

int main() {
    int n, count = 0, i = 2;
    scanf("%d", &n);

    while (count < n) {
        if (primeChecker(i)) {
            printf("%d ", i);
            count++;
        }
        i++;
    }

    printf("\n");
    return 0;
} */
