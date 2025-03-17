#------------
def compute(a1,a2):
    r1=a1+a2
    r2=a1-a2
    r3=a1*a2
    r4=a1/a2
    return(r1,r2,r3,r4)
#------main logic
x1=float(input("x1 ="))
x2= float(input("x2="))
b1,b2,b3,b4=compute(x1,x2)
print("x1+x2=",b1)
print("x1-x2=",b2)
print("x1*x2=",b3)
print("x1/x2=",b4)