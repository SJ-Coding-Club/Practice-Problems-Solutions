'''
Write a function that returns the index of
the smallest element in a list of integers. If the number of such elements is greater
than 1, return the smallest index. Use the following header:

def indexOfSmallestElement(lst):

Write a test program that prompts the user to enter a list of numbers, invokes this
function to return the index of the smallest element, and displays the index.
'''

def read_list():
    raw = input("Enter numbers: ")
    list = raw.split()
    return [int(x) for x in list]

def get_index_of_smallest(list):
    min = list[0]
    min_index = 0
    for i in range(len(list)):
        if list[i] < min:
            min = list[i]
            min_index = i
    return min_index

def main():
    list = read_list()
    index_of_smallest = get_index_of_smallest(list)
    print(f"The index of the smallest number in the list is {index_of_smallest}.")

main()