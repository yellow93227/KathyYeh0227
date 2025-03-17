import matplotlib.pyplot as plt
x = [ x for x in range(-3,10)]
y = [(x*x-6*x+10) for x in x]

plt.plot(x,y,"-*")
plt.xlabel
plt.ylabel

plt.grid()
plt.savefig("BA_plot3_out.jpg",bbox_inches="tight")
plt.show()