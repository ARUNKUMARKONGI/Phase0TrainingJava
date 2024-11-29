package CollectionsBasicsIntro.hmapproblems;

import java.util.HashMap;
import java.util.Scanner;

public class duplicateusinghashmap2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hmap=new HashMap<>();
        
        int duplicate=-1;
        for(int i:arr)
        {
            hmap.put(i, hmap.getOrDefault(i, 0)+1);
            if(hmap.get(i)>1)
            {
                duplicate=i;
                break;
            }
        }
        if(duplicate!=-1)
        {
            System.out.println("duplicate number is: "+duplicate);
        }
        else
        System.out.println("no duplicate element");
    }
}
