/* If a recursive function calling itself and that recursive call is the last statement 
in the function then it’s known as Tail Recursion. 
After that call the recursive function performs nothing. */

public class tailrecursion {    
    static void fun(int n) 
    { 
         if (n > 0)  
         { 
                  System.out.print(n + " "); 
                  fun(n - 1); 
        } 
    } 
  public static void main(String[] args) 
  { 
    int x = 3; 
    fun(x); 
  } 
}
