#include <stdio.h>

int main() {
    int n = 6; 
    int lastEven = (n % 2 == 0) ? n : n - 1;
    int count = lastEven / 2;
    int sum = count * (count + 1);
    printf("Sum of Even Numbers: %d\n", sum);
    return 0;
}
