#三次平滑曲線---解一
import matplotlib.pyplot as plt
import numpy as np
x = np.arange(-2,3,0.0001)
y = [(2*x**3-3*x**2-12*x+3) for x in x]

plt.plot(x,y,"-*")
plt.xlabel("x")
plt.ylabel("y")

plt.grid()
plt.savefig("BA_Plot01",bbox_inches="tight")
plt.show()
#三次平滑曲線---解二
x=[]
y=[]
x=-2.0000
while(x<= 3.0):
    y=2*x**3-3*x**2-12*x+3
    x=round(x,4)
    y=round(y,2)
    x.append(x)
    y.append(y)
    x=x+0.0001

plt.plot(x,y,"-*")
plt.xlabel("x")
plt.ylabel("y")

plt.grid()
plt.savefig("BA_Plot02",bbox_inches="tight")
plt.show()