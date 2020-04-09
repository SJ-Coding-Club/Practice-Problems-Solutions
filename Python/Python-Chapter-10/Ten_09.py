'''
Calculate standard deviation of n numbers

mean = (x1 + x2 + ... + xn) / n

deviation = sqrt(E(xi - mean)^2 / (n - 1)), where E represents nth partial sum, i = 1

To compute the standard deviation with this formula, you have to store the
individual numbers using a list, so that they can be used after the mean is
obtained.

Your program should contain the following functions:

# Compute the standard deviation of values
def deviation(x):

# Compute the mean of a list of values
def mean(x):

Write a test program that prompts the user to enter a list of numbers and displays
the mean and standard deviation
'''

def read_values():
    raw = input("Enter numbers: ")
    nums = raw.split()
    return [eval(x) for x in nums]

# Compute the mean of a list of values
def get_mean(list):
    sum = 0
    for num in list:
        sum += num
    return sum / len(list)

# Compute the standard deviation of values
def get_deviation(list):
    mean = get_mean(list)
    partial_sum = 0
    for num in list:
        partial_sum += pow(num - mean, 2)
    return pow(partial_sum / (len(list) - 1), 0.5)

def main():
    list = read_values()
    deviation = get_deviation(list)
    mean = get_mean(list)
    print(f"Mean: {round(mean,4)}, standard dev.: {round(deviation,4)}")

main()