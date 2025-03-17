n=13
A=[9,18,12,8,34,20,52,10,32,5,73,47]
for i in range(0,5):
    n=n-1
    Max=0
    for k in range(0,n):
        if A[k]>Max:
           Max=A[k]
    A.pop(A.index(Max))
if i==4:
    print("第五大的數=",Max)

#---ans--find the maximun using function---

def compare(a,b):
    if(a>b):
        b=a
    return(b)


big=-99
A=[18,12,8,20,10,32,5]
for k in range(0,7):
    big=compare(A[k],big)
print("maximum=",big)