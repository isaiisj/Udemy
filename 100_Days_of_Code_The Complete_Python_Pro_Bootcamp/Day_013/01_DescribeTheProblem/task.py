'''
The first step of solving a problem is being able to describe the problem.

PAUSE 1
Look at the code in task.py and answer the following questions:

What is the for loop doing?
When is the function meant to print "You got it"?
What are your assumptions about the value of i?

PAUSE 2
Fix the code so that the print statement executes.
'''


def my_function():
    for i in range(1, 21):
        if i == 20:
            print("You got it")


my_function()

# Describe the Problem - Write your answers as comments:
# 1. What is the for loop doing?
# 2. When is the function meant to print "You got it"?
# 3. What are your assumptions about the value of i?

# Answers
# 1. The for loop is iterating 19 range(1,20) times because
#    range goes from 1 to 20 non inclusive.
# 2. when i is equal to 20
# 3. that goes up to 20
