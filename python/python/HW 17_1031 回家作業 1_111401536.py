#----print la------
LA=[32,12,22,42,38,12,4,10]
print("LA = ",LA)

#-----新元素66-------
LA.append(66)
print("LA = ",LA)

#-----計算有幾個12----
x=LA.count(12)
print("LA = ",x)

#----依序加入依序加入83,12,34,75元素-----
LA.extend([83,12,34,75])
print("LA = ",LA)

#----38元素所在的index------
B = LA.index(38)
print("LA = ",B)

#----index7插入77----------
LA.insert(7,77)
print("LA = ",LA)

#----剔除index5------------
LA.pop(5)
print("LA = ",LA)

#----剔除元素10-------------
LA.remove(10)
print("LA = ",LA)

#----次序反轉---------------
LA.reverse()
print("LA = ",LA)

#----由小到大排序------
LA.sort()
print("LA = ",LA)

#----元素總和-----
LA=[32,12,22,42,38,12,4,10]
c = sum(LA)
print("LA = ",c)