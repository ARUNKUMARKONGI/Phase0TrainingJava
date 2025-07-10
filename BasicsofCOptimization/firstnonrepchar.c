#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "swiss";
    int n = strlen(str);
    int freq[256] = {0};

    for (int i = 0; i < n; i++) {
        freq[str[i]]++;
    }

    for (int i = 0; i < n; i++) {
        if (freq[str[i]] == 1) {
            printf("Fist Non-Repeating Character: %c\n", str[i]);
            return 0;
        }
    }
    printf("No Non-Repeating Character Found\n");
    return 0;
}



// Naive Approach
// ----------------------
// public class Main {
//     public static void main(String[] args) {
//         String str = "ssiaa";
//         int n = str.length();

//         for (int i = 0; i < n; i++) {
//             char currentChar = str.charAt(i);
//             int count = 0;

//             // Count the occurrences of currentChar
//             for (int j = 0; j < n; j++) {
//                 if (str.charAt(j) == currentChar) {
//                     count++;
//                 }
//             }

//             // If count is 1, it's the first non-repeating character
//             if (count == 1) {
//                 System.out.println("First Non-Repeating Character: " + currentChar);
//                 return;
//             }
//         }

//         System.out.println("No Non-Repeating Character Found");
//     }
// }

// above program again improved with break
// --------------------------------------------------
// public class Main {
//     public static void main(String[] args) {
//         String str = "ssiaa";
//         int n = str.length();

//         for (int i = 0; i < n; i++) {
//             char currentChar = str.charAt(i);
//             int count = 0;

//             // Count the occurrences of currentChar
//             for (int j = 0; j < n; j++) {
//                 if (str.charAt(j) == currentChar) {
//                     count++;
//                     if (count > 1) {
//                         break; // Stop counting if character is repeated
//                     }
//                 }
//             }

//             // If count is still 1, it's the first non-repeating character
//             if (count == 1) {
//                 System.out.println("First Non-Repeating Character: " + currentChar);
//                 return;
//             }
//         }

//         System.out.println("No Non-Repeating Character Found");
//     }
// }

// better approach
// _----------------
// import java.util.HashMap;

// public class Main {
//     public static void main(String[] args) {
//         String str = "ssiaa";
//         HashMap<Character, Integer> charCountMap = new HashMap<>();

//        
//         for (char c : str.toCharArray()) {
//             charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
//         }

//        
//         for (char c : str.toCharArray()) {
//             if (charCountMap.get(c) == 1) {
//                 System.out.println("First Non-Repeating Character: " + c);
//                 return;
//             }
//         }

//         System.out.println("No Non-Repeating Character Found");
//     }
// }
