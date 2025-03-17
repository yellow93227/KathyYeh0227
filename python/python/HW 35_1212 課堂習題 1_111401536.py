import matplotlib.pyplot as plt
A=[0,1,4,9,16,25,36,49,64,81]
B=[0,3,6,9,12,15,18,21,24,27]
plt.plot(A,lw=5)
plt.plot(B,lw=5)
plt.plot(0,10,0,100)
plt.title("The Chart",fontsize=12)
plt.xlabel("x-value",fontsize=10)
plt.ylabel("Y-value",fontsize=10)
plt.tick_params(axis="both",labelsize=10,color="red")
plt.grid()
plt.show()