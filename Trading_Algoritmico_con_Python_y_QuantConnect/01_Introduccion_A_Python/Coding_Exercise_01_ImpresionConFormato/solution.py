'''
1. Definición de la variable nombre: Se asigna la cadena de texto "Carlos" a la variable nombre. 
Esta variable se usará para personalizar el mensaje de felicitación.


2. Creación del mensaje con f-string:

- Se escribe f" para iniciar una f-string.

- Se escribe el mensaje estático que queremos mostrar: "¡Felicidades ".

- Para incluir el nombre del estudiante, se usan llaves {nombre}. Aquí, Python buscará el valor de la variable nombre 
  y lo insertará en esa posición del mensaje.

- Se completa el mensaje con el texto estático restante: " por completar el curso de Business Analytics!".

- Se cierra la f-string con otra comilla.


3. Impresión del mensaje:

- Se utiliza la función print() para enviar el mensaje final al estándar de salida (por lo general, la pantalla).

Cuando se ejecuta esta línea de código, Python evalúa la expresión dentro de {nombre}, reemplaza {nombre} con "Carlos", 
y luego imprime el mensaje completo: "¡Felicidades Carlos por completar el curso de Business Analytics!".
'''


nombre = "Carlos"
print(f"¡Felicidades {nombre} por completar el curso de Business Analytics!")
