# Assume a runner runs 14 km in 45 minutes and 30 seconds
# Write a program that displays the average speed in miles per
# hour. (Note that one mile is 1.6 km)
distance = 14 / 1.6
time = (45 + (30.0 / 60.0)) / 60.0
speed = distance / time
print("Speed in mph = ", speed)
