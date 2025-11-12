package StringsBasedProblems;

import java.util.*;

public class CheckKVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int k = sc.nextInt();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') count++;
        }
        if(count==k) System.out.println("Yes");
        else System.out.println("No");
    }
}
