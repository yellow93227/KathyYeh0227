i=100000
year =10
rv=10000
ydep=(i-rv)/year

def accountingcomputation(t2,ydep2,accdep2,bookvalue2):
  accdep2=accdep2+ydep2
  bookvalue2=bookvalue2-ydep2
  return t2,ydep2,accdep2,bookvalue2

for t in range(1,11):
  t,ydep,accdep,bookvalue=accountingcomputation(t,ydep,accdep,bookvalue)
print(t,ydep,accdep,bookvalue)