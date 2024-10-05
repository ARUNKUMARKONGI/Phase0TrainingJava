
""" Matrix multiplication is only valid if the number of columns of the first matrix are equal 
to the number of rows of the second matrix
 further, the resulting matrix will have the
number of rows of the first matrix and the number of columns of the second matrix.
 """
def multiplication(A, B):
    #if len(A[0]) != len(B):
    if C1 != R2:
        print("Multiplication not Possible")
        return None
    else:
        result = [[0 for _ in range(len(B[0]))] for _ in range(len(A))]
    
    for i in range(len(A)):
        for j in range(len(B[0])):
            for k in range(len(B)):
                result[i][j] += A[i][k] * B[k][j]
                
    return result


R1, C1 = map(int, input().split())
R2, C2 = map(int, input().split())


A = [list(map(int, input().split()[:C1])) for _ in range(R1)]
B = [list(map(int, input().split()[:C2])) for _ in range(R2)]

result = multiplication(A, B)

if result:
    print("Resultant Matrix:")
    for row in result:
        print(row)