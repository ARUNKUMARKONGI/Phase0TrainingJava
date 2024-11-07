package CollectionsBasicsIntro;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapBasics {
    public static void main(String[] args) {
        TreeMap<Integer,String> tmap = new TreeMap<>();
        tmap.put(1,"CSE");
        tmap.put(3,"ECE");
        tmap.put(7,"Civil");
        tmap.put(6,"IT");
        System.out.println(tmap);
        //tmap.put(null,"civil");  //throws null pointer exception can't insert null key in tmap
        tmap.put(7,"IT");  //duplicate keys are replaced with new value

        System.out.println("First Key: " + tmap.firstKey());
        System.out.println("First Value: " + tmap.get(tmap.firstKey()));
        System.out.println(tmap.ceilingKey(5));

       
        System.out.println("Last Key: " + tmap.lastKey());
        System.out.println("Last Value: " + tmap.get(tmap.lastKey()));

      
        System.out.println("Submap from 'One' to 'Three': " + tmap.subMap(1, true, 6, true));

        System.out.println("Navigating in ascending order:");
        for (Map.Entry<Integer, String> entry : tmap.entrySet()) {
            Integer k = entry.getKey();
            String v = entry.getValue();
            System.out.println("Key: " + k + ", Value: " + v);
        }

    
        // Using tailMap to get entries greater than or equal to a given key
        System.out.println("Tail Map for key 2: " + tmap.tailMap(2));

        // Retrieving and displaying the last key
        System.out.println("Last Key: " + tmap.lastKey());

                // Polling and displaying the first entry (removing it from the TreeMap)
        Map.Entry<Integer, String> firstEntry = tmap.pollFirstEntry();
        System.out.println("First Entry (Polled): " + firstEntry);
        System.out.println("TreeMap after polling first entry: " + tmap);

                // Polling and displaying the last entry (removing it from the TreeMap)
        Map.Entry<Integer, String> lastEntry = tmap.pollLastEntry();
        System.out.println("Last Entry (Polled): " + lastEntry);

        System.out.println("TreeMap after polling last entry: " + tmap);
        System.out.println(tmap.pollLastEntry());
        System.out.println(tmap);
            }
        }


