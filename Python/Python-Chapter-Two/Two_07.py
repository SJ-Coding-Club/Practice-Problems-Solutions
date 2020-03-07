# Write a program that prompts the user to enter the minutes (e.g., 1 billion), 
# and displays the number of years and days for the minutes. For simplicity, 
# assume a year has 365 days
minutes = eval(input("Enter minutes:"))
days = minutes // 1440
years = days // 365
days = days % 365
print("In", minutes, "minutes, there are", years, "years and", days, "days")