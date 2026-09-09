import java.util.*;
class arraylistfoundation   
{
    public static void main(String[] args) {
       var arr = new ArrayList<Integer>();
       arr.add(20);
       arr.add(10);
       arr.add(5);
       
        System.out.println("ArrayList elements: " + arr);

        //travers using for loop
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i) + " ");
        }
        //delete element at index 1
        // arr.remove(1);
        System.out.println("\nArrayList elements after deletion: " + arr);

        //sort 
        Collections.sort(arr);
        System.out.println("\nArrayList elements after sorting: " + arr);

        //what are the other methods available in ArrayList class
        System.out.println("\nArrayList elements after adding 15 at index 1: ");
        arr.add(1, 15);
        System.out.println(arr);

        //isEmpty
        System.out.println("\nIs ArrayList empty? " + arr.isEmpty());
    
        ArrayList<Integer> res = new ArrayList<>(Arrays.asList(10, 20, 30, 40,30, 50));

        System.out.println("\nArray elements: " + res.toString());

        //indexof and lastindexof
        System.out.println("\nIndex of 30: " + arr.indexOf(30));
        System.out.println("\nLast index of 30: " + arr.lastIndexOf(30));

        //traverse using iterator
        System.out.println("\nTraversing using iterator: ");
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
        //traverse using for-each loop
        System.out.println("\nTraversing using for-each loop: ");
        for(int i: arr)
        {
            System.out.print(i + " ");
        }

        //traverse using for and get method
        System.out.println("\nTraversing using for and get method: ");
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i) + " ");
        }

        //remove all elements less than 10 from arraylist
        System.out.println("\nRemoving all elements less than 10 from arraylist: ");
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) < 10) 
            {
             arr.remove(i);
            }
}
        
        /* for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)<10)
            {
                arr.remove(i);
                i--;
            }
        } */
        System.out.println("\nArrayList elements after removing elements less than 10: " + arr);

    }    
}