'''
Write a program that reads a list of scores and then assigns grades
based on the following scheme:
The grade is A if score is >= best – 10.
The grade is B if score is >= best – 20.
The grade is C if score is >= best – 30.
The grade is D if score is >= best – 40.
The grade is F otherwise.
'''
def get_scores():
    raw_scores = input("Enter scores separated by spaces: ") # read nums as string from console
    scores = raw_scores.split() # split string into list
    return [int(x) for x in scores] # convert to integer type

def grade(score, best_score):
    if score >= best_score - 10:
        return 'A'
    elif score >= best_score - 20:
        return 'B'
    elif score >= best_score - 30:
        return 'C'
    elif score >= best_score - 40:
        return 'D'
    else:
        return 'F'

def main():
    scores = get_scores()
    best_score = max(scores)
    i = 0
    for score in scores:
        print(f"Student {i}'s score is {score} and grade is {grade(score, best_score)}.")
        i+=1

main()