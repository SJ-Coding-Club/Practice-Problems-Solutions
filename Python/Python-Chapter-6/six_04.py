def reverse(number):
    num = ""
    while number // 10 != 0:
        num += str(number % 10)
        number //= 10
    return num + str(number % 10)
print(reverse(eval(input("Enter a number: "))))
