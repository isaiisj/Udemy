'''
The goal is to build a calculator program.

Demo
https://appbrewery.github.io/python-day10-demo/

Storing Functions as a Variable Value
You can store a reference to a function as a value to a variable. e.g.

def add(n1, n2):
    return n1 + n2
    
    
my_favourite_calculation = add
my_favourite_calculation(3, 5)  # Will return 8

In the starting file, you'll see a dictionary that references each of the mathematical 
calculations that can be performed by our calculator. 
Try it out and see if you can get it to perform addition, subtraction, multiplication and division.

PAUSE 1
TODO: Write out the other 3 functions - subtract, multiply and divide.

PAUSE 2
TODO: Add these 4 functions into a dictionary as the values. Keys = "+", "-", "*", "/"

PAUSE 3
TODO: Use the dictionary operations to perform the calculations. Multiply 4 * 8 using the dictionary.

Functionality
- Program asks the user to type the first number.
- Program asks the user to type a mathematical operator (a choice of "+", "-", "*" or "/")
- Program asks the user to type the second number.
- Program works out the result based on the chosen mathematical operator.
- Program asks if the user wants to continue working with the previous result.
- If yes, program loops to use the previous result as the first number and then repeats the calculation process.
- If no, program asks the user for the fist number again and wipes all memory of previous calculations.
- Add the logo from art.py

 Hint 1 
Try writing out a flowchart to plan your program.

 Hint 2 
To call multiplication from the operations dictionary, you would write your code like this:

result = operations["*"](n1= 5, n2= 3)

result would then be equal to 15.
'''


from art import logo

def add(n1, n2):
    return n1 + n2

# my_favourite_function = add
# print(my_favourite_function(4,3))

# TODO 1: Write out the other 3 functions - subtract, multiply and divide.
def subtract(n1, n2):
    return n1 - n2

def multiply(n1, n2):
    return n1 * n2

def divide(n1, n2):
    return n1 / n2

# TODO 2: Add these 4 functions into a dictionary as the values. Keys = "+", "-", "*", "/"

operations = {
    "+": add,
    "-": subtract,
    "*": multiply,
    "/": divide,
}

# TODO 3: Use the dictionary operations to perform the calculations. Multiply 4 * 8 using the dictionary.

# print(operations["*"](4,8))

should_continue = True

result = 0

print(logo)

first_number = float(input("What\'s the first number?: "))

while should_continue:

    for key in operations:
        print(key)
    operation = input("Pick an operation: ")

    second_number = float(input("What\'s the second number?: "))

    result = operations[operation](first_number, second_number)

    print(f"{first_number} {operation} {second_number} = {result}")

    choice = input(f"Type \'y\' to continue calculating with {result}, or type \'n\' to start a new calculation or any other else to exit\n").lower()

    if choice == "y":
        first_number = result
    elif choice == "n":
        result = 0
        print("\n" * 20)
        print(logo)
        first_number = float(input("What\'s the first number?: "))
    else:
        should_continue = False
        print("Goodbye")
