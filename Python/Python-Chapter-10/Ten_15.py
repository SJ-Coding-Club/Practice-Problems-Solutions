# Write a function that returns True if the list is 
# already sorted. Use the header: def is_sorted(list):

def is_sorted(list):
	for i in range(len(list) - 1):
		if list[i] > list[i+1]:
			return False
	return True