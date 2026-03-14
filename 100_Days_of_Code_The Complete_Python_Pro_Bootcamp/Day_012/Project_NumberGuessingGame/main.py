'''
The goal is to build a guess the number game.

Demo
https://appbrewery.github.io/python-day12-demo/

ASCII Art
You can get hold of ASCII art using the link below: 
https://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20
'''


# import modules
from art import logo
from random import choice

# Number of attempts for each level of difficulty
EASY_ATTEMPTS = 10
HARD_ATTEMPTS = 5

# Generate a list from 1 to 100 with a for loop instead of doing manually as CONSTANT
LIST_OF_NUMBERS = list(range(1,101))

#print(LIST_OF_NUMBERS)

def pick_random_number():
    """ return a random number from list of numbers """
    return choice(LIST_OF_NUMBERS)

def choose_difficulty(difficulty_choice):
    """
    takes the difficulty choice selection
    and returns easy or hard number of attempts
    if the option is not valid will return zero
    :param difficulty_choice:
    :return:
    """
    if difficulty_choice == "easy":
        return EASY_ATTEMPTS
    elif difficulty_choice == "hard":
        return HARD_ATTEMPTS
    else:
        print("Invalid option")
        return 0

def check_answer(guess, attempts,random_number):
    """
    this function checks the guess of the user and compare
    if the random number is greater, lower or the same and
    returns number of attemps - 1 if the number is not guessed
    and True to continue the game if guess is not meet yet.
     """
    if guess > random_number:
        print("Too high.")
        return attempts - 1, True
    elif guess < random_number:
        print("Too low.")
        return attempts - 1, True
    else:
        print(f"You got it! The answer was {random_number}")
        return  attempts, False

def game():
    """ main function that runs the game """
    # print logo
    print(logo)

    print("Welcome to the Number Guessing Game!")
    print("I'm thinking of a number between 1 and 100.")

    # random number for the current game
    random_number = pick_random_number()

    # difficulty choice input
    difficulty_choice = input("Choose a difficulty. Type \'easy\' or \'hard\': ")

    # set the number of attempts in 0 that will change based on difficulty
    attempts = choose_difficulty(difficulty_choice)

    # boolean to get into the loop
    should_continue = True

    # while attempts are greater than zero and continue is true keep guessing
    while attempts > 0 and should_continue:
        print(f"You have {attempts} remaining to guess the number.")
        guess = int(input("Make a guess: "))

        # call the check_answer
        attempts, should_continue = check_answer(guess, attempts, random_number)

        if attempts == 0:
            print("You\'ve run out of guesses")


# start the game
game()
