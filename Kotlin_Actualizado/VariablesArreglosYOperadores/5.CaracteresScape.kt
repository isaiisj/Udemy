fun main(args: Array<String>) {

    var caracterUnicode = '\u20DF'
    println(caracterUnicode)

    // Más Caracteres de Escape

    // Raw Strings Puros
   val miPais = """Mi pais Mexico es un lugar muy bonito
       y su comida es sabrosa. \n
   """

    //var miNombre = "Juan\n\t\bVillalvazo"
    var miNombre = "Juan Villalvazo"

    // Concatenacion, funciones y uso de simbolo de $
    println("Mi nombre es: $miNombre y $miPais")

  val stringCompleto = "Mi nombre es: $miNombre y $miPais"

    println(stringCompleto + " Y todo el string anterior tiene ${stringCompleto.length} caracteres")

}
