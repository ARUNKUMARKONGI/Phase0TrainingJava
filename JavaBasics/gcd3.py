# Input numbers from the user
a = int(input("Enter the first number: "))
b = int(input("Enter the second number: "))
a = abs(a)
b = abs(b)

while b != 0:
    a, b = b, a % b

print("The GCD of", a, "and", b, "is", a)


#(O(log(min(a,b)))

# import java.util.Scanner;

# public class Main {
#     public static void main(String[] args) {
#         Scanner sc = new Scanner(System.in);
#         int a, b;
#         System.out.print("Enter the first number: ");
#         a = sc.nextInt();
#         System.out.print("Enter the second number: ");
#         b = sc.nextInt();

#         a = Math.abs(a);
#         b = Math.abs(b);

#         while (b != 0) {
#             int temp = b;
#             b = a % b;
#             a = temp;
#         }

#         System.out.println("The GCD is " + a);
#     }
# }
