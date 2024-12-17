#include <stdio.h>

int main() {
    int n = 5;
    int curr = 0;

    int prev1 = 0;
    int prev2 = 1;

    printf("%d %d ",prev2,prev1);
    for (int i = 2; i <= n; i++) {
        curr = prev1 + prev2;
         printf("%d ", curr);
        prev2 = prev1;
        prev1 = curr;
    }

  
    return 0;
}

/* best approach since
Time Complexity: O(n),
Auxiliary Space: O(1), */