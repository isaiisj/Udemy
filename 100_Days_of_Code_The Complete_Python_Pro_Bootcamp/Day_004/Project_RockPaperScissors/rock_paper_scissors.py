'''
You are going to build a Rock, Paper, Scissors game. 
You will need to use what you have learnt about randomisation and Lists to achieve this.
'''


import random
rock = '''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''

paper = '''
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
'''

scissors = '''
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
'''



users_choice = int(input("What do you choose? Type 0 for Rock, 1 for Paper or 2 for Scissors. "))

computer_selection = random.randint(0,2)
options_list = [rock,paper,scissors]

# print(users_choice)
# print(computer_selection)

if users_choice >= 0 and users_choice <= 2:
    print(options_list[users_choice] + "\n")
    print("Computer chose:")
    print(options_list[computer_selection])


if users_choice == computer_selection:
    print("It\'s a draw")
elif users_choice == 0 and computer_selection == 1:
    print("You lose")
elif users_choice == 0 and computer_selection == 2:
    print("You Win!")
elif users_choice == 1 and computer_selection == 0:
    print("You Win!")
elif users_choice == 1 and computer_selection == 2:
    print("You lose")
elif users_choice == 2 and computer_selection == 0:
    print("You lose")
elif users_choice == 2 and computer_selection == 1:
    print("You Win!")
else:
    print("Invalid choice. Try again")

