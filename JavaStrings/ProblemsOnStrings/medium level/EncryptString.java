import java.util.*;
public class encryptstring  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder name = new StringBuilder(sc.nextLine());
        
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (Character.isAlphabetic(c)) { // if(c>='a' && c<='z' || c>='A' && c<='Z')
                if (c == 'z') result.append('a');
                else if (c == 'Z') result.append('A');
                else result.append((char)(c + 1));
            } else 
            {
                result.append(c);
            }
        }

        System.out.println(result);
    }


}
