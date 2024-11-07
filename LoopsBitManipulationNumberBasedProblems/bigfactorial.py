n = int(input("Enter a number: "))

factorial = 1
for i in range(2, n + 1):
    factorial *= i

print(factorial)


""" private static BigInteger calculateFactorial(int n) {
 BigInteger result = BigInteger.ONE
 for (int i = 2; i <= n; i++) Do
 result = result.multiply(BigInteger.valueOf(i))
 end for
 return result """