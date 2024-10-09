import java.util.*;

public class sumofdigitsinstring
{
public static int sumOfDigits(String stng)       //make static and u can call without creating the object
{
  int l = stng.length();
  int sum = 0;
  for (int i = 0; i < l; i++) 
  {
    if (Character.isDigit(stng.charAt(i))) 
	{
      String tmp = stng.substring(i,i+1);
      sum += Integer.parseInt(tmp);
    }
  }
  return sum;
}

public static void main (String[] args)
    {
     // Solution s= new Solution();
      Scanner scan = new Scanner(System.in);
	  String str1=scan.nextLine();
      System.out.println("The sum of the digits in the string is: "+sumOfDigits(str1));
	  }
}
