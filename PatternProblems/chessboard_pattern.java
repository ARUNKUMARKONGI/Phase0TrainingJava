package PatternProblems;

import java.util.Scanner;
public class chessboard_pattern{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=0;i<n;i++){
   for(int j=0;j<n;j++){
    char c=((i+j)%2==0)?'X':'O';
    System.out.print(c+" ");
   }
   System.out.println();
  }
 }
}
