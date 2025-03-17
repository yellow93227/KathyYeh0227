import matplotlib.pyplot as plt
import numpy as np
X=[]
F=[]
x=-5
y=2.0
e=2.71828
u=3.0
pi=3.14159
while (x<=11):
    f=((1/(y*((2*pi)**0.5)))*e**(-0.5*((x-u)/y)**2))
    f=round(f,2)
    X.append(x)
    F.append(f)
    x=x+1
print("X:",x)
print("F:",f)


plt.plot(X,F,"-*")
plt.title("the x-f chart",fontsize=18)
plt.xlabel("x-value")
plt.ylabel("f-value")
plt.grid()
plt.savefig("outolot_final1.jpg",bbox_inches="tight")
plt.show()