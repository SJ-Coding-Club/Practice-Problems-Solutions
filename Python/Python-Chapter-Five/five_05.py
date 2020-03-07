print("Kilograms    Pounds    |    Pounds        Kilograms")
count = 0
leftCount = 1.00
rightCount = 20.00
while count <= 99:
    print(f"{leftCount}            {round(leftCount * 2.2, 2)}       |    {rightCount}        {round(rightCount * 0.45, 2)}")
    leftCount += 2
    rightCount += 5
    count += 1
