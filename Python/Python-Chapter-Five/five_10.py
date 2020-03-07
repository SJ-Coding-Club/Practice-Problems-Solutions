numberOfStudents = eval(input("Enter the number of students in the class: "))
maxScore = -1
maxIndex = -1
for student in range(1, numberOfStudents + 1):
    score = eval(input(f"Enter score of student {student}: "))
    if score > maxScore:
        maxScore = score
        maxIndex = student
print(f"Student {maxIndex} received the highest score with a {maxScore}")
