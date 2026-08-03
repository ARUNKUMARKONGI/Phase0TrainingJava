import java.io.*;
import java.util.*;
public class compressstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder str=new StringBuilder();
        char prev=s.charAt(0);
        int count=1;
        for(int i=1;i<s.length();i++){
            char current=s.charAt(i);
            if(prev!=current){
                str.append(prev);
                str.append(count);
                count=1;
                prev=current;
            }
            else{
                count++;
            }
        }
        str.append(prev);
        str.append(count);
        System.out.println(str);
    }
}


/* import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i-1)).append(count);
                count = 1;
            }
        }
        
        result.append(s.charAt(s.length() - 1)).append(count);
        System.out.println(result.toString());
    }
} */
