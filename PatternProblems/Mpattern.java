package PatternProblems;
import java.util.Scanner;
public class Mpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (j <= i)
                    System.out.print((char)('A' + j - 1) + " ");
                else
                    System.out.print("  ");
            }
            for (int j = n - 1; j >= 1; j--) {
                if (j <= i)
                    System.out.print((char)('A' + j - 1) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}


/* #include <stdio.h>
int main()
{
    int i, j, n;
    scanf("%d", &n);

    for (i = n; i >= 1; i--)
    {
        for (j = 1; j <= n; j++)
        {
            if (j <= i)
                printf("%c ", 'A' + j - 1);
            else
                printf("  ");
        }
        for (j = n - 1; j >= 1; j--)
        {
            if (j <= i)
                printf("%c ", 'A' + j - 1);
            else
                printf("  ");
        }
        printf("\n");
    }
    return 0;
}
 */