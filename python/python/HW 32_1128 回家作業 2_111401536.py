import numpy as np
A=np.array([[20,20,20,20],[25,25,25,25],[45,45,45,45],[30,30,30,30],[35,35,35,35],[50,50,50,50]])
B=np.array([[3432,5544,7845,5432],[2341,6578,5460,8475],[2154,5236,3245,6532],[2523,7850,9845,5645],[1945,7453,5612,4532],[1620,4985,5854,2032]])
sales=A*B
seasonSum=sales.sum(axis=1)
print("銷售額＝",sales)
print("各季總銷售額=",seasonSum)