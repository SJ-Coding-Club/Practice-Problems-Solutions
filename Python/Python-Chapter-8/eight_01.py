# Prompt user to enter an SSN in format ddd-dd-dddd, return whether it is valid.
ssn = input("Enter your social security number in form:" \
    "ddd-dd-dddd, where d is a digit: ")
if str.isdigit(ssn[0:3]) and str.isdigit(ssn[4:6]) \
    and str.isdigit(ssn[7:11]):
    print("Valid SSN")
else:
    print("Invalid SSN")
