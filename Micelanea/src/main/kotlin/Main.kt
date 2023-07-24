fun main(){
    menu()
}
fun menu(){

    do {

        println("======= MENÚ =======")
        println("1. Operadores 1")
        println("2. Codicionales 2")
        println("3. Ciclos 3")
        println("99. Salir")
        println()
        println()
        print("Digite La Opcion A Elegir: ")
        var option = readln().toInt()

        when (option) {
            1 -> {

                operators()
                option = 99

            }
            2 -> {

                conditionals()
                option = 99

            }
            3 -> {

                cycles()
                option = 99

            }
            99 -> {

                println()
                println("Saliendo Del Programa")
                println()

            }
            else -> {

                println()
                println("Numero Incorrecto")
                println()

            }
        }
    }while(option != 99)
}

fun operators() {

    println("======= Operadores =======")
    println("1. Calcular el area de un trigulo\n2. Suma De Dos Numero \n3. Un Numero Elevado Al Cuadrado \n4. Conversion De Euros A Dolares \n5. Area Y Perimetro De Un Cuadrado \n6. Area Y Volumen De Un Cilindro \n7. Area De Un Circulo \n8. Promedio De 3 Numeros")
    println("99. Salir")
    println()
    print("Digite La Opcion A Elegir: ")
    val answer = readln().toInt()
    println()

    when (answer) {
        1 -> {

            println("======= Operadores =======")
            println()
            print("Digita la base de su triangulo: ")
            val base = readln().toInt()
            print("Digita la altura de su triangulo: ")
            val height = readln().toInt()
            val area = (base * height) / 2
            println("Su area es: $area")

        }
        2 -> {

            println("======= Operadores =======")
            println()
            print("Digita El Primer Numero: ")
            val numberOne = readln().toInt()
            print("Digite El Segundo Numero: ")
            val numberTwo = readln().toInt()
            val result = numberOne + numberTwo
            println("La Suma Total De Los Dos Numeros Es: $result")

        }
        3 -> {

            println("======= Operadores =======")
            println()
            print("Digite El Numero a Elevar Al Cuadrado: ")
            val numberOne = readln().toInt()
            val result = numberOne * numberOne
            println("El Resultado De La Elevacion Es: $result")

        }
        4 -> {

            println("======= Operadores =======")
            println()
            val tipoCambio = 1.11
            print("Ingrese La Cantidad De Euros Que Desea Convertir a Dolares: ")
            val euro = readln().toInt()
            val dolar = euro * tipoCambio
            println("La Cantidad De Euros Registrada La Cual Es: $euro  y Convertida En Dolares Es: $dolar")

        }
        5 -> {

            println("======= Operadores =======")
            println()
            print("Digite El Lado De Un Cuadrado: ")
            val side = readln().toInt()
            val area = side * side
            val perimeter = 4 * side
            println("El Area Del Cuadrado Digitado Es: $area")
            println("El Perimetro Del Cuadrado Digitado Es: $perimeter")

        }
        6 -> {

            println("======= Operadores =======")
            println()
            val pi = 3.1416
            print("Ingrese El Radio Del Cilindro: ")
            val radio = readln().toDouble()
            print("Ingrese La Altura Del Cilindro: ")
            val height = readln().toDouble()
            val area = pi * radio * radio
            val volume = area * height
            println("La Area Del Cilidro Es: $area")
            println("El Volumen Del Cilindro Es: $volume")

        }
        7 -> {

            println("======= Operadores =======")
            println()
            val pi = 3.1416
            print("Ingrese El Radio De la Circunferencia: ")
            val radio = readln().toDouble()
            val area = pi * radio * radio
            val lenght = 2 * pi * radio
            println("La Longitud De La Circunferencia Es: $lenght")
            println("La Area De La Circunferencia Es: $area")


        }
        8 -> {

            println("======= Operadores =======")
            println()
            print("Digite La Nota Numero 1: ")
            val noteOne = readln().toInt()
            print("Digite La Nota Numero 2: ")
            val noteTwo = readln().toInt()
            print("Digite La Nota Numero 3: ")
            val noteThree = readln().toInt()
            val result = (noteOne + noteTwo + noteThree)/3
            println("El Promedio De las 3 Notas Es: $result")

        }
        99 -> {

            println("Saliendo Del Programa Gracias Por Utilizarlo :3")

        }
    }

}

