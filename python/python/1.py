import matplotlib.pyplot as plt

xpt = [0,1,2,3,4,5,6,7]
ypt = [0,2.0,5.0,7.0,8.5,9.5,10.3,10.8]

plt. scatter (xpt, ypt, color="red")
plt.title ("The x-Y scatter", fontsize=16)
plt.xlabel("X-value") 
plt.ylabel("Y-value") 
plt.grid() 
plt.savefig("OUTScatter@1.jpg",bbox_inches="tight") 
plt.show()