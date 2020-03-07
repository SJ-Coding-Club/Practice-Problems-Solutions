weightPackage1, pricePackage1 = eval(input("Enter the weight, price for package one: "))
weightPackage2, pricePackage2 = eval(input("Enter the weight, price for package two: "))
if weightPackage1 / pricePackage1 < weightPackage2 / pricePackage2:
    print("Package 1 has the better price.")
elif weightPackage1 / pricePackage1 == weightPackage2 / pricePackage2:
    print("Both packages cost the same price.")
else:
    print("Package 2 has the better price.")
