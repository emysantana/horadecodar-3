fun main() {
    var soma = 0.0  // variável para somar as notas
    var nota: Double // variável para guardar a nota digitada

    // veja 6 notas do aluno
    for (i in 1..6) {
        do {
            // peça para o usuário digitar a nota
            print("digita a nota $i (entre 0 e 10): ")
            nota = readLine()!!.toDouble()

            // veja se a nota é válida
            if (nota < 0 || nota > 10) {
                println("nota inválida! digita uma nota entre 0 e 10.")
            }

        } while (nota < 0 || nota > 10)  // continua pedindo até ser válida

        soma += nota  // soma a nota válida
    }

    // calcule a média das 6 notas
    val media = soma / 6

    // mostra a média final
    println("a média final do aluno é: $media")
}
