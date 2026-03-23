'''
The goal is to build a game that asks the user to guess who has more followers on Instagram.

Original Higher Lower Game
https://www.higherlowergame.com/

Demo of Final Project
https://appbrewery.github.io/python-day14-demo/
'''

'''
Recommendations:
    1. Break down the problem
    2. Make a to-do list
    3. Turn the problem into comments
    4. Write code, Run code and Fix code
'''

# TODO: import necessary modules
import art
import game_data
import random

def check_answer(account_1, account_2):
    """
    Based on the user choice checks who has more followers
    and return 'A' or 'B' and the winner to keep playing.
    :param account_1:
    :param account_2:
    :return:
    """
    if account_1['follower_count'] > account_2['follower_count']:
        return "A"
    else :
        return "B"

def next_person(winner, account1, account2):
    """
    Check who was the winner from check answer
    and keep person 1 if was the winner or person1
    change to person 2 if was the winner
    :param winner:
    :param account1:
    :param account2:
    :return:
    """
    if winner == "A":
        return account1
    else:
        return account2

def game():
    """
    Function that has the main functionality of the game
    :return:
    """

    # TODO: Add a score and a boolean for a whiule loop
    user_score = 0
    should_continue = True

    # TODO: pick a first random person from game_data list and display the info
    account_1 = random.choice(game_data.data)

    # TODO: print logo
    print(art.logo)

    while should_continue:

        # print(account_1)
        print(f"Compare A: {account_1['name']}, a {account_1['description']}, from {account_1['country']}.")

        # TODO: print VS logo
        print(art.vs)

        # TODO: pick a second randon person from game_data list and display the info (If is the same pick other)
        account_2 = random.choice(game_data.data)
        while account_1['name'] == account_2['name']:
            account_2 = random.choice(game_data.data)
        # print(account_2)
        print(f"Against B: {account_2['name']}, a {account_2['description']}, from {account_2['country']}.")

        # TODO: store the choice of the user
        user_choice = input("Who has more followers? Type \'A\' or \'B\': ").upper()

        winner = check_answer(account_1, account_2)

        # TODO: winner will be now person 1 and will compare with someone else
        account_1 = next_person(winner,account_1, account_2)


        # TODO: check user choice to add more points to score or finish the game
        if winner == user_choice:
            print("\n"*20)
            print(art.logo)
            user_score += 1
            print(f"You\'re right! Current score: {user_score}")
        else:
            print(f"Sorry, that\'s wrong. Final score: {user_score}")
            should_continue = False



# TODO: define a function to start the game function
game()
