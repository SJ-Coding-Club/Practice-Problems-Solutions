# Find # of occurences of a specified character without using the str.count() method
def count(s, character):
    count = 0
    for ch in s:
        if str.capitalize(ch) == str.capitalize(character):
            count += 1
    return count
string = input("Enter a string: ")
character = input("Enter the character you are counting: ")
print(count(string, character))