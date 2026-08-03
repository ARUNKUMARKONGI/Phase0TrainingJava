import java.util.Scanner;

public class MonotonousSubstrings {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Length of the string
            String s = sc.next(); // The string itself

            long result = 0;
            int count = 1; // To count the length of the current consecutive block of characters

            // Iterate through the string
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    // If the current character is the same as the previous one, extend the block
                    count++;
                } else {
                    // If the character changes, calculate the number of monotonous substrings
                    result += (long) count * (count + 1) / 2;
                    result %= MOD; // Take modulo at each step
                    count = 1; // Reset count for the new block
                }
            }

            // Don't forget to add the last block
            result += (long) count * (count + 1) / 2;
            result %= MOD;

            // Output the result for this test case
            System.out.println(result);
        }

        sc.close();
    }
}

/* For the block "aa", we can form the following substrings: "a", "a", and "aa".
For the block "ccc", we can form: "c", "c", "c", "cc", "cc", and "ccc". 

Test Case 1:
String: "abbcccaa"
For the first 'a': 1 substring ("a")
For the 'b': 1 substring ("b")
For the first 'c': 1 substring ("c")
For the second 'c': 2 substrings ("c", "cc")
For the third 'c': 3 substrings ("c", "cc", "ccc")
For the first 'a': 1 substring ("a")
For the second 'a': 2 substrings ("a", "aa")
Total: 1 + 1 + 1 + 2 + 3 + 1 + 2 = 13
Test Case 2:
String: "aaaa"
For the first 'a': 1 substring ("a")
For the second 'a': 2 substrings ("a", "aa")
For the third 'a': 3 substrings ("a", "aa", "aaa")
For the fourth 'a': 4 substrings ("a", "aa", "aaa", "aaaa")
Total: 1 + 2 + 3 + 4 = 10


Let's consider the string "abbcccaa":

Initialization:

result = 0 (this will hold the total number of monotonous substrings)
count = 1 (initialize to 1 for the first character)
Traverse the string:

For i = 1 (b), since s[i] == s[i-1], we increment count.
For i = 2 (b), since s[i] == s[i-1], we increment count.
For i = 3 (c), since s[i] != s[i-1], we calculate the substrings formed by the previous block of b's (length 2), which is 

(2×(2+1)/2
​
 =3, then reset count to 1.
 
 Next characters: c, c, c
Length of consecutive c: 3
Number of monotonous substrings: 1 (Just "c") + 2 (Substrings of length 2: "c", "cc") + 3 (Substrings of length 3: "c,cc,ccc")
Total =3×(3+1)/2
 =6 substrings
 
 */