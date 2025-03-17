#-------Find the roots-------
a = 14.8
b = 56
c = 26
VAL = b**2 - 4*a*c
if VAL < 0:
    print("The problem can not be solved")
else:
    print("the problem is solvable")
VAL = VAL** 0.5
root1 = (-b + VAL)/(2*a)
root2 = (-b - VAL)/(2*a)
print("root 1",format (root1,'.4f'))
print("roo2 2",format (root2,'.4f'))