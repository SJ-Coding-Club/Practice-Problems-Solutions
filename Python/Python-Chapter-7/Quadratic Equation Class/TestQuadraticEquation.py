from QuadraticEquation import QuadraticEquation

def main():
    a = eval(input("Enter a: "))
    b = eval(input("Enter b: "))
    c = eval(input("Enter c: "))
    quadratic = QuadraticEquation(a, b, c)
    if quadratic.getDiscriminant() < 0:
        print("No Real Roots.")
    elif quadratic.getDiscriminant() == 0:
        print(f"x = {quadratic.getRoot1()}")
    else:
        print(f"x = {quadratic.getRoot1()} x = {quadratic.getRoot2()}")
    
main()