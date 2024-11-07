

/*Write a Java Program to check if a given number is beautiful number or not!!
You are given a number N. A number is called beautiful if, for every digit x in the number, there are x occurrences of it in the number.
Example: 
1 is beautiful because 1 has 1 occurrence. 3133 is beautiful because 1 has 1 occurrence and 3 has 3 occurrences.
224 is not beautiful because 4 does not have 4 occurrences. 

Note:Implement all the invalid cases given in the sample test cases using exception handling!!

Test case examples:
-----------------------
case=t1
input=122
output=122 is a beautiful number

case=t2
input=12342
output=12342 is not a beautiful number

case=t3
input=ARUN777
output=
Invalid input. Please enter a valid integer.

case=t4
Grade reduction = 20
input=0
output=Zero is not allowed as input.

case=t5
input=12032
output=
The number cannot contain zero in between the digits.

case=t6
fail message="hidden test case"
input=120432
output=The number cannot contain zero in between the digits.

case=t7
input=1223433444
output=1223433444 is a beautiful number

case=t8
fail message="hidden test case"
Grade reduction=20%
input=124067
output=The number cannot contain zero in between the digits.
*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        try {
            int num = Integer.parseInt(str);

           if (num == 0) {
                throw new IllegalArgumentException("Zero is not allowed as input.");
            }

            if (str.contains("0")) {
                throw new IllegalArgumentException("The number cannot contain zero in between the digits.");
            }

            if (check_beautiful(num)) {
                System.out.println(num + " is a beautiful number.");
            } else {
                System.out.println(num + " is not a beautiful number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean check_beautiful(int num) {
        String str = String.valueOf(num);
        int[] count = new int[10]; 

        for (int i = 0; i < str.length(); i++) {  //whenever working with strings start index with 0
            int digit = str.charAt(i) - '0';
            count[digit]++;
        }

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';

            if (count[digit] != digit)
            {
                return false;
            }
        }
        return true;
    }

}
/* using hashmap
-------------------
HashMap<Character, Integer> digitCount = new HashMap<>();
            for (char digit : input.toCharArray()) {
                digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
            }

            // Check if the number is beautiful
            boolean isBeautiful = true;
            for (char digit : digitCount.keySet()) {
                int count = digitCount.get(digit);
                if (count != Character.getNumericValue(digit)) {
                    isBeautiful = false;
                    break;
                }
            }

            // Output the result
            if (isBeautiful) {
                System.out.println(input + " is a beautiful number.");
            } else {
                System.out.println(input + " is not a beautiful number.");
            }

 */