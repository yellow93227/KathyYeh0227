Intrate= 0.025
annual=55000
base=0
totalamount=0
for t in range(1,16):
    base=totalamount+annual
    interest=base*Intrate
    totalamount=base+interest
    print("totalamount[",t,"]=",format(totalamount,".0f"))

#---2----

k=0
while totalamount<3500000:
    base=totalamount+annual
    interest=base*Intrate
    totalamount=base+interest
    k=k+1
print("n=",k)