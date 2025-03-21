import matplotlib.pyplot as plt

def f(x):
    sum = 0
    for i in range(x):
        sum = (sum + 33500) * 1.0225  # 每年加33500後，對整體進行利率增長
    return sum

x = [year for year in range(1, 26)]
y = [f(year) for year in range(1, 26)]

plt.plot(x, y, "-*", label="Investment Value Over Time")
plt.xlabel("Years")
plt.ylabel("Price")
plt.title("Investment Growth Over 25 Years")
plt.grid()
plt.legend()
plt.savefig("BA_plot4_out.jpg", bbox_inches="tight")
plt.show()



