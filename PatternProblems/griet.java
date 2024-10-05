package patterns;

import java.util.Scanner;

class griet
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s="GRIET";

        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}