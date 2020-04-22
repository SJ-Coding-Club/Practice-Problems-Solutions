'''
Write a function that returns the greatest common divisor
(GCD) of integers in a list. Use the following function header:
def gcd(numbers):
Write a test program that prompts the user to enter five numbers, invokes the
function to find the GCD of these numbers, and displays the GCD.
'''
def read_input():
	raw = input("enter nums: ")
	nums = raw.split()
	return [eval(x) for x in nums]

def gcd_of_pair(a,b):
	while b != 0:
		a, b = b, a % b
	return a

def gcd_of_list(list):
	gcd = gcd_of_pair(list[0],list[1])

	for i in range(2, len(list)):
		gcd = gcd_of_pair(gcd, list[i])
	return gcd

def main():
	print(gcd_of_list(read_input()))
main()