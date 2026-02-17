'''
Hurdles race

Reeborg has entered a hurdles race. Make him run the course, following the path shown.

What you need to know
- The functions move() and turn_left().
'''


def turn_right():
    for i in range(3):
        turn_left()

def jump():
    move()
    turn_left()
    move()
    turn_right()
    move()
    turn_right()
    move()
    turn_left()
    
for i in range(6):
    jump()
    
