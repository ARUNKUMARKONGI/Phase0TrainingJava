package PatternProblems;
/*
 1 2 3 4 5 
  2 3 4 5 
   3 4 5 
    4 5 
     5 
    4 5 
   3 4 5 
  2 3 4 5 
 1 2 3 4 5 
 */ 
public class hrglass {
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=i;j<=num;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for(int i=num-1;i>=1;i--){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=i;j<=num;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
/* #include <stdio.h>
int main()
{
    int n = 5;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j < i; j++) {
            printf(" "); //single space
        }
        for (int k = i; k <= n; k++) {
           printf("* ");
        }
        printf("\n");
    }
     for (int i = n-1; i >= 1; i--) {
        for (int j = 1; j < i; j++) {
            printf(" "); //single space
        }
        for (int k = i; k <= n; k++) {
           printf("* ");
        }
        printf("\n");
    }
    return 0;
} 

* * * * * 
 * * * * 
  * * * 
   * * 
    * 
   * * 
  * * * 
 * * * * 
* * * * *
*/
