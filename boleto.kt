package practicas

var edad = 18
var estudiante = "Si"

fun main(){
    calcularPrecio(edad, estudiante)
}

fun calcularPrecio(edad: Int, estudiante: String){
    when {
        edad <= 12 -> {
            println("Su boleto cuenta con descuento infantil! Su precio es de $25.")
        }
        edad >= 70 -> {
            println("Su boleto cuenta con descuento para adultos mayores! Su precio es de $25.")
        }
        estudiante == "Si" -> {
            println("Cuenta con descuento estudiantil, su precio es de $25.")
        }
        else -> {
            println("Boleto regular. Su precio es de $50.")
        }
    }
}
