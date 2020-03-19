import random

# Display an n-by-n matrix - randomly generated
def printMatrix(n):
    matrix = ""
    for row in range(0, n):
        for column in range(0, n):
            matrix += str(random.randint(0,1)) + " "
        matrix += "\n"
    return matrix
    
matrix = printMatrix(eval(input("Enter an integer 'n': ")))
print(matrix)
