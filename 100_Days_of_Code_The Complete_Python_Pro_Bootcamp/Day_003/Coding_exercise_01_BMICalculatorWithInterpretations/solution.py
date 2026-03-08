weight = 85
height = 1.85
 
bmi = weight / (height ** 2)
 
if bmi >= 25:
    print("overweight")
elif bmi >= 18.5:
    print("normal weight")
else:
    print("underweight")

'''
If bmi greater than or equal to 25, it will print "overweight".

If the first check is true, the code will stop running, 
but if the first condition was false then it will make the next elif 
check to see if it's greater than or equal to 18.5. So if it's not greater 
than 25 and it's greater than 18.5 then the 18.5-25 range will print "normal weight".

Everything else will be below 18.5 and that will print "underweight".
'''
