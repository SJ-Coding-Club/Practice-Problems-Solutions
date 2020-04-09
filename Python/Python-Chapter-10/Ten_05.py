'''
Write a program that reads in numbers separated by aspace in one line 
and displays distinct numbers (i.e., if a number appears multiple times, 
it is displayed only once). (Hint: Read all the numbers and store them 
in list1. Create a new list list2. Add a number in list1 to list2.
If the number is already in the list, ignore it.)
'''

def read_list1():
    raw = input("Enter numbers: ")
    list1 = raw.split()
    return [eval(x) for x in list1]

def find_distinct(list1):
    list2 = []
    for num in list1:
        if num not in list2:
            list2.append(num)
    return list2

def main():
    distinct_nums = find_distinct(read_list1())
    print(f"The distinct numbers are: {distinct_nums}")

main()