'''
Your goal today is to build a "Chose your own adventure game". 
Using what you have learnt in the lessons today you will be building 
a very simple version of this type of text game.
'''


print(r'''
*******************************************************************************
          |                   |                  |                     |
 _________|________________.=""_;=.______________|_____________________|_______
|                   |  ,-"_,=""     `"=.|                  |
|___________________|__"=._o`"-._        `"=.______________|___________________
          |                `"=._o`"=._      _`"=._                     |
 _________|_____________________:=._o "=._."_.-="'"=.__________________|_______
|                   |    __.--" , ; `"=._o." ,-"""-._ ".   |
|___________________|_._"  ,. .` ` `` ,  `"-._"-._   ". '__|___________________
          |           |o`"=._` , "` `; .". ,  "-._"-._; ;              |
 _________|___________| ;`-.o`"=._; ." ` '`."\ ` . "-._ /_______________|_______
|                   | |o ;    `"-.o`"=._``  '` " ,__.--o;   |
|___________________|_| ;     (#) `-.o `"=.`_.--"_o.-; ;___|___________________
____/______/______/___|o;._    "      `".o|o_.--"    ;o;____/______/______/____
/______/______/______/_"=._o--._        ; | ;        ; ;/______/______/______/_
____/______/______/______/__"=._o--._   ;o|o;     _._;o;____/______/______/____
/______/______/______/______/____"=._o._; | ;_.--"o.--"_/______/______/______/_
____/______/______/______/______/_____"=.o|o_.--""___/______/______/______/____
/______/______/______/______/______/______/______/______/______/______/_____ /
*******************************************************************************
''')
print("Welcome to Treasure Island.")
print("Your mission is to find the treasure.")

first_desition = input("Do you want to go to \"left\" or \"right\"?: ")
if first_desition == "left":
    second_desition = input("Do you want to \"wait\" or \"swim\"?: ")
    if second_desition == "wait":
        third_desition = input("Which dor you want to choose \"blue\", \"red\", \"yellow\"?: ")
        if third_desition == "red":
            print("Burned by fire. Game Over")
        elif third_desition == "blue":
            print("Eaten by beasts. Game Over")
        elif third_desition == "yellow":
            print("You Win!")
    else:
        print("Game Over")
elif first_desition == "right":
    print("Game Over")
else:
    print("Not valid desition")
