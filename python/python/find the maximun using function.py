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