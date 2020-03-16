def celsiusToFahrenheit(celsius):
    return (9 / 5) * celsius + 32
def fahrenheitToCelsius(fahrenheit):
    return (5 / 9) * (fahrenheit - 32)
print("Celsius    Fahrenheit")
for i in range(40, 30, -1):
    print(i, end = "         ")
    print(round(celsiusToFahrenheit(i), 2))
print("---------------")
print("Fahrenheit    Celsius")
for i in range(120, 29, -1):
    print(i, end = "           ")
    print(round(fahrenheitToCelsius(i), 2))
    
