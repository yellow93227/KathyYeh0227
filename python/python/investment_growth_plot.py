

import matplotlib.pyplot as plt
def f(x):
    sum=0
    for i in range(x):
        sum= sum +33500
        sum= sum*1.0225
    print(sum)
    return sum

x = [x for x in range(1,26)]
y = [f(x) for x in range(1,26)]

plt.plot(x,y,"-*")
plt.xlabel("years")
plt.ylabel("price")

plt.grid()
plt.savefig("BA_plot4_out.jpg",bbox_inches="tight")
plt.show()



