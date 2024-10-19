/* Head Recursion: If a recursive function calling itself and
 that recursive call is the first statement in the function then 
 it’s known as Head Recursion. all operations are done at returning time. */

public class headrecursion {
    static void fun(int n) 
    { 
    if (n > 0)
     {  
        fun(n - 1); 
        System.out.print(" "+ n); 
     } 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int x = 3; 
    fun(x); 
      
} 
}
