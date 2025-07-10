#include <stdio.h>
//prime numbers from 1 to 10
int isPrime(int n) {
    if (n <= 1) return 0;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return 0; 
        }
    }
    return 1; 
}

int main()
 {
    for (int n = 2; n <= 10; n++) 
    {
        if (isPrime(n)) 
        {
            printf("%d ", n);
        }
    }

    return 0;
}
