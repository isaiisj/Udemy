# import tkinter module
import tkinter

# creates the window
window = tkinter.Tk()

# title of the window
window.title("My first GUI program")

# minimum size of the window
window.minsize(width=500, height=300)

# first create the component and then we tell how is this show up
my_label = tkinter.Label(text="I Am a Label", font=("Arial", 24, "bold"))

# pack the label on the screen
my_label.pack(side="left")

# leep the window open and goes at the end of the program
window.mainloop()






# The packer: https://docs.python.org/3/library/tkinter.html#the-packer
