package Arrays1D2DProblems.Arrays1D;
import java.util.*;
public class firstandlastposofkeyunsorted {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
         arr[i] = sc.nextInt();
      int key = sc.nextInt();

      int first = -1, last = -1;
      for(int i=0;i<n;i++) {
         if(arr[i] == key) {
            if(first == -1)
               first = i;
            last = i;
         }
      }

      if(first == -1)
         System.out.println("Key not found");
      else
         System.out.println("First occurrence: " + first + "\nLast occurrence: " + last);
   }
}
