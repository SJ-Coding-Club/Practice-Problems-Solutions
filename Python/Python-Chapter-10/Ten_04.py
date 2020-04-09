'''
Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average and how many
scores are below the average. Assume the input numbers are separated by one
space in one line.
'''

def read_scores():
    raw_scores = input("Enter scores: ")
    scores = raw_scores.split()
    return [int(x) for x in scores]

def get_average(list):
    sum = 0
    for num in list:
        sum += num
    return sum / len(list)

def get_num_above_average(list):
    average = get_average(list)
    count = 0
    for num in list:
        if num >= average:
            count += 1
    return count
    
def main():
    scores = read_scores()
    above_count = get_num_above_average(scores)
    below_count = len(scores) - above_count
    above_verb = below_verb = "are"
    
    if above_count == 1:
        above_verb = "is"
    if below_count == 1:
        below_verb = "is"

    print(f"There {above_verb} {above_count} numbers above or equal to the average.")
    print(f"There {below_verb} {below_count} numbers below  the average.")

main()