# Reverse selection sort

list = [3,9,2,10,6,5,8,7,4,1]

for i in range(len(list2) - 1, -1, -1):
	max = list2[i]
	index = i
	for j in range(i - 1, -1, -1):
		if list2[j] > max:
			max = list2[j]
			index = j
	temp = list2[i]
	list2[i] = max
	list2[index] = temp

print(list2)