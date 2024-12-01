open class Frutas(){
    
    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0
    
    constructor(color:String,sabor:String,precio:Int):this(){
       this.color = color
       this.sabor = sabor
       this.precio = precio
    }  
    fun pudrirse(){  
      print("La fruta se esta pudriendo")     
    }
}


class FrutasConGrasa():Frutas(){
var cantidadGrasa:Int = 0
    
  constructor(grasa:Int):this(){
       this.cantidadGrasa = grasa
    }         
}


fun main(args: Array<String>) {
   var manzana = Frutas("Rojo","Dulce",4)
   var aguacate = FrutasConGrasa(10)
    
    aguacate.color = "verde"
    
    println(aguacate.color)  
    
}
