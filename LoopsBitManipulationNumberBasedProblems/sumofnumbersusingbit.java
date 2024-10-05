roblem: Sum of 2 numbers using bit manipulation

Code:

def add(x, y):
    while y != 0:
        carry = x & y
        x = x ^ y
        y = carry << 1
    return x

# Take input from user
num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

result = add(num1, num2)
print("Sum:", result)


Explanation:

Input: num1 = 5, num2 = 3

Step-by-Step Execution:

1. x = 5 (101 in binary), y = 3 (011 in binary)
2. carry = x & y = 101 & 011 = 001 (1 in decimal)
3. x = x ^ y = 101 ^ 011 = 110 (6 in decimal)
4. y = carry << 1 = 001 << 1 = 010 (2 in decimal)
5. Repeat steps 2-4 until y is 0:
    - carry = 110 & 010 = 010 (2 in decimal)
    - x = 110 ^ 010 = 100 (4 in decimal)
    - y = 010 << 1 = 100 (4 in decimal)
    - carry = 100 & 100 = 100 (4 in decimal)
    - x = 100 ^ 100 = 000 (0 in decimal)
    - y = 100 << 1 = 000 (0 in decimal)
6. y is now 0, so exit loop. x holds the sum: x = 8

Output: Sum: 8

How it works:

- x & y calculates the carry bits.
- x ^ y calculates the sum bits without carry.
- carry << 1 shifts the carry bits left, effectively multiplying by 2.
- Repeat until there's no carry left.
