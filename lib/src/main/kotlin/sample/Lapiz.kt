class Lapiz {
    var marca: String
    var modelo: String
    var dureza: String
    var color: String
    
 
    constructor(marca: String, modelo: String, dureza: String, color: String) {
        this.marca = marca
        this.modelo = modelo
        this.dureza = dureza
        this.color = color
    }
}

fun main(){
    val lapiz1 = Lapiz("STAEDLER", "Mars Lumograph Charcoal 100C" , "H", "gris")
    println(lapiz1.marca)

    val lapiz2 = Lapiz( "ALPINO", "Mars Lumograph Charcoal 100D", "J", "verde")
    println(lapiz2.marca)
}