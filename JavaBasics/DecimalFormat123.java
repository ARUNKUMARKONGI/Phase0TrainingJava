import java.text.DecimalFormat;
import java.util.*;
public class DecimalFormat123 {
    public static void main(String[] args) {
        double number = 1233456.456789;
        DecimalFormat df = new DecimalFormat(".00");
        System.out.println(df.format(number));
    }
}