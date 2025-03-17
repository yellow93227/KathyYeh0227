def oddOrEven():
    while num==Q:
        print("it is not number,please input again")
        if num%2:
            print(num, "為奇數")
        else:
            print(num, "為偶數")
    
    return num

num = int(input('請輸入一個整數：'))
oddOrEven()