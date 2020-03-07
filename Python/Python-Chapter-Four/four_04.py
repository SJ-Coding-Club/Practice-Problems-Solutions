import random
a = random.randint(1,100)
b = random.randint(1,100)
userAnswer = eval(input(f"Enter {a} + {b} "))
print(f"{a} + {b} = {userAnswer} is", a + b == userAnswer)
