Intrate= 0.0225
annual=33500
base=0
totalamount=0
for t in range(1,26):
    base=totalamount+annual
    interest=base*Intrate
    totalamount=base+interest
    print("totalamount[",t,"]=",format(totalamount,".0f"))