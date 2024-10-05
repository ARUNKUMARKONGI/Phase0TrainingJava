package patterns;

import java.util.Scanner;

class grietpattern
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
        System.out.println();

        String x="";
        for(char i=0;i<s.toCharArray().length;i++){
            x=x+s.toCharArray()[i];
            System.out.println(x);
        }

        System.out.println();


        String y="";
        for(char i:s.toCharArray()){
            y=y+i;
            System.out.println(y.replace("", " ").trim());
        }
    }
}
