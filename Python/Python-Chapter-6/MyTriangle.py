# MyTriangle Module
import math
# Returns true if the sum of any two sides is
# greater than the third side.
def isValid(side1, side2, side3):
    return side1 + side2 > side3 and side2 + side3 > side1 and side3 + side1 > side2
# Returns the area of the triangle.
def area(side1, side2, side3): # Heron's Formula implementation
    s = (side1 + side2 + side3) / 2
    return round(math.sqrt(s * (s - side1) * (s - side2) * (s - side3)), 2)
