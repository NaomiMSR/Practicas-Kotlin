package practicas

var dato = 1
var Mes = 3
var año = 1986
var dia = 3


fun main(){
    dato(dato)
    Mes(Mes)
    Trimestre(Mes)
    Semestre(Mes)
    Signo(año)
    Griego(dia, Mes)
}

fun dato(dato: Int){
    when(dato){
        1 -> println("Esta es una primera opcion")
        2 -> println("Esta es una segunda opcion")
        3 -> println("Esta es una tercera opcion")
        else -> println("Se ha ingresado una opción invalida en el sistema")
    }
}

fun Mes(Mes: Int){
    when(Mes){

        1 -> println("El mes seleccionado es Enero")
        2 -> println("El mes seleccionado es Febrero")
        3 -> println("El mes seleccionado es Marzo")
        4 -> println("El mes seleccionado es Abril")
        5 -> println("El mes seleccionado es Mayo")
        6 -> println("El mes seleccionado es Junio")
        7 -> println("El mes seleccionado es Julio")
        8 -> println("El mes seleccionado es Agosto")
        9 -> println("El mes seleccionado es Septiembre")
        10 -> println("El mes seleccionado es Octubre")
        11 -> println("El mes seleccionado es Noviembre")
        12 -> println("El mes seleccionado es Diciembre")
        else -> println("La opción ingresada no es válida para el sistema")

    }
}

fun Trimestre(Mes: Int){
    when(Mes){

        1,2,3 -> println("La opción ingresada pertenece al primer trimestre")
        4,5,6 -> println("La opción ingresada pertenece al segundo trimestre")
        7,8,9 -> println("La opción ingresada pertenece al tercer trimestre")
        10,11,12 -> println("La opción ingresada pertenece al cuarto trimestre")
        else -> println("Dato incorrecto dentro del sistema")
    }
}

fun Semestre(Mes: Int){
    when(Mes){
        1,2,3,4,5,6 -> println("La opción ingresada pertenece al primer semestre")
        7,8,9,10,11,12 -> println("La opcion ingresada pertenece al segundo semestre")
    }
}

fun Signo(año: Int){
    when(año){
        1900, 1912, 1924, 1936, 1948, 1960, 1972, 1984, 1996, 2008 -> println("Tu signo zodiacal chino es La Rata")
        1901, 1913, 1925, 1937, 1949, 1961, 1973, 1985, 1997, 2009 -> println("Tu signo zodiacal chino es El Buey")
        1902, 1914, 1926, 1938, 1950, 1962, 1974, 1986, 1998, 2010 -> println("Tu signo zodiacal chino es El Tigre")
        1903, 1915, 1927, 1939, 1951, 1963, 1975, 1987, 1999, 2011 -> println("Tu signo zodiacal chino es El Conejo")
        1904, 1916, 1928, 1940, 1952, 1964, 1976, 1988, 2000, 2012 -> println("Tu signo zodiacal chino es El Dragón")
        1905, 1917, 1929, 1941, 1953, 1965, 1977, 1989, 2001, 2013 -> println("Tu signo zodiacal chino es La Serpiente")
        1906, 1918, 1930, 1942, 1954, 1966, 1978, 1990, 2002, 2014 -> println("Tu signo zodiacal chino es El Caballo")
        1907, 1919, 1931, 1943, 1955, 1967, 1979, 1991, 2003, 2015 -> println("Tu signo zodiacal chino es El Carnero")
        1908, 1920, 1932, 1944, 1956, 1968, 1980, 1992, 2004, 2016 -> println("Tu signo zodiacal chino es El Mono")
        1909, 1921, 1933, 1945, 1957, 1969, 1981, 1993, 2005, 2017 -> println("Tu signo zodiacal chino es El Gallo")
        1910, 1922, 1934, 1946, 1958, 1970, 1982, 1994, 2006, 2018 -> println("Tu signo zodiacal chino es El Perro")
        1911, 1923, 1935, 1947, 1959, 1971, 1983, 1995, 2007, 2019 -> println("Tu signo zodiacal chino es El Jabali")
    }
}

fun Griego(dia: Int, mes: Int){
    val signo = when (Mes){
        1 -> if(dia >= 20) "Tu signo es Acuario" else "Tu signo es Capricornio"
        2 -> if(dia >= 19) "Tu signo es Pscis" else "Tu signo es Acuario"
        3 -> if(dia >= 19) "Tu signo es Aries" else "Tu signo es Pscis"
        4 -> if(dia >= 20) "Tu signo es Tauro" else "Tus signo es Aries"
        5 -> if(dia >= 21) "Tu signo es Geminis" else "Tu signo es Tauro"
        6 -> if(dia >= 21) "Tu signo es Cancer" else "Tu signo es Geminis"
        7 -> if (dia >= 23) "Tu signo es Leo" else "Tu signo es Cáncer"
        8 -> if (dia >= 23) "Tu signo es Virgo" else "Tu signo es Leo"
        9 -> if (dia >= 23) "Tu signo es Libra" else "Tu signo es Virgo"
        10 -> if (dia >= 23) "Tu signo es Escorpio" else "Tu signo es Libra"
        11 -> if (dia >= 22) "Tu signo es Sagitario" else "Tu signo es Escorpio"
        12 -> if (dia >= 22) "Tu signo es Capricornio" else "Tu signo es Sagitario"
        else -> "Fecha inválida"
    }
    println("Tu signo zodiacal es: $signo")
}

