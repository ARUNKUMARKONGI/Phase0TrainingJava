package patterns;

import java.util.Scanner;

/* public class griet2 {
    public static void main(String[] args) {
        String s="ARUNKONGI";
        String res="";
        for(char i:s.toCharArray()){
            res+=i;
            System.out.println(res.replace("", " "));
        }
    }
} */

//USING STRINGBUILDER IS MORE EFFICIENT AS ITS MUTABLE, STRING CLASS NOT MUTABLE.
public class grietpattern2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());

        //StringBuilder res=""; not allowed

        StringBuilder res=new StringBuilder(); //can pass value inside to declare string
        // System.out.println(res.toString());

        for(int i=0;i<str.length();i++){
            res.append(str.charAt(i));
            System.out.println(res.toString().replace("", " ").trim());
        }
    }
}