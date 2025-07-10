package PatternProblems;

import java.util.Scanner;

class griet
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s="GRIET";

        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}


/* 
#include <stdio.h>
#include <string.h>

int main() {
    char s[] = "GRIET";
    int length = strlen(s);

    for (int i = 0; i < length; i++) {
        for (int j = 0; j <= i; j++) {
            printf("%c ", s[j]);
        }
        printf("\n");
    }

    return 0;
}
 */