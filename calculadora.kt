package br.com.digitalhouse.aula14.calculadora

fun main() {
    fun somar(x:Int, y:Int) = x + y

    fun multiplicar (x:Int, y:Int) = x*y

    fun dividir(x:Int, y:Int) = x/y

    fun subtrair(x: Int, y: Int) = x - y

    val X = 250
    val Y = 35

    val resultado1 = somar(X, Y)
    val resultado2 = multiplicar(X, Y)
    val resultado3 = dividir(X, Y)
    val resultado4 = subtrair(X, Y)

    println("o resultado da soma é = $resultado1")
    println("o resultado do multiplicador é = $resultado2")
    println("o resultado de dividir é = $resultado3")
    println("o resultado de subtrair é = $resultado4")

}


