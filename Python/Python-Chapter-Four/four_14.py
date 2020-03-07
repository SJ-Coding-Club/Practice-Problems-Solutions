import random
int = random.randint(0,1)
choice = eval(input("Enter heads (1) or tails (0)."))
if int == choice:
    print("Correct")
elif int == 1:
    ("You chose heads. It was tails.")
elif int == 0:
    print("You chose tails. It was heads.")
