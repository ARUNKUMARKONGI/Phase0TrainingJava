def Add(A, B):
    result = []
    for i in range(len(A)):
        row = []
        for j in range(len(A[0])):
            row.append(A[i][j] + B[i][j])
        result.append(row)
    
    print("Resultant Matrix is:")
    for row in result:
        print(row)
        
R,C = map(int, input().split())
A = []
B=[]

for i in range(R):          
    l1=list(map(int,input().split()))
    A.append(l1)
    
for i in range(R):          
    l1=list(map(int,input().split()))
    B.append(l1)

print("Matrix A:")
for row in A:
    print(row)
print("Matrix B:")
for row in B:
    print(row)
      
     
Add(A,B)             
    