number = eval(input("Enter a three-digit number: "))
temp = ""
if number // 100 != number % 10:
    temp = "not "
print(f"{number} is {temp}a palindrome.")
