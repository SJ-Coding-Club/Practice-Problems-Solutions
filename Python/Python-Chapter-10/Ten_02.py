'''
Write a program that reads a list of integers and
displays them in the reverse order in which they were read.
'''

def read_ints():
    nums = input('Enter integers: ')
    nums = nums.split()
    return [int(x) for x in nums]

def reverse(list):
    new = []
    for num in list:
        new.insert(0, num)
    return new

def main():
    nums = read_ints()
    reversed_nums = reverse(nums)
    print(reversed_nums)

main()