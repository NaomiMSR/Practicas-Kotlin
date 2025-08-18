package practicas

fun main(){
    val Amanda = Persona("Amanda", 33, "jugar tennis", null)
    val Aitana = Persona("Aitana", 28, "nadar", null)

    Amanda.muestraPerfil()
    Aitana.muestraPerfil()

    val notificacionesMatutinas = 222
    sumarioNotificaciones(notificacionesMatutinas)
}

class Persona(val nombre: String, val edad: Int, val pasatiempo: String?, val apodo: Persona?){
    fun muestraPerfil(){

        println("Name: $nombre")
        println("Age: $edad")
        if(pasatiempo != null) {
            println("En su tiempo libre le gusta $pasatiempo.")
        }
        if(apodo != null){
            println("De cariño sus conocidos le dicen ${apodo.nombre}.")
            if (apodo.pasatiempo != null){
                println("Este es su pasatiempo ${apodo.pasatiempo}.")
            } else {
                print(".")
            }
        } else {
            println("No tiene ningun apodo")
        }
        println("\n\n")
    }
}


fun sumarioNotificaciones(numerodeMensajes: Int){

    if(numerodeMensajes >= 100){
        println("Tienes +99 notificaciones importantes por revisar !!!")
    } else{
        println("Tienes $numerodeMensajes importantes por revisar !!!")
    }
}
