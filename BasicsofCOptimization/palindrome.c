#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "radar";
    int n = strlen(str);
    int start = 0, end = n - 1;
    int flag = 1;
    
    while (start < end) {
        if (str[start] != str[end]) {
            flag = 0;
            break;
        }
        start++;
        end--;
    }
    
    if (flag) {
        printf("Palindrome\n");
    } else {
        printf("Not a Palindrome\n");
    }
    return 0;
}

/* Naive Approach

#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "radar";
    int n = strlen(str);
    char reversed[n + 1];
    
    for (int i = 0; i < n; i++) {
        reversed[i] = str[n - i - 1];
    }
    reversed[n] = '\0';
    
    if (strcmp(str, reversed) == 0) {
        printf("Palindrome\n");
    } else {
        printf("Not a Palindrome\n");
    }
    return 0;
}
 */