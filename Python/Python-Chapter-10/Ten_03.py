'''
Write a program that reads some integers
between 1 and 100 and counts the occurrences of each. Here is a sample run of
the program
'''

def read_nums():
    raw_nums = input("Enter numbers between 1 and 100: ")
    nums = raw_nums.split()
    return [int(x) for x in nums]

def counter():
    list1 = read_nums()
    list1.sort()
    for i in range(0, len(list1)):
        count = list1.count(list1[i])
        ending = ""
        if count > 1:
            ending = 's'
        if i == 0:
            print(f"{list1[i]} occurs {count} time{ending}")
        elif i > 0 and list1[i] != list1[i - 1]:
            print(f"{list1[i]} occurs {count} time{ending}")

def main():
    counter()

main()