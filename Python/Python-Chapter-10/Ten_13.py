'''
Write a function that returns a new list by eliminating the
duplicate values in the list. Use the following function header:
def eliminateDuplicates(lst):
Write a test program that reads in a list of integers, invokes the 
function, and displays the result
'''
def read_input():
	raw = input("Enter list: ")
	nums = raw.split()
	return [eval(x) for x in nums]

def eliminate_duplicates(list):
	return [1,2]

def main():
	list = [3,1,2,1,2,21,2,2,4,3,3,4,41,4,4,5,5,5]
	list = eliminate_duplicates(list)
	print(list)

main()