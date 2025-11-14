package ProblemsOnStrings;

import java.util.*;

import java.util.*;

public class characteroccurrconsecutively {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        String[] parts = line.split(" ");
        String str = parts[0];
        char ch = parts[1].charAt(0);
        boolean flag = false;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==ch && str.charAt(i+1)==ch)
            {
                flag = true;
                break;
            }
        }
        if(flag) System.out.print("YES");
        else System.out.print("NO");
    }
}

/* another way to read input
        String str = s.next(); //reads until space
        char ch = s.next().charAt(0);
 */
