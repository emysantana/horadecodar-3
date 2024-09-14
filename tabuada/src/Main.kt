fun main() {
    // peça ao usuário para informar o valor de N
    print("digita o valor de N: ")
    val N = readLine()!!.toInt()

    // um loop para cada número de 1 até N
    for (i in 1..N) {
        println("tabuada do $i:")

        // um loop interno para a tabuada de cada número de 1 a 10
        for (j in 1..10) {
            println("$i x $j = ${i * j}")
        }
        println()  // separar as tabuadas
    }
}
