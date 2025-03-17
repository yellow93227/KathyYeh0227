import matplotlib.pyplot as plt

Mercedes = [3367, 4120, 5539,4328,6213]
BMW = [4000, 3590, 4423,3528,2987]
Lexus = [5200, 4930, 5350,6721,5230]

years = [2021,2022,2023,2024,2025]

plt.xticks(years)


plt.plot(years,Mercedes,"-*",label="Mercedes")
plt.plot(years,BMW,"-*",label="BMW")
plt.plot(years,Lexus,"-*",label="Lexus")

plt.title("Sales Report",fontsize=14)
plt.xlabel("Years",fontsize=12)
plt.ylabel("Sales Amount",fontsize=12)
plt.tick_params(axis="both",labelsize=12,color="red")

plt.savefig("BA_Plot2_out.jpg",bbox_inches="tight")
plt.show()