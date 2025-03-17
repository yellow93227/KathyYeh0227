#---compare a and b-------
a = int(input())
b = int (input())
if a > b:
    print(a)
else:
    print(b)

#--------------------------
SCORE = float(input("please input the score(1~100):"))
if SCORE>=90:
    print("the grade is A")
elif SCORE>=80:
    print("the grade is B")
elif SCORE>=70:
    print("the grade is C")
elif SCORE>=60:
    print("the grade is D")
else:
    print("the grade is F")