fun conditionals(){

    println("1. Identificador De Numeros Positivos y Negativos\n2. Identificador De Numeros Mayores Y Numeros Menores \n3. Lector De Numeros Enteros Positivos (Dice Cual Es El Mayor y Cual Es EL Menor) \n4. Identificador De Dos Numeros Y Hacer Una Operacion (Suma, Resta)\n5. Cociente Entre Dos Numeros \n6. Identificador De Dos Numeros Y Hacer Una Operacion (Suma, Multiplicacion) \n7. Determinacion De Año Bisiesto o No")
    println("99. Salir")
    print("Digite La Opcion A Elegir: ")
    val answer = readln().toInt()

    when (answer) {
        1 -> {

            println("======= Condicionales =======")
            println()
            print("Digite El Numero Que Quiere Identificar: ")
            val number = readln().toInt()

            if (number > 0) {
                println("El Número Ingresado Es Positivo.")
            } else if (number < 0) {
                println("El Número Ingresado Es Negativo.")
            } else {
                println("El Número Ingresado Es Cero.")
            }

        }
        2 -> {

            println("======= Condicionales =======")
            println()
            print("Digite El Primer Numero: ")
            val numberOne = readln().toInt()
            print("Digite El Segundo Numero")
            val numberTwo = readln().toInt()

            if (numberOne > numberTwo){

                println("El Numero Mayor Es: $numberOne")
                println("El Numero Menor Es: $numberTwo")

            }else if(numberTwo > numberOne){

                println("El Numero Mayor Es: $numberTwo")
                println("El Numero Menor Es: $numberOne")

            }else{

                println("El Numero Digitado Es Invalido")

            }

        }
        3 -> {

            println("======= Condicionales =======")
            println()
            print("Digite El Primer Numero: ")
            val numberOne = readln().toInt()
            print("Digite El Segundo Numero: ")
            val numberTwo = readln().toInt()
            print("Digite El Tercer Numero: ")
            val numberThree = readln().toInt()

            if (numberOne > 0 && numberTwo > 0 && numberThree > 0){

                if (numberOne >= numberTwo && numberOne >= numberThree) {

                    println("El Mayor Es: $numberOne")

                } else if (numberTwo >= numberOne && numberTwo >= numberThree) {

                    println("El Mayor Es: $numberTwo")

                } else {

                    println("El Mayor Es: $numberThree")

                }

                if (numberOne <= numberTwo && numberOne <= numberThree) {

                    println("El Menor Es: $numberOne")

                } else if (numberTwo <= numberOne && numberTwo <= numberThree) {

                    println("El Menor Es: $numberTwo")

                } else {

                    println("El Menor Es: $numberThree")

                }

            }else{

                println("El Numero Digitado No Es Valido")

            }
        }
        4 -> {

            println("======= Condicionales =======")
            println()
            print("Digite El Primer Numero: ")
            val A = readln().toInt()
            print("Digite El Segundo Numero: ")
            val B = readln().toInt()
            var result = 0

            if (A < B){

                println("Suma")

                result = A + B

                println("El Resultado De La Suma Es: $result")


            }else if(B < A){

                println("Resta")
                result = A - B

                println("El Resultado De La Resta Es: $result")

            }else{

                println("El Numero Digitado Es Incorrecto")

            }
        }
        5 -> {

            println("======= Condicionales =======")
            println()
            print("Digite El Valor De A: ")
            val A = readln().toDouble()
            print("Digite El Valor De B: ")
            val B = readln().toDouble()

            if (B != 0.0) {

                val cociente = A / B
                println("El Cociente De $A / $B Es: $cociente")

            } else {

                println("La División Por Cero No Está Definida, No Es Posible Realizar La División")

            }
        }
        6 -> {

            println("======= Condicionales =======")
            println()
            print("Digite El Valor De A: ")
            val numberOne = readln().toDouble()
            print("Digite El Valor De B: ")
            val numberTwo = readln().toDouble()

            if (numberOne < 0 || numberTwo < 0) {
                numberOne + numberTwo
            } else {
                numberOne * numberTwo
            }

        }
        7 -> {

            println("======= Condicionales =======")
            println()
            print("Digite Un Año: ")
            val year = readln().toInt()
            val leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)

            if (leapYear){

                println("$year Es Un Año Bisiesto.")

            } else {

                println("$year No Es Un Año Bisiesto.")
            }
        }
        99 -> {

            println("Saliendo Del Programa Gracias Por Utilizarlo :3")

        }
    }
}

