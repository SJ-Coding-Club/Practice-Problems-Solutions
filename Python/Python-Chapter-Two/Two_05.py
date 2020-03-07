# Write a program that reads the subtotal and the gratuity rate 
# and computes the gratuity and total. For example, if the user 
# enters 10 for the subtotal and 15% for the gratuity rate, the 
# program displays 1.5 as the gratuity and 11.5 as the total. 
subtotal = eval(input("Enter subtotal:"))
gratuityRate = eval(input("Enter gratuity rate:"))
gratuity = subtotal * (gratuityRate / 100)
print("Gratuity =", gratuity)
print("Total =", gratuity + subtotal)