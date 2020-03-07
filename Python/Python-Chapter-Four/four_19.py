a, b, c = eval(input("Enter sides a, b, c of a triangle: "))
if a + b <= c or b + c <= a or c + a <= b:
    print("Invalid triangle.")
else:
    print("Perimeter =", a + b + c)
