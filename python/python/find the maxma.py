#----find the maximal
A = [23,78,45,8,32,56]
Max = -99
for k in range(0,6):
    if A[k]>Max:
        Max=A[k]
print("max=",Max)

min= 90
for i in range(0,6):
    if A[i]<min:
        min = A[i]
print("min=",min)

B=[9,18,12,8,34,20,52,10,32,5,73,47]
max=90
for g in range(0,12):
    if B[g]>Max:
        Max=B[g]
print("max=",Max)