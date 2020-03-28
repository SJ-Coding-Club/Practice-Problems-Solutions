# Count the letters in a string
def countLetters(s):
    count = 0
    for ch in s:
        if str.isalpha(ch):
            count += 1 
    return count

print(countLetters(input("Enter a string: ")))