'''
Write a program that generates 1,000 random integers
between 0 and 9 and displays the count for each number. 
(Hint: Use a list of ten integers, called counts, to store 
the counts for the number of 0s, 1s, ..., 9s.)
'''

import random

def fill_rands():
    counts = [0,0,0,0,0,0,0,0,0,0]
    for i in range(1000):
        random_num = random.randint(0,9)
        counts[random_num] += 1
    return counts

def main():
    print(f"Frequencies of each number from 0-9: {fill_rands()}")

main()