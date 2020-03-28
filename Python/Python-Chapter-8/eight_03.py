# Check if a password is valid: must have 8 characters, be alphanumeric, and have 2+ numbers
def passwordIsValid(password):
    digitCount = 0
    for ch in password:
        if str.isdigit(ch):
            digitCount += 1
    if len(password) >= 8 and str.isalnum(password) and digitCount >= 2:
        return "valid password"
    else:
        return "invalid password"

print(passwordIsValid("bruhmoment"))