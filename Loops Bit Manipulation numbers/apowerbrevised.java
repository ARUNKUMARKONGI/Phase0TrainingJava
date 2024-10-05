import java.util.Scanner;

public class apowerbrevised {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        
        int result = 1;
        while (power != 0) {
            result = result * base;
            power--;
        }
        System.out.println("Result = " + result);
    }
}


/*
efficient approach

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        int MOD = 1000000007;  // Modulo value
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long result = 1;
            long base = a;

            while (b > 0) {
                if (b % 2 == 1) {
                    result = (result * base) % MOD;  
                }
                base = (base * base) % MOD;  
                b /= 2; 
            }
            
            System.out.println(result);  // take 2^3 example: 
        }
    }
}


formula: a^b if b is odd for example 2^3: formula is: a^b=a*a^(b-1)

         if b is even: a^b=(a*a)^b/2 for example: 2^4= (2*2)^4/2 =4^2=16


Why These Operations Are Important: 
---------------------------------------
The while loop runs power times in general approach.
For large values of power (10^9) this approach will take too long to compute.
i,e 10^9 multiplications, which is computationally expensive and will take a significant amount of time to complete, 
especially in scenarios with strict time limits (like in competitive programming).
Time Complexity is O(b), which is not efficient for large b.


Efficient Reduction: Instead of iterating b times, we reduce b exponentially by halving it, achieving 
O(logb) time complexity.
Handles Large Powers: The method works even for very large powers like 10^9 where direct multiplication would take too long.
Modulo Operation: Keeps intermediate results within limits, preventing overflow.
*/
