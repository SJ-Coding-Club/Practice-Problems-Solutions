# Chapter #3 Problem #5
#
# name: Jack Donofrio
# date: 2/16/20
import math
numberOfSides = eval(input("Enter number of sides:"))
sideLength = eval(input("Enter the side length:"))
area = (numberOfSides * sideLength**2) / \
    (4 * math.tan(math.pi / numberOfSides))
print("The area of the polygon is", area)
