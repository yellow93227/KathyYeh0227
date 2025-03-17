A = [[1,3],[1,0],[1,2]]
B = [[0,0],[7,5],[2,1]]
C = [[0,0],[0,0],[0,0]]
for i in range(0,3):
    for j in range(0,2):
        C[i][j] = A[i][j]-B[i][j]
print("A+B=",C)