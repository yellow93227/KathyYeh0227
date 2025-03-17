listA = [128, 76, 133, 105, 89, 93]
listB = [43, 76, 385, 116, 60]
#----反轉次序-----
listA.reverse()
print("listA = ",listA)
#----剔除index4------------
listB.pop(4)
print("listB = ",listB)
#-----listC-----
listA.extend([43,76,385,116])
print("listC = ",listA)
#----sum-----
listC =  [93, 89, 105, 133, 76, 128, 43, 76, 385, 116]
for i in range(0,10):
    a=sum(listC)
print("sum listC = ",a)
#---for sum---
listC =  [93, 89, 105, 133, 76, 128, 43, 76, 385, 116]
sum=0
for i in range(0,10):
    sum=sum+(listC)
print("sum of listC by computing = ",sum)