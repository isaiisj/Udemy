/*If Else */
fun main(args: Array<String>) {
  
    var a = 123
    var b = 11
    var c = 5
    var numeroMayor:Int
    
   numeroMayor = if(a>b && a>c) a else if(b>a && b>c) b else c
    
   println("El numero mayor de todas mis variables es: $numeroMayor") 
    
}
