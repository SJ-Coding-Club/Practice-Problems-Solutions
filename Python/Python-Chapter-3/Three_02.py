# Chapter #3 Problem #2
#
# name: Jack Donofrio
# date: 2/16/20
import math
x1, y1 = eval(input("Enter point 1 (latitude and longitude in degrees:"))
x2, y2 = eval(input("Enter point 2 (latitude and longitude in degrees:"))
radius = 6371.01
d = radius * math.acos(math.sin(math.radians(x1)) * math.sin(math.radians(x2)) + 
math.cos(math.radians(x1)) * math.cos(math.radians(x2)) * math.cos(math.radians(y1) 
- math.radians(y2)))
print(d)
