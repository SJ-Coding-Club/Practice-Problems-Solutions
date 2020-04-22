'''
You can shuffle a list using random.shuffle(lst).
Write your own function without using random.shuffle(lst) to shuffle a list
and return the list. Use the following function header:
def shuffle(lst):
Write a test program that prompts the user to enter a list of numbers, invokes the
function to shuffle the numbers, and displays the numbers
'''
import random

def read_input():
	raw = input("Enter list of nums: ")
	nums = raw.split()
	return [eval(x) for x in nums]


def shuffle(list):
	list2 = []
	indices_used = []
	while len(list2) != len(list):
		n = random.randint(0, len(list) - 1)
		while n in indices_used:
			n = random.randint(0, len(list) - 1)
		indices_used.append(n)
		list2.append(list[n])
	return list2

def main():
	list = read_input()
	print(shuffle(list))

main()