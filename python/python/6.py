Python 3.10.7 (v3.10.7:6cc6b13308, Sep  5 2022, 14:02:52) [Clang 13.0.0 (clang-1300.0.29.30)] on darwin
Type "help", "copyright", "credits" or "license()" for more information.
>>> A = [[2.4,3.1,2.6,7.5],[1.8,6.2,4.2,5.3],[9.6,4.2,5.5,3.0]]
... B = [[2.0,4.0,6.0,1.0],[4.0,8.0,2.0,8.0],[5.0,7.0,3.0,3.0]]
... C = [[0,0,0,0],[0,0,0,0],[0,0,0,0]]
... for i in range(0,3):
...     for j in range(0,4):
...         C[i][j] = A[i][j]-B[i][j]
