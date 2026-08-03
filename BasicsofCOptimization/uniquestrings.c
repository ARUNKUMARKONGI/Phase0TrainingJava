#include <stdio.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);
    char arr[n][101];
    for(int i = 0; i < n; i++) {
        scanf("%s", arr[i]);
    }
    for(int i = 0; i < n; i++) {
        int count = 0;
        for(int j = 0; j < n; j++) {
            if(strcmp(arr[i], arr[j]) == 0) {
                count++;
            }
        }
        if(count == 1) {
            printf("%s ", arr[i]);
        }
    }
    return 0;
}
// Each string can be up to 100 characters, so use char arr[n][101];

// Use a loop to read each string using scanf("%s", arr[i]);
//sample test case
