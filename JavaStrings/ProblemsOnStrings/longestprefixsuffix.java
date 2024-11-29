package ProblemsOnStrings;
/* Given a string, compute the length of the longest proper prefix which is same as the
 suffix of the given string.
 
input:smartintsmart
Output:5

*/

import java.util.*;

public class longestprefixsuffix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        int[] pi = new int[n];  
        int j = 0;  

        for (int i = 1; i < n; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = pi[j - 1];  
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;  
            }
            pi[i] = j; 
        }

        System.out.println(pi[n - 1]);  // This is the longest proper prefix which is also a suffix
    }
}


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

def longest_prefix_suffix(s):
    n = len(s)
    longest = 0
    for i in range(1, n):
        if s[:i] == s[-i:]:
            longest = i
    return longest

# Input
s = input()

# Output the result
print(longest_prefix_suffix(s))
*/