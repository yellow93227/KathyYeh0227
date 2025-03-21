import matplotlib.pyplot as plt
import numpy as np

# 使用 numpy 生成 x 值範圍
X = np.arange(-2.0, 3.01, 0.01)  # 從 -2.0 到 3.0，每次增加 0.01
Y = 2*X**3 - 3*X**2 - 12*X + 3  # 計算對應的 y 值

print("X:", X)  # 印出 x 的列表
print("Y:", Y)  # 印出 y 的列表

plt.plot(X, Y, "-*", label="y = 2x^3 - 3x^2 - 12x + 3")
plt.title("The x-y Chart", fontsize=18)
plt.xlabel("x-value")
plt.ylabel("y-value")
plt.grid()
plt.legend()  # 顯示圖例
plt.savefig("outplot41.jpg", bbox_inches="tight")  # 儲存圖表
plt.show()
