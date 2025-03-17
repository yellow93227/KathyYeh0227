import pylab
def f(x):
    return pylab.sin(1*x)/(abs(2*x))
xs=pylab.linspace(-pylab.pi*10,pylab.pi*10,100)
pylab.grid(axis="both")
pylab.plot(xs,f(xs),color='g',linewidth=4)
pylab.show()