package practicas

var num1 = 10
var num2 = 5
var suma = num1 + num2
var resta = num1 - num2
var multiplicacion = num1 * num2
var division = num1 / num2

fun main(){
    saludoCordial()
    operacionesAritmeticas()
    addSuma(10,10)
    var miresta = restando(10,5)
    println(miresta)
    resultadoOperacion()
}

fun saludoCordial(){
    println("¿Cómo estás el día de hoy?")
}

fun operacionesAritmeticas(){
    println(message = "Este es el resultado de la suma: $suma")
    println(message = "Este es el resultado de la resta: $resta")
    println(message = "Este es el resultado de la multiplicacion: $multiplicacion")
    println(message = "Este es el resultado de la division: $division")
}

fun addSuma(primerNumero: Int, segundoNumero: Int): Int{
    return primerNumero - segundoNumero
}

fun restando(primerNumero: Int, segundoNumero: Int): Int{
    return primerNumero - segundoNumero
}

fun resultadoOperacion(){
    println("Este es el resultado de la suma: $suma")
}
