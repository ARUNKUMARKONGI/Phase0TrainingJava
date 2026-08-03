package ProblemsOnStrings;
/* Given a string, compute the length of the longest proper prefix
 which is same as the suffix of the given string.
 
input:smartintsmart
Output:5

*/

import java.util.*;
public class longestprefixsuffix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = str.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        while(i < n){
            if(str.charAt(i) == str.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            } else {
                if(len != 0){
                    len = lps[len-1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        System.out.print(lps[n-1]);
    }
}
/* tracing
 * Input: smartintsmart
n = 13

Characters:
s m a r t i n t s m a r t
Indices:
0 1 2 3 4 5 6 7 8 9 10 11 12

Building LPS:

i=1: m!=s → lps[1] = 0
i=2: a!=s → lps[2] = 0
i=3: r!=s → lps[3] = 0
i=4: t!=s → lps[4] = 0
i=5: i!=s → lps[5] = 0
i=6: n!=s → lps[6] = 0
i=7: t!=s → lps[7] = 0

i=8: s==s → lps[8] = 1
i=9: m==m → lps[9] = 2
i=10: a==a → lps[10] = 3
i=11: r==r → lps[11] = 4
i=12: t==t → lps[12] = 5

Final LPS array:
0 0 0 0 0 0 0 0 1 2 3 4 5

Answer = lps[12] = 5
 */


/* import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named
         Main. 
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         int n=s.length();
         int longest=0;
         for(int i=1;i<n;i++){
             if(s.substring(0,i).equals(s.substring(n-i))){
                longest=i;
             }
         }
         System.out.println(longest);

    }
} 
another approach:
----------------------------
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int i = 0;
        int k = n - 1;
        int count = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int x = 0; x < n - 1; x++){
            sb1.append(s.charAt(i++));
            sb2.insert(0, s.charAt(k--));
            if(sb1.toString().equals(sb2.toString())){
                count = sb1.length();
            }
        }
        System.out.print(count);
    }
}
time complexity: O(n^2) 
though stringbuilder is used still it is O(n^2) 
Reason: inserting at index 0 of sb2 is O(n) each time.

Prefix grows:

s
sm
sma
smar
smart

Suffix grows (in correct order due to insertion at 0):

t
rt
art
mart
smart

Match occurs at length 5.
*/