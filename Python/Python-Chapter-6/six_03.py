def reverse(number):
    num = ""
    while number // 10 != 0:
        num += str(number % 10)
        number //= 10
    return num + str(number % 10)
def isPalindrome(number):
    return reverse(number) == str(number)
print(isPalindrome(eval(input("Enter a number: "))))
