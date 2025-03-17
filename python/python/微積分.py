import pylab
a,b,n=1,2,100
fn = lambda x:pylab.x*(2*x-1)**0.5
xs,h=pylab.linspace(a,b,n+1,retstep=True)
ys=pylab.x*(2*x-1)**0.5
rsum,lsum,usum,tsum=0,0,0,0
yl=ys[0]
for y2 in ys[1:]:
    rsum+=y1
    if y1<y2:
        lsum+=y1
        usum+=y2
    else:
        lsum+=y2
        usum+=y1
    tsum+=y1+y2
    y1=y2
rsum*=h
lsum*=h
usum*=h
tsum*=h/2
isum= 1+pylab.sqrt(2)

isum1=h*sum(ys[:-1])
isum2=h*sum([ys[0],2*sum(ys[1:-1]),ys[-1]])/2
isum3=h*sum([ys[0],4*sum(ys[1:-1:2]),2*sum(ys[2:-1:2]),ys[-1]])/3
print("公式求積:",round(usum,9),"誤差：",round(abs(isum-rsum),10))
print("矩形積分:",round(usum,9),"誤差：",round(abs(isum-usum),10))
print("上矩形積分:",round(lsum,9),"誤差：",round(abs(isum-lsum),10))
print("下矩形積分:",round(lsum,9),"誤差：",round(abs(isum-tsum),10))
