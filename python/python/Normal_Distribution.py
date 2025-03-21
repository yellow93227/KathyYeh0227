import matplotlib.pyplot as plt
import numpy as np
import math


y = 2.0  # 標準差
u = 3.0  # 平均值


X = np.linspace(-5, 11, num=100)

# calculater
F = (1 / (y * math.sqrt(2 * math.pi))) * np.exp(-0.5 * ((X - u) / y) ** 2)

# draw
plt.plot(X, F, "-*")
plt.title("The X-F Chart", fontsize=18)
plt.xlabel("X-value")
plt.ylabel("F-value")
plt.grid()


plt.savefig("Normal_Distribution_Plot.jpg", bbox_inches="tight")


plt.show()
