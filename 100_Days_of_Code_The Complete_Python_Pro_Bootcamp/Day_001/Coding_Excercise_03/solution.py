'''
If we have two physical glasses and we wanted to switch out the contents. 
We would need to grab an extra glass! So the solution is to create a temporary variable to store the contents from one glass.



temp = glass1
By storing the contents of glass1 in the temp variable. We can now use the glass1 variable to store the contents of glass2

glass1 = glass2
Finally, we can put the contents in the temp variable into glass2.

glass2 = temp


Try it out with some physical glass cups!
'''

glass1 = "milk"
glass2 = "juice"
 
temp = glass1
glass1 = glass2
glass2 = temp
