fun main() {
    var dentroDoIntervalo = 0 // valores dentro do intervalo
    var foraDoIntervalo = 0  // valores fora do intervalo

    // um loop para ler 10 valores do usuário
    for (i in 1..10) {
        print("digita o valor $i: ")
        val valor = readLine()!!.toInt() // vê o valor informado pelo usuário

        // veja se o valor está dentro do intervalo 24 a 42
        if (valor in 24..42) {
            dentroDoIntervalo++ // coloca os valores dentro do intervalo
        } else {
            foraDoIntervalo++ // coloca os valores fora do intervalo
        }
    }

    // mostra os resultados
    println("quantidade de valores entre 24 e 42: $dentroDoIntervalo")
    println("quantidade de valores fora do intervalo: $foraDoIntervalo")
}
