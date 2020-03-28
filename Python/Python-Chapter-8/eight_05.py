# counts occurrences of specified non-overlapping
def count(s1, s2):
    count = 0
    for i in range(0, len(s1) - len(s2) + 1):
        if s1[i : i + len(s2)] == s2:
            count += 1
    return count

s1 = input("Enter a string: ")
s2 = input("Enter another string: ")
print(count(s1, s2))