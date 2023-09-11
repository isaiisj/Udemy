/*Ciclos for in */
fun main(args: Array<String>) {
  
    var arregloInt = intArrayOf(4,5,6,7,8,9,10,11,12,13,14,15,16,17,18)
 
    for((indice,valor)   in arregloInt.withIndex()) {
        
        println("El indice $indice representa el valor de: $valor")
        
    }
    
}
