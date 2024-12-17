#include <stdio.h>
#include <ctype.h>

int main() {
    char str[] = "Count the number of words";
    int count = 0;

    for (int i = 0; str[i] != '\0'; i++) {
        if (!isspace(str[i]) && (i == 0 || isspace(str[i - 1]))) {
            count++;
        }
    }

    printf("Number of words: %d\n", count);
    return 0;
}
