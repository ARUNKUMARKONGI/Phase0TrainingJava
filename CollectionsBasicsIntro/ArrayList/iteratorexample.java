package CollectionsBasicsIntro.ArrayList;
import java.util.*;
public class iteratorexample {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    Iterator<Integer> it = numbers.iterator();
    while(it.hasNext())
     {
      Integer i = it.next();
      if(i < 10)
       {
        it.remove(); 
      }
    }
    System.out.println(numbers); 
   /*  for (Integer i : numbers) {
      if (i < 10) {
          numbers.remove(i); // This will throw ConcurrentModificationException
      } */
  }
  }


/*
Iterator returns the Integer Object from wrapper class. hence data type should be integer not int.
Trying to remove items using a for loop or a for-each loop would not work correctly 
because the collection is changing size at the same time that the code is trying to loop. */