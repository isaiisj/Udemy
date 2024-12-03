/***********************************************************************
 
    Estructuras en C
 
***********************************************************************/

#include <stdio.h>

//Definición de estructura
struct persona{
    char nombre[20];
    int edad;
}
persona1 = {"Isai",26},
persona2 = {"Maria",20},
persona3,persona4;

int main() 
{
    //Recibir datos de persona 3
    printf("Escribe el nombre de la persona 3: ");
    gets(persona3.nombre);
    printf("Escriba edad de la persona 3: ");
    scanf("%d",&persona3.edad);
    //Liberar buffer
    fflush(stdin);
    
    //Recibir datos de persona 4
    printf("Escribe el nombre de la persona 4: ");
    gets(persona4.nombre);
    printf("Escriba edad de la persona 4: ");
    scanf("%d",&persona4.edad);
    
    //Imprimir nombres y edades
    printf("Su nombre es %s\n", persona1.nombre);
    printf("Su edad es %d\n", persona1.edad);
    printf("\n\nSu nombre es %s\n", persona2.nombre);
    printf("Su edad es %d\n", persona2.edad);
    printf("\n\nSu nombre es %s\n", persona3.nombre);
    printf("Su edad es %d\n", persona3.edad);
    printf("\n\nSu nombre es %s\n", persona4.nombre);
    printf("Su edad es %d\n", persona4.edad);
    
    return 0;
}
