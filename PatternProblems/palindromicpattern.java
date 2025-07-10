package PatternProblems;
import java.util.*;
public class palindromicpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+j)+" ");
            }
            for(int j=i-1;j>=0;j--){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
}

/* #include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            printf("%c ", 'A' + j);
        }
        for (int j = i - 1; j >= 0; j--) {
            printf("%c ", 'A' + j);
        }
        printf("\n");
    }
    return 0;
}
 */
