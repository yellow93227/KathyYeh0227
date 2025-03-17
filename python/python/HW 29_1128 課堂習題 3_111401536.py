import numpy as np
A=np.array([[44,116,241,386,544,284],[44,116,241,386,544,284],[44,116,241,386,544,284],[44,116,241,386,544,284]])
B=np.array([[35273,21534,12573,31567,52386,44138],[25673,55728,31245,33278,51342,22464],[21345,22179,32189,36296,33106,43278],[53278,32785,43167,21367,44579,32685]])
sales=A*B
taipeiSum=sales.sum(axis=0)
print("營收＝",sales)
print("各站收入總合=",taipeiSum)


#---ans-----
p= np.array([[44,44,44,44],[116,116,116,116],[241,241,241,241],[386,386,386,386],[544,544,544,544],[284,284,284,284]])
q= np.array([[35,25,21,53],[21,55,22,32],[12,31,32,43],[31,33,36,31],[52,51,33,44],[44,22,43,32]])
salesII=p*q
sumtaipeiII=salesII.sum(axis=0)
sumseason = salesII.sum(axis=1)
print("sales of all tracks:",salesII)
print("sales of line:",sumtaipeiII)
print("sales of season",sumseason)