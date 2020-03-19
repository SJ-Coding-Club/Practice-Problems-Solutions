def numberOfDaysInAYear(year):
    days = 365
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                return days + 1
        else:
            return days + 1
    return days
print(numberOfDaysInAYear(eval(input("Enter year: "))))
