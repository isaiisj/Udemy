fun main(args: Array<String>) {

 //Introducción condicionales.
 //when

 var matricula = 34564


 when (matricula){

  1234 -> print("Tu salon es 101")
  2345 -> print("Tu salon es 201")
  3456 -> {print("Tu salon es 301")
          matricula = 1
           }
  4567 -> print("Tu salon es 401")
  else -> print("ve a vicerrectoria a preguntar tu salon")

 }

 var miSalon = when {

  matricula in 0..9999 -> "Tu salon es 1"

  matricula in 10000..19999 -> "Tu salon es 101"

  matricula in 20000..29999 -> "Tu salon es 201"

  matricula in 30000..39999 -> "Tu salon es 301"

  matricula in 40000..49999 -> "Tu salon es 401"

  else -> "ve a vicerrectoria a preguntar tu salon"


 }

 print(miSalon)

}
