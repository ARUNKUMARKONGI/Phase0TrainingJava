public class bitmanipulation {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int a=9; //1001
    int count=0;

    //basic arithmetic approach
    //bitwise operators
    while(a>0)
    {
        if((a&1)==1)
        {
            count++;
        }
        a>>=1; //a=a>>1;
    }



   }
}
