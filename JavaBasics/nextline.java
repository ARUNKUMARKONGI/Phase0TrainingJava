import java.util.Scanner;

public class nextline {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int num = sc.nextInt();

        sc.nextLine(); 
        
        String str = sc.nextLine(); 

        System.out.println("Integer entered: " + num);
        System.out.println("String entered: " + str);

        //read character from user
        char c = sc.next().charAt(0);
        System.out.println("Character entered: " + c);
    }
}

