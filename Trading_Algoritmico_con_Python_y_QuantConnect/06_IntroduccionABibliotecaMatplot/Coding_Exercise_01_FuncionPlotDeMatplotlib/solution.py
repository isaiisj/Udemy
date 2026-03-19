'''
A continuación, explico cada parte del código:

Importación de Bibliotecas:
'''

import matplotlib.pyplot as plt
import numpy as np

'''
Estas líneas importan dos bibliotecas:

matplotlib.pyplot, comúnmente importada como plt, es una colección de funciones que hacen que Matplotlib funcione como MATLAB 
y se usa para la creación de gráficos.

numpy, comúnmente importada como np, es una biblioteca fundamental para la computación científica en Python y proporciona soporte 
para arrays y matrices, junto con una colección de funciones matemáticas para operar en estas estructuras de datos.

Generación de Datos con NumPy:
'''

x = np.linspace(0, 10, 100)  # 100 puntos entre 0 y 10

'''
Esta línea crea un array de 100 puntos linealmente espaciados entre 0 y 10 utilizando la función linspace de NumPy. 
Estos puntos serán utilizados como las coordenadas del eje x para el gráfico.

Cálculo del Seno de los Puntos:
'''

y = np.sin(x)  # Seno de cada punto en x

'''
Aquí se calcula el seno de cada uno de los puntos en el array x utilizando la función sin de NumPy. 
Los resultados se almacenan en el array y, que representará las coordenadas del eje y del gráfico.

Creación del Gráfico con Matplotlib:
'''

plt.plot(x, y)

'''
Esta línea crea un gráfico de línea con los arrays x e y. plt.plot dibuja el gráfico de los valores de x en el eje horizontal 
contra los valores de y en el eje vertical.

Añadir Título y Etiquetas a los Ejes:
'''

plt.title("Gráfico de Seno")
plt.xlabel("x")
plt.ylabel("sin(x)")

'''
Estas líneas añaden un título al gráfico y etiquetas a los ejes x e y, respectivamente. 
Ayudan a cualquier persona que vea el gráfico a entender qué está representando.

Visualización del Gráfico:
'''

plt.show()

'''
Finalmente, plt.show() muestra el gráfico. Es una función de Matplotlib que renderiza el gráfico y lo muestra en una ventana. 
En un entorno como Jupyter Notebook, esta línea puede ser opcional, pero es necesaria en scripts de Python puros para visualizar el gráfico.

En resumen, el script genera un gráfico de la función seno en el intervalo de 0 a 10, utilizando 100 puntos para crear una curva suave. 
El gráfico resultante tiene etiquetas en los ejes y un título, lo que lo hace informativo y fácil de entender.
'''
