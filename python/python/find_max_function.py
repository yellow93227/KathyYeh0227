def Compute(x):
    f = 2*x*x*x - 15*x*x + 36*x
    return f

x = -10.0
max_value = -999.9

while x < 10.0:
    x = x + 0.0005
    f = Compute(x)
    if f > max_value:
        max_value = f

print("max of f =", format(max_value, ".4f"))
