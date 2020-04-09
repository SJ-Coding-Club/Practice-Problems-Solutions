'''
The reverse function in Section 10.8 reverses a list by copying it
to a new list. Rewrite the function that reverses the list passed in the argument and
returns this list. Write a test program that prompts the user to enter a list of numbers, 
invokes the function to reverse the numbers, and displays the numbers.
'''

def read_list():
    raw = input("Enter nums: ")
    nums = raw.split()
    return [int(x) for x in nums]

def reverse(list):
    list2 = []
    for num in list:
        list2.insert(0, num)
    return list2

def main():
    list = read_list()
    reversed_list = reverse(list)
    print(f"The reverse of {list} is {reversed_list}")

main()