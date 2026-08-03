package ProblemsOnStrings;
import java.util.*;
public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String A = sc.next();
        String B = sc.next();
        
  
        if ((A + A).contains(B)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}



/* public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    String s1=sc.next();
    char[] c1=s.toCharArray();
    char[] c2=s1.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    int count=0;
    for(int i=0;i<s.length();i++){
        if(c1[i]==c2[i]){
            count++;
        }
    }

    if(count==s.length()){
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
}
    

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the length of the strings
        int n = sc.nextInt(); 
        
        // Skip the newline after reading the integer
        sc.nextLine();
        
        // Read the strings A and B
        String A = sc.nextLine();
        String B = sc.nextLine();
        
        // Ensure the lengths match
        if (A.length() != n || B.length() != n) {
            System.out.println("no");
            return;
        }
        
        // Create HashMaps to store the character frequency counts
        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();
        
        // Fill the HashMaps with character frequencies for both strings
        for (char c : A.toCharArray()) {
            mapA.put(c, mapA.getOrDefault(c, 0) + 1);
        }
        
        for (char c : B.toCharArray()) {
            mapB.put(c, mapB.getOrDefault(c, 0) + 1);
        }
        
        // Compare the two HashMaps
        if (mapA.equals(mapB)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
*/