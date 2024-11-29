package CollectionsBasicsIntro.hmapproblems;
import java.util.*;
public class duplicateusinghashmap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
            hmap.put(arr[i],hmap.getOrDefault(arr[i], 0)+1);
        }
         /*for(var i:hmap.entrySet()) 
        //var is a local variable It declare a variable without explicitly specifying its type. 
        //The compiler will infer the type of the variable based on the value assigned to it. 
         {
            if(i.getValue()>1)
            {
                System.out.println("duplicate number is: "+i.getKey());
                break;
            }
        }   */

        int flag=0;
        for(Integer i:hmap.keySet()) //int or Integer both can be used autoboxing and unboxing
        {
            if(hmap.get(i)>1)
            {
                System.out.println("duplicate number is: "+i);
                flag=1;
                break;
            }
        }

       if(flag==0)
        System.out.println("no duplicate");

        /* for(Map.Entry<Integer, Integer> e:hmap.entrySet()){ or use var instead of Map.Entry
            if(e.getValue()>1){
                System.out.println("duplicate number is : "+e.getKey());
            }
        } */
    }
     
    }
