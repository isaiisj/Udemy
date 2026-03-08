'''
The goal is to build a blind auction program.

Demo
https://appbrewery.github.io/python-day9-demo/

Clearing the Output
There are several ways of clearing the output. 
The easiest is to simply print "\n" many times so that the output scrolls down many lines.

e.g.

# This will add 20 new lines to the output
print("\n" * 20)

Functionality
- Each person writes their name and bid.
- The program asks if there are others who need to bid. 
  If so, then the computer clears the output (prints several blank lines) then loops back to asking name and bid.
- Each person's name and bid are saved to a dictionary.
- Once all participants have placed their bid, the program works out who has the highest bid and prints it.

 Hint 1 
Try writing out a flowchart to plan your program.

 Hint 2 
The values that come from the input() function are Strings, you'll need to use the int() function to convert it to a number.
'''


# TODO-1: Ask the user for input
# TODO-2: Save data into dictionary {name: price}
# TODO-3: Whether if new bids need to be added
# TODO-4: Compare bids in dictionary
from art import logo

to_continue = True

print(logo)

users_in_auction = {}

while to_continue:
    name = input("What is your name?: ")
    bid = int(input("What is your bid?: $ "))
    users_in_auction[name] = bid

    extra_user = input("Are there any other bidders? Type \'yes\' or \'no\'\n").lower()

    if extra_user == "no":
        to_continue = False
    else:
        print("\n" * 20)

max_bid = 0
user_with_max_bid = ""

for key in users_in_auction:
    current_bid = users_in_auction[key]
    if current_bid > max_bid:
        max_bid = current_bid
        user_with_max_bid = key

print(f"The winner is {user_with_max_bid} with a bid of ${max_bid}")
