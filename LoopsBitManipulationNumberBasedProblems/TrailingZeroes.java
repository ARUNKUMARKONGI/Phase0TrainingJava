import java.util.Scanner;
public class TrailingZeroes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                int s = 0;
                while (n > 0) {
                    s = s + (n / 5);
                    n = n / 5;
                }
                System.out.println(s);
            }
        }

//This is because every multiple of 5 contributes one trailing zero,
// and the loop counts how many multiples of 5 are present in the factorial.
/* Trailing Zeroes in 25!
25! are determined by the number of times 10 is a factor in the product of numbers from 1 to 25. Since 
10=2×5

How to Count Factors of 5
We use the formula:

Trailing zeroes formula: n/5+n/25+n/125 and so on
every multiple of 5 contributes to 1 trailing zeroes. (i.1 5! to 1 and 10! to 2 and 15! to 3)
for example if input is 5: according to formula: 5/5+5/25+5/125.. ==> 1+0+0=1 i.e 5!=120 which has one trailing zero.

similarly if input is 25. 
formula: 25/5+25/25+25/125...

25/5=5 which contributes to 5 trailing zeroes bcz multiples of 5 in 25 are, 5,10,15,20,25
25/25=1 which contributes to 1 trailing zeroes. so in total: 6 trailing zeroes in 25!
25/125=0 no multiples of 125 are present.

THE REASON WE ARE USING THE FORMULA IS: 
-----------------------------------------
in 5!=120 1 trailing zeroes.
  until we reach 10! the previous numbers does not add on any addition zero. for example 9!=362880

10!=3628800 we have 2 trailing zeroes. (similarly until we reach 15! it doesn't add onto any addition trailing zeroes)

15!=15!=1,307,674,368,000  3 trailing zeroes

20!= 20!=2,432,902,008,176,640,000  4 trailing zeroes.

25!=15,511,210,043,330,985,984,000,000 6 trailing zeroes.


so in general for every multiple of number of trailing zeroes are added.
i.e 5
 */