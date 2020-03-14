def sumDigits(n):
    sum = 0
    while n // 10 != 0:
        sum += n % 10
        n //= 10
    return sum + n % 10
print(sumDigits(eval(input("Enter an integer: "))))
