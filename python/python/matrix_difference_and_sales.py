#----1
p=1.0
Error=999
while Error>0.0001:
    p=p+0.00001
    Qs=57.8+0.33*p
    Qd=98.4-0.45*p
    Error= abs(Qs-Qd)
print("p=",format(p,".3f"))
print("Q=",format(Qs,".3f"))
price=p*Qs
print("price=",format(price,".3f"))
#-----2
listA = [128, 76, 133, 105, 89, 93]
listB = [43, 76, 385, 116, 60]
#----反轉次序-----
listA.reverse()
print("listA = ",listA)
#----剔除index4------------
listB.pop(4)
print("listB = ",listB)
#-----listC-----
listA.extend([43,76,385,116,60])
print("listC = ",listA)
#----sum-----
listC =  [93, 89, 105, 133, 76, 128, 43, 76, 385, 116, 60]
a= sum(listC)
print("sum listC = ",a)
#-----3
targetamount=283
maxc5 = targetamount//5
maxc10 = targetamount//10
maxc50 = targetamount//50
maxc1 = targetamount//1

for c5 in range(0,maxc5+1):
    for c1 in range(0,maxc1+1):
        for c10 in range(0,maxc10+1):
            for c50 in range(0,maxc50+1):
                totalamount = c5*5 +c10*10 +c1*1 +c50*50
                if (totalamount == targetamount):
                        if(c5>c1):
                            if(c1>c10):
                                if(c10>c50):
                                    print("coin 5 =",c5)
                                    print("coin 1 =",c1)
                                    print("coin 10 =",c10)
                                    print("coin 50 =",c50)
                                    check = 5*c5+10*c10+1*c1+50*c50
                            
#5
A = [[2.4,3.1,2.6,7.5],[1.8,6.2,4.2,5.3],[9.6,4.2,5.5,3.0]]
B = [[2.0,4.0,6.0,1.0],[4.0,8.0,2.0,8.0],[5.0,7.0,3.0,3.0]]
C = [[0,0,0,0],[0,0,0,0],[0,0,0,0]]
for i in range(0,3):
    for j in range(0,4):
        Q= A[i][j]-B[i][j]
        C[i][j]=round(Q,1)
print("A-B=",C)

#----6
price = [20,25,45,30,35,50]
Q = [[3432,5544,7845,5432],[2341,6578,5460,8475],[2154,5236,3245,6532],[2523,7850,9845,5645],[1945,7453,5612,4532],[1620,4985,5854,2032]]
sales = [[0,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,0]]
for j in range(len(price)):
    for k in range(0,4):
        sales[j][k] = price[j]*Q[j][k]
print('sales = ',sales)