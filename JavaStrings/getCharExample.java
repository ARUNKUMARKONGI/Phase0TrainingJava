package StringBasics;

import java.util.Scanner;

public class getCharExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String str = "Java Programming";

        //sc.nextLine();
        String str=sc.nextLine();
        //String ch = "GRIET TRAINING";
        char[] str2= sc.nextLine().toCharArray();
        int sr=sc.nextInt();
        int dest=sc.nextInt();
        int dstbgn=sc.nextInt();
       // char[] ch  = new char[]{'G','R','I','E','T','C','O','L','L','E','G','E'};
        try {
            str.getChars(sr, dest, str2, dstbgn);
            System.out.println(str2);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Oops Array Index Exceeded!!");
        }
    }
}