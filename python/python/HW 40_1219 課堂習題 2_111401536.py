import matplotlib.pyplot as plt
import numpy as np
from math import factorial
X=[]
P=[]
x=0
y=1.2
e=2.71828
while (x<=20):
    p=((e**-1*y)*y**x)*(1/factorial(x))
    p=round(p,2)
    X.append(x)
    P.append(p)
    x=x+1
print("X:",x)
print("P:",p)



plt.plot(X,P,"-*")
plt.title("the x-p chart",fontsize=18)
plt.xlabel("x-value")
plt.ylabel("p-value")
plt.grid()
plt.savefig("outolot40.jpg",bbox_inches="tight")
plt.show()