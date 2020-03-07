# Chapter 2 Problem 2
# Write a program that reads in the radius and length of a cylinder 
# and computes the area and volume using the following formulas:
#   area = radius * radius * pi
#   volume = area * length
pi = 3.14159
radius = eval(input("Enter radius: "))
length = eval((input("Enter length: ")))
area = radius * radius * pi
volume = area * length
print("Area =", area)
print("Volume =", volume)