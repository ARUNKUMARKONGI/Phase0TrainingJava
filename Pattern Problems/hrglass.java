package patterns;
/*
 1 2 3 4 5 
  2 3 4 5 
   3 4 5 
    4 5 
     5 
    4 5 
   3 4 5 
  2 3 4 5 
 1 2 3 4 5 
 */ 
public class hrglass {
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=i;j<=num;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for(int i=num-1;i>=1;i--){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=i;j<=num;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
