import numpy as np
import matplotlib.pyplot as plt

def f(x):
    return np.where(x != 0, np.sin(x) / np.abs(2 * x), 0)

# 生成 x 值範圍
xs = np.linspace(-np.pi * 10, np.pi * 10, 100)

# 繪製圖表
plt.grid(axis="both")
plt.plot(xs, f(xs), color='g', linewidth=4)
plt.title("Plot of sin(x) / |2x|")
plt.xlabel("x")
plt.ylabel("f(x)")
plt.show()


plt.savefig("outolot42.jpg", bbox_inches="tight")
