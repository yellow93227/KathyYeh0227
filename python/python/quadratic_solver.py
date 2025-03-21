a = 14.8
b = 86.7
c = 26

discriminant = b**2 - 4*a*c

if discriminant < 0:
    print("No real roots.")
else:
    x1 = (-b + pow(discriminant, 0.5)) / (2*a)
    x2 = (-b - pow(discriminant, 0.5)) / (2*a)
    print("x1 =", x1, "x2 =", x2)
