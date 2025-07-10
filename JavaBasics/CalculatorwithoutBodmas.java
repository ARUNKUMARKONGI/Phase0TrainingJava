import java.util.*;
public class CalculatorwithoutBodmas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 
        String expression = sc.nextLine();
        String[] tokens = expression.split(" ");

        int result = Integer.parseInt(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            char operator = tokens[i].charAt(0);
            int operand = Integer.parseInt(tokens[i + 1]);

            switch (operator) {
                case '+':
                    result += operand;
                    break;
                case '-':
                    result -= operand;
                    break;
                case '*':
                    result *= operand;
                    break;
                case '/':
                    result /= operand;
                    break;
                case '%':
                    result = (result % operand + operand) % operand; // Ensure positive modulo
                    break;
            }
        }

        System.out.println(result);
    }
}

/* 6 no of operands 6-1 number of operators

8 + 2 * 5 - 3 / 5 % 6

tokens = ["8", "+", "2", "*", "5", "-", "3", "/", "5", "%", "6"]

= 10 * 5 - 3 / 5 % 6

= 50 - 3 / 5 % 6

= 47 / 5 % 6

= 9 % 6

= 3 



result = (result % operand + operand) % operand;


-7%5=-2 in java but for negative number actual value is =3 which is within range of 5
A remainder of -2 is mathematically valid but not in the range [0, m-1].
*/

// in python
// import re
// n=int(input())
// exp=input()
// tokens=re.findall(r'\d+|[+\-*/%]',exp)
// res=int(tokens[0])

// for i in range(1,len(tokens),2):
//     ch=tokens[i]
//     op=int(tokens[i+1])

//     if ch=='+':
//         res+=op
//     elif ch=='-':
//         res-=op
//     elif ch=='*':
//         res*=op
//     elif ch=='/':
//         res=int(res/op)
//     elif ch=='%':
//         res%=op
    
// print(res) 

/* In python the behavior of the division operator (//) 
for negative numbers differs from other languages
 like Java. In Python,
  floor division // rounds the result towards negative infinity, 
  while in Java, integer division rounds towards zero.

  i.e print(7/3) is 2.333 in python were as in java its integer division so ans 2

     print(7//3) will help us to make it 2 but it wont be same for negative numerator
     print(-7//3) will give -3 but in java -7/3 is -2.

     hence to get the similar result we need to do type casting instead of using floor division 
     operator.

Python behavior with //: -7 // 3 = -3 (rounded towards negative infinity).
Expected behavior (like in Java): -7 / 3 = -2 (rounded towards zero).

*/