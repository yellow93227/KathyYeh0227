n1 = int(input ('n='))
sum1=0
for i in range (2,n1+1):
    sum1 = sum1 + (1-(1/i))
print("R1=", sum1)

n2 = int(input ('n='))
sum2=0
for u in range (2,n2+1):
    sum2 = sum2+(n2-(1/n2))
print("R2=", sum2)