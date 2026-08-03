#include <stdio.h>

int main() {
    int t;
    scanf("%d", &t);

    while(t--) {
        int n;
        scanf("%d", &n);

        int arr[100];
        for(int i = 0; i < n; i++) {
            scanf("%d", &arr[i]);
        }

        int max_diff = 0;

        for(int i = 0; i < n - 1; i++) {
            int d = arr[i] - arr[i+1];
            if(d < 0) d = -d;
            if(d > max_diff) max_diff = d;
        }

        printf("%d\n", max_diff);
    }

    return 0;
}

//sample test case
// 1
// 5
// 1 8 3 5 2
//output
//7
//explanation: The maximum absolute difference is between 1 and 8 which is 7
//we are calculating the maximum absolute difference between consecutive pairs elements in the array.
