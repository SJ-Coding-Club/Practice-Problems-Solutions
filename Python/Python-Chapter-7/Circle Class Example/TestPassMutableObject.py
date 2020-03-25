from Circle import Circle

def main():
    # Create a Circle object with radius 1
    myCircle = Circle()

    # Print areas for radius 1, 2, 3, 4, and 5
    n = 5
    printAreas(myCircle, n)

    # Display myCircle.radius and times
    print(f"\nRadius is {myCircle.radius}")
    print(f"n is {n}")

# Print a table of areas for radius
def printAreas(c, times):
    print("Radius \t\tArea")
    while times >= 1:
        print(f"{c.radius} \t\t {c.getArea()}")
        c.radius = c.radius + 1
        times = times - 1

main()
