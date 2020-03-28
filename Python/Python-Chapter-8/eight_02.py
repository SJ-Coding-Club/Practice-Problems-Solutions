# Use find to determine whether s1 is a substring of s2
def isSubstring(string, s1):
    if str.capitalize(string).find(str.capitalize(s1)) != -1:
        return f"{s1} is a substring of {string}"
    else:
        return f"{s1} is not a substring of {string}"

string = input("Enter a string: ")
s1 = input("Enter another string: ")
print(isSubstring(string, s1))