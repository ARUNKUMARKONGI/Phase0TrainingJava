#include <stdio.h>
#include <ctype.h>
#include <stdio.h>

int main() {
    int t;
    scanf("%d", &t);

    while(t--) {
        char s[1000];
        scanf(" %[^\n]s", s);

        int words = 0;
        int flag = 0;

        for(int i = 0; s[i] != '\0'; i++) {
            if(s[i] != ' ' && flag == 0) {
                flag = 1;
                words++;
            }
            if(s[i] == ' ') flag = 0;
        }

        printf("%d\n", words);
    }

    return 0;
}


// int main() {
//     char str[] = "Count the number of words";
//     int count = 0;

//     for (int i = 0; str[i] != '\0'; i++) {
//         if (!isspace(str[i]) && (i == 0 || isspace(str[i - 1]))) {
//             count++;
//         }
//     }

//     printf("Number of words: %d\n", count);
//     return 0;
// }
