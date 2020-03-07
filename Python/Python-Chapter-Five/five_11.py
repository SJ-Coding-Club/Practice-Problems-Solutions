numberOfStudents = eval(input("Enter the number of students in the class: "))
highest = 0
secondHighest = -1
for i in range(0, numberOfStudents):
    score = eval(input(f"Enter score for student {i + 1}: "))
    if score > highest:
        secondHighest = highest
        highest = score
    elif score < highest and score > secondHighest:
        secondHighest = score
print(f"Highest score: {highest}. Second highest: {secondHighest}.") 
