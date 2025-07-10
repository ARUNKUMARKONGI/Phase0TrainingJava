package CollectionsBasicsIntro.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListBasics {

        public static void main(String[] args) {
            ArrayList<String> c1= new ArrayList<String>(3);
            c1.add("Red");
            c1.add("Green");
            c1.add("Black");

            System.out.println("Original array list: " + c1);
            //Increase capacity to 6
            c1.ensureCapacity(6);
            c1.add("White");
            c1.add(2,"Gold");
            c1.add("Yellow");
            System.out.println("New array list: " + c1);
            System.out.println("element at 2nd position: "+c1.get(2));

            if(c1.contains("gold")){
                System.out.println("element is present");
            }

            Collections.sort(c1);
            Collections.reverse(c1);
            System.out.println("sorted arraylist is: "+c1);
            List<String> sub_List = c1.subList(0, 3);
            //System.out.printf("sub list is: %n%s", sub_List);
            System.out.println("sub list is: \n"+sub_List);
            //Collections.swap(c1, 0, 2);
            System.out.println(c1);
            //c1.addAll(c2)
           // c1.isEmpty();
            //c1.remove();
            for(int i=0;i<c1.size();i++)
                System.out.println(c1.get(i));

            /*for (String ele : c1)
                System.out.println(ele);*/
        }
        }

        

    /*the CollectionsBasicsIntro.ArrayList would need to resize its internal array multiple times as elements are added,
        which can result in more memory reallocations and potentially impact performance.

Using the interface type List allows for flexibility, as it doesn't tie the
 implementation to a specific class. explain this with example

        List<String> myList;
        // Case 1: ArrayList
        myList = new CollectionsBasicsIntro.ArrayList<>();
        // Case 2: Switch to a LinkedList
        myList = new LinkedList<>();
        
        
        
         ArrayList<String> c1= new ArrayList<String>(3);
          c1.add("a");
          c1= new LinkedList<String>(); this will lead error
            */