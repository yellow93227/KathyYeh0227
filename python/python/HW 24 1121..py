def Compute(x):
    f=2*x*x*x-15*x*x+36*x
    return(f)
x=-10.0
max =-999.9
while (x<10.0):
  x=x+0.0005
  f=Compute(x)
  if (f>max):
    max=f
print("max of f =",format(max,".4f"))