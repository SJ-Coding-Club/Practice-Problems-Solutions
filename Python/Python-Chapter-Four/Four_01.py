a, b, c = eval(input("Enter a, b, c: "))
determinant = b**2 - 4 * a * c
root1 = ((-1 * b) + determinant**0.5) / (2 * a)
root2 = ((-1 * b) - b**2 - determinant**0.5) / (2 * a)
if determinant > 0:
    print("x=",root1, "x=",root2)
elif determinant == 0:
    print("x=",root1)
else:
    print("No real roots")
