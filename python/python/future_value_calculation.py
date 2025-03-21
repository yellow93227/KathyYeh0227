def computefunction(x):
    fx = 10 + 0.2 * (x - 1)
    return fx

fx = 0
for k in range(1, 31):
    fx = (fx + computefunction(k)) * 1.035  # 每年計算並應用增長率

print("30年後的價值 =", format(fx, ".4f"))
