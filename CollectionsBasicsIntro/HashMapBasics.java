import java.util.HashMap;

/* 
A hashmap is highly useful in problems where you need efficient lookups, insertions, deletions, and frequency counting,
finding duplicate, finding unique elements, anagrams, 2 sum problems etc..
Hashmaps offer constant-time complexity O(1) for insertion, deletion, and access operations
Iterating over hashmap takes O(n) time*/

public class HashMapBasics {
        public static void main(String[] args) {
            
            HashMap<Integer, String> map = new HashMap<>();
           
     
            map.put(3, "IT");
            map.put(1, "CSE");
            map.put(4, "MECH");
            map.put(2, "ECE");

            System.out.println("Initial HashMap: " + map);

         
            map.put(6, "Civil");
            map.put(2, "EEE"); 
            System.out.println("HashMap after adding and updating elements: " + map);

      
            System.out.println("Value for key 3: " + map.get(3));

           
            map.remove(1);
            System.out.println("HashMap after removing key 1: " + map);

   
            System.out.println("Does HashMap contain key 4? " + map.containsKey(4));

            System.out.println("Does HashMap contain value 'cse'? " + map.containsValue("cse"));

        
            System.out.println("Iterating through HashMap:");
            for (int key : map.keySet()) {
                System.out.println("Key: " + key + ", Value: " + map.get(key));
            }

            for(var i:map.entrySet())
            {
                System.out.println("Key: "+i.getKey()+", Value: "+i.getValue());
            }
/*
            for(Map.Entry<Integer,String> i: hashMap.entrySet())
            {
                System.out.println("Key: "+i.getKey()+", Value: "+i.getValue());
            }
        
*/
            /*for(String val: hashMap.values())
            {
                System.out.println("Values: "+val);
            }*/

            /*HashMap: Allows one null key.
            TreeMap: Does not allow null keys. (sorted output)
            It throws a NullPointerException if you attempt to insert a null key.*/

           // map.put(null,"DS");
          //  System.out.println(map.get(null));
            //map.put(null,"AIML");  //only current null key is allowed.
           // System.out.println(map.get(null));

            System.out.println(map.values());
            System.out.println(map.getOrDefault(10,"0"));  //here griet is default value
            //since key 10 doesn't exists

            map.putIfAbsent(4,"Computers"); //since key 4 is already present it wont affect
          //  map1.putAll(map2);
          
            System.out.println(map);
        }
    }

