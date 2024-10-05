# Input numbers from the user
a = int(input("Enter the first number: "))
b = int(input("Enter the second number: "))
a = abs(a)
b = abs(b)

while b != 0:
    a, b = b, a % b

print("The GCD of", a, "and", b, "is", a)


#(O(log(min(a,b)))