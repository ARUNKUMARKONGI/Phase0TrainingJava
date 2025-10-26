package SIProblems;

import java.util.Set;

public class distinctelementsinwindowofsizek {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 2, 3};
       
        int k = 4;
        int n = arr.length;
        for (int i = 0; i <= n - k; i++) {
            Set<Integer> distinctElements = new java.util.HashSet<>();
            for (int j = i; j < i + k; j++) {
                distinctElements.add(arr[j]);
            }
            System.out.print(distinctElements.size()+" ");
        }
    }   
}



/* import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        System.out.print(map.size() + " ");
        for(int i=k;i<n;i++){
            int left = arr[i-k];
            map.put(left, map.get(left)-1);
            if(map.get(left) == 0) map.remove(left);
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            System.out.print(map.size() + " ");
        }
    }
}
 */