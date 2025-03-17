p=1.0
Error=999
while Error>0.0001:
    p=p+0.00001
    Qs=43.3+1.25*p
    Qd=96.3-2.13*p
    Error= abs(Qs-Qd)
print("p=",format(p,".4f"))
print("Q=",format(Qs,".4f"))