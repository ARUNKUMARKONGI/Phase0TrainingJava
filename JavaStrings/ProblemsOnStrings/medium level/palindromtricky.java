/* given two strings s1 and s2, find if any substring a of s1 and b of s2 can be concatenated 
to form palindrome
Suppose there is a common character:
s1 = "hello"
s2 = "world"
Common character:'o'
Choose:
a = "o"
b = "o"
Then:
o + o = oo

which is a palindrome.
*/

import java.util.*;

class palindrometricky {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        boolean[] present = new boolean[26];

        for (int i = 0; i < s1.length(); i++) {
            present[s1.charAt(i) - 'a'] = true;
        }

        boolean found = false;

        for (int i = 0; i < s2.length(); i++) {
            if (present[s2.charAt(i) - 'a']) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Yes" : "No");
    }
}