i = 100000    # 初始投資金額
year = 10     # 折舊年限
rv = 10000     # 殘值
ydep = (i - rv) / year  # 年折舊額

accdep = 0     # 初始累計折舊為 0
bookvalue = i  # 初始帳面價值為初始投資金額

def accountingcomputation(t2, ydep2, accdep2, bookvalue2):
    accdep2 = accdep2 + ydep2               # 更新累計折舊
    bookvalue2 = bookvalue2 - ydep2       # 更新帳面價值
    return t2, ydep2, accdep2, bookvalue2

for t in range(1, year + 1):
    t, ydep, accdep, bookvalue = accountingcomputation(t, ydep, accdep, bookvalue)
    print(f"Year {t}: Annual Depreciation = {ydep}, Accumulated Depreciation = {accdep}, Book Value = {bookvalue}")
