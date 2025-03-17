IntRate= 0.0225
Annual = 33500
TotalAmount = 0
Base = 0
for t in range(1,26):
    Base = TotalAmount + Annual
    x= Base*IntRate
    TotalAmount = Base+x
    print("Amount[",t,"]= ",format(TotalAmount,".4f"))

    import matplotlib.pyplot as plt
    YEAR = [t]
    plt.xticks(YEAR)
    plt.plot(YEAR,TotalAmount,"-*")

    plt.xlabel("Year",fontsize=12)
    plt.ylabel("TotalAmount",fontsize=12)
    plt.tick_params(axis="both",labelsize=12,color="red")

    plt.savefig("BA_Plot03_OUT.jpg",bbox_inches="tight")

plt.grid()
plt.show()