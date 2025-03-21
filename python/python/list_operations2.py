listA = [128, 76, 133, 105, 89, 93]
listB = [43, 76, 385, 116, 60]

# ---- 反轉次序 -----
listA.reverse()
print("listA = ", listA)

# ---- 剔除 index 4 ----
listB.pop(4)
print("listB = ", listB)

# ---- 合併 listA 和 listB，形成 listC -----
listA.extend([43, 76, 385, 116])
print("listC = ", listA)

# ---- 使用 sum() 函數計算總和 -----
listC = [93, 89, 105, 133, 76, 128, 43, 76, 385, 116]
total = sum(listC)
print("sum listC = ", total)

# ---- 使用 for 迴圈計算總和 -----
sum_value = 0
for i in listC:
    sum_value += i
print("sum of listC by computing = ", sum_value)
