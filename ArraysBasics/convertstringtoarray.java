

import java.util.Arrays;

public class convertstringtoarray {
        public static void main(String[] args) {
          String myStr = "Hello";
          char[] myArray = myStr.toCharArray();
        //   System.out.println(myStr[0]); //gives error
        System.out.println(myArray[3]);
        System.out.println(Arrays.toString(myArray));

        for(char i:myArray)
        {
          System.out.println(i);
         
        }
        String str="arun";
          char c='n';
          String c2=String.valueOf(c);
        System.out.println(str+c);

        System.out.println(Character.getNumericValue(c));

        String str2="454";
        int a=Integer.parseInt(str2);
        System.out.println(Integer.toBinaryString(a));
        char c4=str2.charAt(2);
        System.out.println(c4);

        }
      }
