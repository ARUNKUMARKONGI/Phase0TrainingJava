#include <stdio.h>

void sieveOfEratosthenes(int n) {
    int primes[n + 1];
    
    for (int i = 0; i <= n; i++) {
        primes[i] = 1;
    }
    
    primes[0] = primes[1] = 0;
    
    for (int i = 2; i * i <= n; i++) {
        if (primes[i] == 1) {
            for (int j = i * i; j <= n; j += i) {
                primes[j] = 0;
            }
        }
    }
    
    // Printing the prime numbers
    for (int i = 2; i <= n; i++) {
        if (primes[i] == 1) {
            printf("%d ", i);
        }
    }
}

int main() {
    int n = 30;
    
    sieveOfEratosthenes(n);
    
    return 0;
}
