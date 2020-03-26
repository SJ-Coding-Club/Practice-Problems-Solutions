from LinearEquation import LinearEquation

def main():
    a = eval(input("Enter a: "))
    b = eval(input("Enter b: "))
    c = eval(input("Enter c: "))
    d = eval(input("Enter d: "))
    e = eval(input("Enter e: "))
    f = eval(input("Enter f: "))
    equation = LinearEquation(a, b, c, d, e, f)
    if equation.isSolvable():
        print(f"x = {round(equation.getX(), 2)}, y = {round(equation.getY(), 2)}")
    else:
        print("The equation has no solution.")

main()