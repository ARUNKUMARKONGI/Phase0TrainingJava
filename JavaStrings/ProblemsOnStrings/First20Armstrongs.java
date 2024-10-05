package StringBasics.Problems;

public class First20Armstrongs {
        public static void main(String[] args) {
            System.out.println("First 20 Armstrong numbers:");

            int count = 0;
            int number = 1;

            while (count < 20) {
                if (isArmstrongNumber(number)) {
                    System.out.println(number);
                    count++;
                }
                number++;
            }
        }
        public static boolean isArmstrongNumber(int num) {
            String str = Integer.toString(num);
            int length = str.length();
            int sum = 0;

            for (int i = 0; i < length; i++) {
                int digit = Character.getNumericValue(str.charAt(i));
               // int digit2=Integer.parseInt(""+numStr.charAt(i));
                sum += Math.pow(digit, length);
            }

            return sum == num;
        }
    }

