a = float (input())
b = float (input())
c = float (input())
if b < 0 :
    print("the problem is not valued")

x1 = (b*-1+pow(b**2-4*a*c,0.5))/(2*a)
x2 = (b*-1-pow(b**2-4*a*c,0.5))/(2*a)
print('x1=',x1,'x2=',x2)
