#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "hello world";
    int n = strlen(str);
    int count = 0;
    char vowels[] = "aeiouAEIOU";
    
    for (int i = 0; i < n; i++) {
        if (strchr(vowels, str[i]) != NULL) {
            count++;
        }
    }
    
    printf("Number of vowels: %d\n", count);
    return 0;
}

/*

better approach.. conditional stmt takes o(1) whereas strchr takes o(m) where m is vowelarray length
 #include <stdio.h>
#include <string.h>

int main() {
    char str[] = "hello world";
    int n = strlen(str);
    int count = 0;
    
    for (int i = 0; i < n; i++) {
        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' || 
            str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U') {
            count++;
        }
    }
    
    printf("Number of vowels: %d\n", count);
    return 0; 
}
 */