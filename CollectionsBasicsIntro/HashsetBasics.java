package CollectionsBasicsIntro;
import java.util.*;
public class HashsetBasics {
        public static void main(String[] args) {

            HashSet<Integer> set1 = new HashSet<>();
            set1.add(100);
            set1.add(200);
            set1.add(50);
            System.out.println("Original Hash Set: " + set1);
            //Collections.reverse(set1); //reverse doesnt work on hashset
            Integer[] arr = new Integer[set1.size()];
            set1.toArray(arr); //toArray doesnt work on int data type

            System.out.println("Array elements: ");
            for(int ele : arr){
                System.out.println(ele);
            }
            //alternative
            System.out.println(Arrays.toString(arr));

            //converting hashset to treeset
            //hashset has better performance fast, compared to treeset
            //constant time, treeset takes logn time
            //treeset stores the data in sorted order.

            TreeSet<Integer> t = new TreeSet<>(set1);
            System.out.println("TreeSet elements: ");
            for(int element : t){
                System.out.println(element);
            }
            Iterator<Integer> p = t.iterator();
            while(p.hasNext()) {
                System.out.println(p.next());
            }
        }

    }
