# 定義四則運算函數
def add(a1, a2):
    return a1 + a2

def subtract(a1, a2):
    return a1 - a2

def multiply(a1, a2):
    return a1 * a2

def divide(a1, a2):
    if a2 == 0:
        return "錯誤！不能除以 0"
    return round(a1 / a2, 2)

if __name__ == "__main__":

    a1 = float(input("Enter a number: "))
    a2 = float(input("Enter another number: "))
    operation = input("Choose one operation (add, subtract, multiply, divide): ")

    if operation == "add":
        result = add(a1, a2)
    elif operation == "subtract":
        result = subtract(a1, a2)
    elif operation == "multiply":
        result = multiply(a1, a2)
    elif operation == "divide":
        result = divide(a1, a2)
    else:
        result = "無效的運算選擇！"

 
    print("答案＝", result)
