#---find the maximum ---

def arraycompute(b):
    b=b+[99,99]
    return b

array = [9,18,12,8,34,20,52,10,32,5,73,47]
array = arraycompute(array)
print("array=",array)
#---------------------
import numpy as np
l = np.lcm.reduce([12,18,20])
print("lcm=",l)

g= np.gcd.reduce([12,18,20])
print("gcd=",g)