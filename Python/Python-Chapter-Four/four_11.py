month, year = eval(input("Enter the month (Jan = 1, Feb = 2, ..., Dec = 12), and year: "))
if year % 4 == 0:
    if year % 100 == 0:
        if year % 400 == 0:
            isLeapYear = True
    else:
        isLeapYear = True
if month == 1:
    days = 31
if month == 2:
    if isLeapYear:
        days = 29
    else:
        days = 28
if month == 3:
    days = 31
if month == 4:
    days = 30
if month == 5:
    days = 31
if month == 6:
    days = 30
if month == 7:
    days = 31
if month == 8:
    days = 31
if month == 9:
    days = 30
if month == 10:
    days = 31
if month == 11:
    days = 30
if month == 12:
    days = 31
print(f"{month}/{year} has {days} days.")
