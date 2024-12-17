#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "swiss";
    int n = strlen(str);
    int freq[256] = {0};

    for (int i = 0; i < n; i++) {
        freq[str[i]]++;
    }

    for (int i = 0; i < n; i++) {
        if (freq[str[i]] == 1) {
            printf("Fist Non-Repeating Character: %c\n", str[i]);
            return 0;
        }
    }
    printf("No Non-Repeating Character Found\n");
    return 0;
}