fun cycles(){

    println("1. Múltiplos De 3 Entre 1 y 100\n2. Números Impares Entre 0 y 100 \n3. Números Pares Entre 0 y 100 \n4. Cuadrados de los números del 1 al 30 \n5. Totalidad De Suma De Los Cuadrados Del Al 1..100 \n6. Calculo Entre Numero Menor Hasta El Mayor De Forma Ascendente \n7. Suma De Numeros")
    println("99. Salir")
    print("Digite La Opcion A Elegir: ")
    val answer = readln().toInt()

    when (answer) {
        1 -> {
            println("======= Ciclos =======")
            println()
            println("Múltiplos De 3 Entre 1 y 100")
            for (i in 1..100) {
                if (i % 3 == 0) {
                    println(i)
                }
            }

        }
        2 -> {

            println("======= Ciclos =======")
            println()
            println("Números Impares Entre 0 y 100")
            println()
            for (i in 1..100) {

                if (i % 2 != 0) {

                    println(i)

                }
            }

        }
        3 -> {

            println("======= Ciclos =======")
            println()
            println("Números Pares Entre 0 y 100:")
            println()
            for (i in 1..100) {

                if (i % 2 == 0) {

                    println(i)

                }
            }

        }
        4 -> {

            println("======= Ciclos =======")
            println()
            println("Cuadrados Del 1 al 30")
            println()
            for (i in 1..30) {
                val squares = i * i
                println("$i Al Cuadrado Es: $squares")
            }

        }
        5 -> {

            println("======= Ciclos =======")
            println()
            println("Cuadrados Del 1 al 100 De Numeros Naturales")
            println()

            for (i in 1..100) {
                var squares = 0
                squares += i * i
                println("La Suma De Todos Los Primeros 100 Numeros Naturales Es: $squares")
            }

        }
        6 -> {

            println("======= Ciclos =======")
            println()
            println("Digite El Primer Numero (Menor): ")
            val numberOne = readln().toInt()

            println("Digite El Segundo Numero (Mayor): ")
            val numeroTwo = readln().toInt()

            if (numberOne < numeroTwo) {
                println("Numeros Comprendidos Entre $numberOne y $numeroTwo En Secuencia Ascendente:")
                for (i in numberOne..numeroTwo) {
                    println(i)
                }
            } else {
                println("Numeros Inválidos")
            }

        }
        7 -> {

            println("======= Ciclos =======")
            println()
            var suma = 0
            do {
                println("Digite Un Numero (Ingrese 0 Para Terminar EL Proceso): ")
                val numero = readln().toInt()
                suma += numero
            } while (numero != 0)

            println("La Suma De Los Numeros Registrados Es: $suma")

        }
        99 -> {

            println("Saliendo Del Programa Gracias Por Utilizarlo :3")


        }
    }
}
