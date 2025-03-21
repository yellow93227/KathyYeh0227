import matplotlib.pyplot as plt

x_values = [x for x in range(-3, 10)]
y_values = [(x*x - 6*x + 10) for x in x_values]

plt.plot(x_values, y_values, "-*", label="y = x^2 - 6x + 10")
plt.xlabel("x-values")  # 補上 x 軸標籤
plt.ylabel("y-values")  # 補上 y 軸標籤
plt.title("Plot of y = x^2 - 6x + 10")  # 加上標題
plt.grid()
plt.legend()  # 顯示圖例
plt.savefig("BA_plot3_out.jpg", bbox_inches="tight")  # 儲存圖表
plt.show()
