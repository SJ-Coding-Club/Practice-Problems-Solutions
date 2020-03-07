import random
a = random.randint(1, 9)
b = random.randint(1, 9)
c = random.randint(1, 9)
print(f"{a} + {b} + {c}")
userAnswer = eval(input("Enter the answer "))
print(f"{a} + {b} + {c} = {userAnswer} is", a + b + c == userAnswer)
