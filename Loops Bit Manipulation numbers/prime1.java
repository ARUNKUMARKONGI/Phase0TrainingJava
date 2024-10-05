import java.util.Scanner;

public class prime1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

       int n=sc.nextInt();
       int flag=1;

       if(n<=1)
       {
        System.out.println("not prime");
        sc.close();
        return;
       }
       for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
        flag=0;
        break;
       }
    //    for(int i=2;i*i<=n;i++){
    //     if(n%i==0){
    //     flag=0;
    //    }
    }
    if(flag==1){
        System.out.println("prime number");
    }
    else
    System.out.println("not a prime");
    
    sc.close();
    }
  
}
