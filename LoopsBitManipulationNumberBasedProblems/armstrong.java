import java.util.*;

public class armstrong {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(arm(n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
    static boolean arm(int n){
        int arm=0;
        String s=Integer.toString(n);
        for(int i=0;i<s.length();i++){
          int a=Character.getNumericValue(s.charAt(i));
          arm=arm+(int)Math.pow(a,3);
        }
        if(arm==n){
            return true;
        }
        else{
            return false;
        }
        
    }
} 