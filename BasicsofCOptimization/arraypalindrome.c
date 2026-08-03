#include <stdio.h>

int main() {
    int arr[] = {1, 2, 3, 2, 1};
    int n = 5;

    int start = 0;
    int end = n - 1;
    int flag = 1;

    while (start < end) {
        if (arr[start] != arr[end]) {
            flag = 0;
            break;
        }
        start++;
        end--;
    }

    if (flag)
        printf("Palindrome\n");
    else
        printf("Not Palindrome\n");

    return 0;
}


/* naive approach

#include <stdio.h>

int main() {
    int arr[] = {1, 2, 3, 2, 1};
    int n = 5;
    int rev[5];

    for (int i = 0; i < n; i++) {
        rev[i] = arr[n - 1 - i];
    }

    int flag = 1;
    for (int i = 0; i < n; i++) {
        if (arr[i] != rev[i]) {
            flag = 0;
            break;
        }
    }

    if (flag)
        printf("Palindrome\n");
    else
        printf("Not Palindrome\n");

    return 0;
}
*/