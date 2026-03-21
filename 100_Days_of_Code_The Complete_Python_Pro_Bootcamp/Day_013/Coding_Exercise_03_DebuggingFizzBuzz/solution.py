def fizz_buzz(target):
    for number in range(1, target + 1):
        # use and (not or)
        if number % 3 == 0 and number % 5 == 0:
            print("FizzBuzz")
        # use elif (not if)
        elif number % 3 == 0:
            print("Fizz")
        # use elif (not if)
        elif number % 5 == 0:
            print("Buzz")
        else:
            # remove square brackets []
            print(number)
 
