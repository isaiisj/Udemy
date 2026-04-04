from turtle import Turtle, Screen
#import another_module

#print(another_module.another_module_variable)

# Creating and object and using its methods
timmy = Turtle()
print(timmy)
timmy.shape("turtle")
timmy.fillcolor("BlueViolet")
timmy.forward(100)

# Creating other object for the screen and using its attributes and methods
my_screen = Screen()
print(my_screen.canvheight)
my_screen.exitonclick()
