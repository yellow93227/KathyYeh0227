import numpy as np
coeff = np.array([[2,-1,0],[5,3,2],[3,0,1]])
rhs = np.array([7,3,7])
ans = np.linalg.solve(coeff,rhs)
print("ans=",ans)


