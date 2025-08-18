package practicas
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("CALCULADORA DE ÍNDICE DE MASA CORPORAL (IMC)")
    println()

    var nombre: String
    var peso: Double
    var estatura: Double
    var edad: Int
    var imc: Double
    var resultado: String

    print("Ingrese su nombre: ")
    nombre = scanner.nextLine()

    print("Ingrese su edad (años): ")
    edad = scanner.nextInt()

    print("Ingrese su peso (kg): ")
    peso = scanner.nextDouble()

    print("Ingrese su estatura (metros, ej: 1.75): ")
    estatura = scanner.nextDouble()


    if (peso < 0 || estatura < 0 || edad <= 0) {
        println("Error: Los valores deben ser positivos.")
        return
    }


    imc = peso / (estatura * estatura)


    resultado = when {
        imc < 18.5 -> "Bajo peso"
        imc < 25.0 -> "Peso normal"
        imc < 30.0 -> "Sobrepeso"
        imc < 35.0 -> "Obesidad grado I"
        imc < 40.0 -> "Obesidad grado II"
        else -> "Obesidad grado III (mórbida)"
    }


    println()
    println("--RESULTADOS--")
    println("Nombre: $nombre")
    println("Edad: $edad años")
    println("Peso: $peso kg")
    println("Estatura: $estatura m")
    println("IMC: %.2f".format(imc))
    println("Resultado: $resultado")


    println()
    println("RECOMENDACIÓN")
    val recomendacion = when {
        imc < 18.5 -> "Se recomienda consultar con un profesional de la salud."
        imc < 25.0 -> "¡Felicidades! Mantiene un peso saludable."
        imc < 30.0 -> "Se recomienda adoptar hábitos más saludables."
        else -> "Es importante consultar con un médico."
    }
    println(recomendacion)

    scanner.close()
}

