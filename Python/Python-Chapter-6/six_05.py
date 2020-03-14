def displaySortedNumbers(num1, num2, num3):
    high = max(num1, num2, num3)
    low = min(num1, num2, num3)
    if high == num1 and low == num2:
        mid = num3
    elif high == num2 and low == num3:
        mid = num1
    else:
        mid = num2
    return low, mid, high
a, b, c = eval(input("Enter a, b, c: "))
print(displaySortedNumbers(a, b, c))
