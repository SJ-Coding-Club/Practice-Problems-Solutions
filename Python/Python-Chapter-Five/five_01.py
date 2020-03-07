positiveCount = 0
negativeCount = 0
int = -1
while (int != 0):
    int = eval(input("Enter an integer, the input ends if it is 0: "))
    if int < 0:
        negativeCount += 1
    if int > 0:
        positiveCount += 1
print(f"There are {positiveCount} positive numbers.")
print(f"There are {negativeCount} negative numbers.")
