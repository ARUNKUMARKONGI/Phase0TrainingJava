

public class printf {
        public static void main(String[] args) {
            String name = "John";
            float avg = 56.5646565465f;

            // Using printf for formatted output
            System.out.printf("Name: %s, Age: %.2f%n", name, avg); //0.2f not allowed
            //%n is newline character which is independent of OS
        }
    }

