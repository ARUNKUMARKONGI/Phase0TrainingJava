#include <stdio.h>

int main() {
    char str[100];
    fgets(str, sizeof(str), stdin); // Reads up to sizeof(str) - 1 characters
    printf("You entered: %s", str);
    return 0;
}


/* #include <stdio.h>

int main() {
    char str[100];
    gets(str); // Reads an entire line including spaces (deprecated, unsafe)
    printf("You entered: %s\n", str);
    return 0;
}
 */

/* #include <stdio.h>

int main() {
    char str[100];
    scanf("%s", str); // Reads input until a space or newline
    printf("You entered: %s\n", str);
    return 0;
}
 */

// Online C compiler to run C program online
#include <stdio.h>

/* int main() {
    char str[10];
    scanf("%[^\n]", str); // Reads input until a space or newline
    printf("You entered: %s\n", str);
    return 0;
}
 */