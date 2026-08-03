#include <stdio.h>

int main() {
    int n = 6; 
    int lastEven = (n % 2 == 0) ? n : n - 1;
    int count = lastEven / 2;
    int sum = count * (count + 1);
    printf("Sum of Even Numbers: %d\n", sum);
    return 0;
}

/* basic approach:
    int sum = 0;

    for (int i = 1; i <= n; i++) {
        if (i % 2 == 0) {            //if(i&1==0) also works and faster due to bitwise operation reason 
            sum += i;
        }
    }

    printf("Sum of Even Numbers: %d\n", sum);
    return 0;
}



*/


/* int count = lastEven / 2;

Why divide by 2?

Even numbers are:
2, 4, 6, 8, ... , lastEven
That is:

2 × 1
2 × 2
2 × 3
. . .
2 × k

So:

lastEven = 2 × k
k = lastEven / 2

Meaning:
k = number of even numbers
lastEven = 6 → count = 6/2 = 3 (evens: 2, 4, 6)
lastEven = 10 → count = 10/2 = 5 (evens: 2, 4, 6, 8, 10)


Compute sum of first k even numbers
Even numbers form an arithmetic progression:
2, 4, 6, ..., 2k
Sum of this series = 2 × (1 + 2 + 3 + ... + k)
Sum of first k natural numbers:
1 + 2 + 3 + ... + k = k(k + 1)/2

So sum of even numbers: (2 and 2 cancels out)
2 × [k(k + 1)/2] = k(k + 1)

int sum = count * (count + 1);
Example:
k = 3
Sum = 3 × 4 = 12
(Which is 2 + 4 + 6 = 12)
*/