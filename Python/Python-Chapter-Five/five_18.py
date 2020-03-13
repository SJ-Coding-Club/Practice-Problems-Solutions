i = 2
n = eval(input("Enter an integer: "))
while n != 1:
    while n % i == 0:
        print(i, end = " ")
        n /= i
    i += 1
