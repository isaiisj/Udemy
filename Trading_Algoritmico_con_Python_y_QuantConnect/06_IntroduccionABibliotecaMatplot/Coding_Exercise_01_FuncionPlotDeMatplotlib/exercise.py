import matplotlib.pyplot as plt 
import numpy as np 

x = np.linspace(0,10,100)

y = np.sin(x)

plt.plot(x,y, color = "red")
plt.xlabel("Eje x")
plt.ylabel("Eje y")
plt.title("Funcion Seno")
plt.show()
