# --- Compare a and b -------
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

print("Larger number:", max(a, b))

# --------------------------
SCORE = float(input("Please input the score (1~100): "))

if 1 <= SCORE <= 100:  # make sure value is valid
    if SCORE >= 90:
        print("The grade is A")
    elif SCORE >= 80:
        print("The grade is B")
    elif SCORE >= 70:
        print("The grade is C")
    elif SCORE >= 60:
        print("The grade is D")
    else:
        print("The grade is F")
else:
    print("Invalid score! Please enter a number between 1 and 100.")
