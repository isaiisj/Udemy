# import modules
from typing import final

from art import logo
from random import choice


def deal_cards():
    """Returns a random card from the deck"""
    cards = [11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10]
    return choice(cards)


def winner(u_score, c_score):
    """ Takes the score of player and computer and return the winner """
    if u_score == c_score :
        return "Draw 🙃"
    elif u_score == 0:
        return "Win with a Blackjack 😎"
    elif c_score == 0:
        return "Lose, opponent has Blackjack 😱"
    elif c_score > 21:
        return "Opponent went over. You win 😁"
    elif u_score > 21:
       return  "You went over. You lose 😭"
    elif u_score > c_score:
        return "You win 😃"
    else:
        return "You lose 😤"

def calculate_score(cards):
    """ Takes a list of cards and returns the sum of all the cards in the list"""

    # if it is a blackjack return 0
    if sum(cards) == 21 and len(cards) == 2:
        return 0

    # check for an 11 and if score is above replace with a 21
    if sum(cards) > 21 and 11 in cards:
        cards.remove(11)
        cards.append(1)

    # return the sum of all the cards which is the score
    return sum(cards)

def game():
    """
    Main function where once the player has decided to play
    the game starts until player decides to quit
    """
    print(logo)
    play_again = True

    # scores of player and computer begin in 0
    player_score = 0
    computer_score = 0

    while play_again:
        # list where will track the cards of player and computer
        player_cards = []
        computer_cards = []

        # first two selections for player and computer
        for i in range(2):
            # pick two cards for player and computer from deck
            card_selected_player = deal_cards()
            card_selected_computer = deal_cards()

            # add to the list of player and computer cards
            player_cards.append(card_selected_player)
            computer_cards.append(card_selected_computer)

            # keep track of the player's score and computer's score
            player_score = calculate_score(player_cards)
            computer_score = calculate_score(computer_cards)

        print(f"Your cards: {player_cards}, current score: {player_score}")
        print(f"Computer\'s first card: {computer_cards[0]}")

        # player will pick cards until getting a blackjack from computer, player, going above 21 or wants to skip
        not_game_over = True
        while not_game_over:
            # if someone has a blackjack or the player is above 21 finish the turn
            if calculate_score(player_cards) == 0 or calculate_score(computer_cards) == 0 or player_score > 21:
                not_game_over = False
            else:
                another_card_player = input("Type \'y\' to get another card, type \'n\ to pass: ")

                if another_card_player == "y":
                    card_selected_player = deal_cards()
                    player_cards.append(card_selected_player)
                    player_score = calculate_score(player_cards)
                    print(f"Your cards: {player_cards}, current score: {player_score}")
                else:
                    not_game_over = False

        # computer plays after player finishes while score is less than 17
        while computer_score < 17:
            card_selected_computer = deal_cards()
            computer_cards.append(card_selected_computer)
            computer_score = calculate_score(computer_cards)


        # Show final cards and score for player and computer
        print(f"Your final hand: {player_cards}, final score: {player_score}")
        print(f"Computer\s final hand: {computer_cards}, final score: {computer_score}")


        # Check who wins
        print(winner(player_score, computer_score))

        # to quit or play again selection
        player_continue = input("Do you want to play a game of Blackjack? Type \'y\' or \'n\': ")

        if player_continue == 'n':
            play_again = False
        else:
            player_score = 0
            computer_score = 0
            print("\n" * 20)
            print(logo)



# Ask the user if want to play now or maybe other day

player_continue = input("Do you want to play a game of Blackjack? Type \'y\' or \'n\': ")

if player_continue == 'y':
    game()
    print("Goodbye")
elif player_continue == 'n':
    print("Maybe next time :)")
else:
    print("No valid answer...")
    
