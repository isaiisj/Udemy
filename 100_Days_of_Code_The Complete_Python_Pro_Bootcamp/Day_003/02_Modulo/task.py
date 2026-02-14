'''
The modulo operator gives you the remainder of a division.

6 % 2 #will be 0

6 % 5 #will be 1

6 % 4 #will be 2

PAUSE 1 - What is 10 % 3?
What do you think this will output?

print(10 % 3)

PAUSE 2 - Check Odd or Even
Write some code using what you have learnt about the modulo operator
and conditional checks in Python to check if the number in he input area is odd or even. 

If it's odd print out the word "Odd" otherwise printout "Even".
'''


print(10 % 3)

number = int(input("Put a number to see if it is even or odd: "))
if number % 2 == 0:
    print("Is even")
else:
    print("Is odd")
