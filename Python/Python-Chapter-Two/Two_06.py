# Write a program that reads an integer between 0 and 1000 and adds 
# all the digits in the integer. For example, if an integer is 932, 
# the sum of all its digits is 14. (Hint: Use the %operator to 
# extract digits, and use the // operator to remove the extracted 
# digit. For instance, 932 % 10 = 2and 932 // 10 = 93.)
integer = eval(input("Enter an integer, n, where 0 <= n < 1000:"))
right = integer % 10
middle = (integer // 10) % 10
left = integer // 100
print(left + middle + right)