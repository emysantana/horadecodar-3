fun main() {
    // faz a contagem regressiva de 30 até 0
    var contador = 30

    while (contador >= 0) {
        println(contador)  // mostre o número da contagem
        Thread.sleep(1000) // espera 1 segundo (1000 milissegundos)
        contador--         // diminua o contador em 1
    }

    // quando a contagem terminar, mostre a "EXPLOSÃO"
    println("EXPLOSÃO!")
}
