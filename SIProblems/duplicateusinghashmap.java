package SIProblems;

import java.util.*;

public class duplicateusinghashmap {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        HashMap<Integer,Integer> mapobj=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            mapobj.put(arr[i],mapobj.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:mapobj.entrySet()){
            if(e.getValue()>1)
            {
                System.out.println(e.getKey()+" "+e.getValue());
            }
        }     
        
    }
}
