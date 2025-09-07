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

/*  while(a>0)
    {
        if((a&1)==1)
        {
            count++;
        }
        a>>=1; //a=a>>1;
    }
        
        while num > 0:
        count += num & 1    #n&1 helps u to find the least significant bit
        num >>= 1           #right shift by 1 position helps you to move to the next bit

    return count
    
    briann kerninghan algorithm
     while (n > 0) {
            n = n & (n - 1);
            count = count + 1;
        }
        print count

        n = n & (n - 1)
This operation removes the lowest set bit from n.(rightmost setbit)
So we can keep doing this and count how many times it runs — that's the number of set bits.
        */