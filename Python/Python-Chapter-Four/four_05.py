dayInteger = eval(input("Enter an integer for today's day of the week (Sunday is 0, Monday is 1, ..., Saturday is 6): "))
daysElapsed = eval(input("Enter the number of days that have elapsed: "))
if dayInteger == 0:
    today = "Sunday"
elif dayInteger == 1:
    today = "Monday"
elif dayInteger == 2:
    today = "Tuesday"
elif dayInteger == 3:
    today = "Wednesday"
elif dayInteger == 4:
    today = "Thursday"
elif dayInteger == 5:
    today = "Friday"
elif dayInteger == 6:
    today = "Saturday"

if (dayInteger + daysElapsed) % 7 == 0:
    day = "Sunday"
elif (dayInteger + daysElapsed) % 7 == 1:
    day = "Monday"
elif (dayInteger + daysElapsed) % 7 == 2:
    day = "Tuesday"
elif (dayInteger + daysElapsed) % 7 == 3:
    day = "Wednesday"
elif (dayInteger + daysElapsed) % 7 == 4:
    day = "Thursday"
elif (dayInteger + daysElapsed) % 7 == 5:
    day = "Friday"
elif (dayInteger + daysElapsed) % 7 == 6:
    day = "Saturday"
print(f"Today is {today}. In {daysElapsed} days, it will be {day}")
