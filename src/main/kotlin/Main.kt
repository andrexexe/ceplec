import java.text.DecimalFormat
import kotlin.math.ceil
import kotlin.math.floor

fun main(args: Array<String>) {
  /*  println("Hello World!")


// convetir tipos de datos
    var nu1 ="5"
    var total=nu1.toInt()+5

    println("la suma de los valores es dos puntos :  $total"  )


    // Como Ingresar Datos por teclado

    // At = (B*A)/2

    println("Ingrese el valor en base ")
    var base = readln().toDouble()


    println("INgrese el valor de la altura ")
    var altura= readln().toDouble()

    var At = (base*altura)/2
    println("La base es : $base y la altura del trinagulo es $altura lo cual da un total de  area de : $At")

    println(""" 
        Los valores ingresados sin :
        Base: $base
        Altura :$altura
        El area del Triangulo es : $At
    """.trimIndent())


    // uso de la biblioteca Matematica



    var raiz = Math.sqrt(At)
    println("La raiz de : $At es : $raiz")
// redondeo de los numeros
    // Cantidad de cifras
    println(DecimalFormat("#.###").format(raiz))
    // Redondeo hacia arriba

    var nota = 3.8
    println(ceil(nota.toDouble()))


    println(floor(nota).toDouble())
*/


// estructura
    // Condicionales

  /*  var tipoNumeros=0

    println("Ingrese un numero Para calcular si es par o es impar ")
    tipoNumeros= readln().toInt()

    if (tipoNumeros % 2 == 0 ){

        println("El numero : $tipoNumeros es par ")}
    else{
        println("el Numero : $tipoNumeros es Impar")
    }
*/
// when -> Switch Case
/*
    var edad = 0
    println("Ingrese Edad")
    edad= readln().toInt()

    // 1 y 11 niños
    // 12 y 17 adolecentes
    // 18 y 29 adultos jovenes
    // 30  mas o mas son adultos

    when(edad){
        in 1..  11 -> {
            println("Su respuesta es : ")
            println("Aun son Niños")


        }
        in 11..17 -> println("adolecentes ")
        in 18..29 -> println("Adultos jovenes")
        else -> println("adultos  ")
    }
*/

        //Convertir tipos de datos
/*

    var combustible = "hibrido"

    when(combustible) {
        "gasolina ", "diesel" -> println("No es un carro electrico ")
        "hibrido" -> println("Es un carro sin pico y placa  ")

        else-> {
            println("Es un carro electrico ")
        }

*/

    // Ciclos For
    /*
// Incremento
    for(i in 1 .. 100){
        println(i)

    }

// Decremento
    for (j in 100 downTo  1 ){
        println(j)
    }

    // Decremento con condicion se usa Step
    for (j in 100 downTo  1 step  3){
        println(j)
    }
*/

    // ARRAYS  ARREGLOS KOTLIN

    // arrayof: Son arreglos para cualquier tipo de dato
// -> se utilizan por defecto para String

    //intarrayof : arreglo de tipo entero
/*
    val estudiantes = arrayOf("Lorena ","Pedro","Mateo")
    val estudiantes1 = intArrayOf(25,28,19)
    println(estudiantes[1])
    println(estudiantes1[2])
    estudiantes[0]="Juan"
    println(estudiantes[0])
    println(estudiantes.size)


    */
    //Recorrer un Arreglo

    /*

    val numeros = intArrayOf(20,45,46,47,48,49,84)

 /*  for (i in 0 .. numeros.size-1){
        println(numeros[i])
    }
    */

// until evita desbordamiento del array y quitamos el -1
    var suma = 0
    for (i in 0 until numeros.size){
        println(numeros[i])
        suma = suma + numeros[i]
    }
    println("La suma de los numeros es: $suma ")

*/

    // USO DE ARRAYLIST
    // arrayListOF<String>: LIsta de elemento de tipo String
    //Si se deja vacio recibe culquier tipo de  dato

    val docentes= arrayListOf<String>("Dario","Pedro","Rafael")
/*
    println(docentes.size)
// Añadir .add
    docentes.add("Andrea")
    println(docentes.size)

    //eliminar .removeAt(posicion)
    docentes.removeAt(2)
    println(docentes)
    */

/*
// uso for each
    var suma = 0
    docentes.forEach{doc->

        println(doc)
    }

    docentes.forEachIndexed { i, doc ->
        suma = suma +1
        println("$suma - $doc") }


    println("------------")

    for(doc1 in docentes){
        println(doc1)
    }
*/
    var z = 1
    while (z<=10){

        println(z)
        z++
    }
    var n =100

    do{
        println(n)
        n--


    }while (n>=1)


    }

