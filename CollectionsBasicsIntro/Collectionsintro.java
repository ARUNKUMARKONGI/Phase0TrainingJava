import java.util.*;
class Collectionsintro{
    public static void main(String args[]){
       HashSet<Integer> arr = new HashSet<>();
       //how to insert elements into arraylist
       arr.add(10);
       arr.add(20);
       arr.add(30);
       arr.add(2);
       arr.add(7);
       arr.add(2);
       arr.add(7);
       System.out.println("HashSet: " + arr);
       //enhanced for loop
       for (int num : arr) {
           System.out.println("Element: " + num);
       }
       //using forEach method lamba expression
       arr.forEach(griet -> System.out.println("Element: " + griet));

     //operations on arraylist
     //get the size of the arraylist
     System.out.println("Size of HashSet: " + arr.size());
     //get an element at a specific index
    //  System.out.println("Element at index 1: " + arr.get(1));
     //remove an element from the arraylist
     arr.remove(0);
     System.out.println("HashSet after removal: " + arr);
        //check if the HashSet contains a specific element
        System.out.println("HashSet contains 20: " + arr.contains(20));


        }

  
}

