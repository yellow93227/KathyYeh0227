import matplotlib.pyplot as plt
a=[30,67,45,90,95,80,70,20]
c=[a[0],a[2],a[6]]
b=[i*0.4+40 for i in c]
print("調整後成績：",b)
B=[52,67,58,90,95,80,70,68]



plt.plot(a,lw=5)
plt.plot(B,lw=5)
plt.plot(0,10,0,100)
plt.title("Student's Grade",fontsize=12)
plt.xlabel("Students",fontsize=10)
plt.ylabel("Grades",fontsize=10)
plt.tick_params(axis="both",labelsize=10,color="red")
plt.grid()
plt.show()