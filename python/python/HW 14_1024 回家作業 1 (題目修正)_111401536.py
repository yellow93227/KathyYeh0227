t=17
five=0
one=3
ten=t-five
while 5*five+10*ten+one>108:
    five+=1
    ten=t-five
print("5元=",five,"10元=",ten,"1元=",one)


n= 20
targetamount=108
maxc5 = targetamount//5
maxc10 = targetamount//10
maxc1 = targetamount//1

for c5 in range(0,maxc5+1):
    for c10 in range(0,maxc10+1):
        for c1 in range(0,maxc1+1):
            totalamount = c5*5 +c10*10 +c1*1
            if (totalamount == targetamount):
                totalcoin = c5 + c10 + c1
                if (totalcoin == n):
                    if(c5>c10):
                        if(c10>c1):
                            print