# Reverse a string
def reverse(s1):
    s2 = ""
    for i in range(1, len(s1) + 1):
        s2 += s1[-i]
    return s2
print(reverse(input("Enter a string: ")))