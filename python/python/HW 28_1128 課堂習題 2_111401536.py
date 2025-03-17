import numpy as np
A=np.array([44,116,241,386,544,284])
B=np.array([35273,21534,12573,31567,52386,44138])
sales=A*B
taipei=sales.sum(axis=0)
print("營收＝",sales)