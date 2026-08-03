#include <stdio.h>
#include <string.h>

int main() {
    char s[200];
    scanf("%s", s);
    int count = 0;
    int len = strlen(s);

    for(int i = 0; i < len - 1; i++) {
        if(s[i] == s[i+1]) count++;
    }

    printf("%d", count);
    return 0;
}
/* Alternative Approach
#include <stdio.h>

#include <string.h>
int main() {
    char s[200];
    scanf("%s", s);
    int count = 0;
    int len = strlen(s);

    for(int i = 1; i < len; i++) {
        if(s[i] == s[i-1]) count++;
    }

    printf("%d", count);
    return 0;
}
*/