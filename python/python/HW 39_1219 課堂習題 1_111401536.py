import matplotlib.pyplot as plt
import numpy as np

X=[]
Y=[]
x=-2.0
while (x<=3.0):
    y=2*x*x*x-3*x*x-12*x+3
    x=round(x,2)
    y=round(y,2)
    X.append(x)
    Y.append(y)
    x=x+0.01
print("X:",x)
print("Y:",y)



plt.plot(X,Y,"-*")
plt.title("the x-y chart",fontsize=18)
plt.xlabel("x-value")
plt.ylabel("y-value")
plt.grid()
plt.savefig("outolot41.jpg",bbox_inches="tight")
plt.show()