package StringBasics.Problems;
import java.util.Scanner;
public class EncryptString {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //System.out.println("Enter a name: ");
            String name = scanner.nextLine().trim();
            StringBuilder result = encryptName(new StringBuilder(name));
            System.out.println(result);
            scanner.close();
        }
        private static StringBuilder encryptName(StringBuilder name) {

                String ch = "";
                //StringBuilder ch1=new StringBuilder();
                for(int i=0;i<name.length();i++)
                {
                    char c = name.charAt(i);
                    int a = Integer.parseInt(""+c);
                    int b= Character.getNumericValue(c);
                    if(Character.isAlphabetic(c))
                        ch += (char)(name.charAt(i)+1);
                       // ch1.append((char) (name.charAt(i) + 1));
                    else
                        ch+=c;
                }
            StringBuilder res = new StringBuilder(ch);
                return res;
            }
    }

