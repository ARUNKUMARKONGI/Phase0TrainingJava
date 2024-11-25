// Java Code to check if two Strings are anagrams of 
// each other using sorting

import java.util.Arrays;

public class AnagramUsingSorting {

    
    static boolean areAnagrams(String s1, String s2) {
        
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

     
        return Arrays.equals(s1Array, s2Array);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(areAnagrams(s1, s2));
    }
}