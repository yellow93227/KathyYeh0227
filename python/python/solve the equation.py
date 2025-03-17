import numpy as np
coeff = np.array([[1,1],[2,4]])
rhs = np.array([9,30])
ans = np.linalg.solve(coeff,rhs)
print("ans=",ans)


import numpy as np
coeff = np.array([[1,4],[5,-1]])
rhs = np.array([-1,16])
ans = np.linalg.solve(coeff,rhs)
print("ans=",ans)

#----solve the equation II-----
root = np.roots([14.8,56.7,26.0])
print("roots = ",root)

