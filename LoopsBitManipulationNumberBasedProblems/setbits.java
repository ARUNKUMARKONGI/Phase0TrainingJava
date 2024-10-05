import java.util.Scanner;

public class setbits{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println("number of set bits: "+count(a));
    sc.close();
        
    }
    public static int count(int n)
    {
        int count=0;
        while(n>0)
        {
            if(n%2==1)
            {
                count++;
            }
            n=n/2;
          
        }
        return count;
    }
}