A = [[2.4, 3.1, 2.6, 7.5], 
     [1.8, 6.2, 4.2, 5.3], 
     [9.6, 4.2, 5.5, 3.0]]

B = [[2.0, 4.0, 6.0, 1.0], 
     [4.0, 8.0, 2.0, 8.0], 
     [5.0, 7.0, 3.0, 3.0]]

# 動態建立 C
rows = len(A)
cols = len(A[0])
C = [[0] * cols for _ in range(rows)]

# 矩陣相減
for i in range(rows):
    for j in range(cols):
        C[i][j] = A[i][j] - B[i][j]

# 印出結果
for row in C:
    print(row)
