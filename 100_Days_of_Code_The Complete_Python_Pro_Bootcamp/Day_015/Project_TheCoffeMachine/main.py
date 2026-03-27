'''
The goal is to build the program for a coffee machine.

Program Requirements
Download the PDF for the program requirements here: 
https://drive.google.com/uc?export=download&id=1eIZt2TeFGVrk4nXkx8E_5Slw2coEcOUo
'''

MENU = {
    "espresso": {
        "ingredients": {
            "water": 50,
            "coffee": 18,
        },
        "cost": 1.5,
    },
    "latte": {
        "ingredients": {
            "water": 200,
            "milk": 150,
            "coffee": 24,
        },
        "cost": 2.5,
    },
    "cappuccino": {
        "ingredients": {
            "water": 250,
            "milk": 100,
            "coffee": 24,
        },
        "cost": 3.0,
    }
}

resources = {
    "water": 300,
    "milk": 200,
    "coffee": 100,
}


# TODO: check resources sufficient
def check_resources(beverage_selected):
    """
    Iterates through the necessary quantity for each beverage and
    looks if the machine has enough ingredients to prepare it.
    :param beverage_selected:
    :return:
    """
    for ingredient in MENU[beverage_selected]["ingredients"]:
        # print(ingredient)
        if resources[ingredient] < MENU[beverage_selected]["ingredients"][ingredient]:
            print(f"Sorry there is not enough {ingredient}")
            return False
    return True

# TODO: process coins once we check there are sufficient resources.
def process_coins():
    """
    Ask the user to introduce the coins and return the total value
    of the money introduced
    :return:
    """
    print("Please insert coins.")
    quarters = int(input("How many quarters?: "))
    dimes = int(input("How many dimes?: "))
    nickles = int(input("How many nickles?: "))
    pennies = int(input("How many pennies?: "))

    return (quarters*0.25) + (dimes*0.10) + (nickles*0.05) + (pennies*0.01)

# TODO: Check transaction successful
def check_transaction(coins_inserted, beverage):
    """
    Based on the money inserted and the cost of the beverage check if
    the money is enough, we have to give change or not enough anf refund.
    :param coins_inserted:
    :param beverage:
    :return:
    """
    if coins_inserted < MENU[beverage]["cost"]:
        print(f"Sorry, that\'s not enough money. Money refunded.")
        return  0
    else :
        change = coins_inserted - MENU[beverage]["cost"]
        print(f"Here is your ${change:.2f} in change")
        return coins_inserted

def resources_consumption(beverage_selected):
    """
    Updates the resources available in the machine for the beverage prepared
    :param beverage_selected:
    :return:
    """
    for ingredient in MENU[beverage_selected]["ingredients"]:
        resources[ingredient] -= MENU[beverage_selected]["ingredients"][ingredient]

def coffe_machine():

    is_machine_on = True
    money = 0
    while is_machine_on:

        # TODO: ask the user to select a product espresso/latte/cappuccino
        user_choice = input("What would you like (espresso/latte/cappuccino): ").lower()

        # TODO: when user prompt is "report" print the resources and the current values
        if user_choice == "latte" or user_choice == "cappuccino" or user_choice == "espresso":
            resources_available = check_resources(user_choice)
            if resources_available:
                coins_inserted = process_coins()
                profit = check_transaction(coins_inserted, user_choice)
                if profit != 0:
                    money += profit
                    resources_consumption(user_choice)
                    print(f"Here is your {user_choice}. Enjoy!")

        elif user_choice == "report":
            for value in resources:
                print(f"{value}: {resources[value]}")
            print(f"money: {money}")

        # TODO: when user prompt is "off" finish the program. Any other thing keep running
        elif user_choice == "off":
            is_machine_on = False

        else:
            print("Didn\'t understand your request, Can you prompt again?")


# function that runs the coffe machine
coffe_machine()
