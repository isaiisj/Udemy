fun main(args: Array<String>) {
/*
 for(x in 1..10){

  println(x)

 }*/

 //Introducción a Funciones

 fun saludar() {

  println("Hola Usuario :)")


 }

//saludar()

 fun anoBisiesto(ano: Int): Boolean {

  var esBisiesto:Boolean = false

  if (ano % 4 == 0){

    esBisiesto = true

  }

   return esBisiesto
 }


   var ano = 2020
   var resultado = anoBisiesto(ano)


   println("El $ano es bisiesto?: $resultado")


 fun suma(numeroUno: Int, numeroDos: Int): Int {
  return  numeroUno + numeroDos
 }


 var resultadoSuma = suma(numeroUno = 10,numeroDos = 8)

 println("El resultado de la suma es $resultadoSuma")

}
