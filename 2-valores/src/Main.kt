fun main() {
    // pede para o usuário digitar o primeiro valor
    print("digita o primeiro valor: ")
    val valor1 = readLine()?.toDoubleOrNull()

    // veja se o primeiro valor é certo
    if (valor1 != null) {
        var valor2: Double? = null

        // enquanto o valor2 for menor ou igual a 0, pede um novo valor
        while (valor2 == null || valor2 <= 0) {
            print("digita o segundo valor (maior que zero): ")
            valor2 = readLine()?.toDoubleOrNull()

            // mostra uma mensagem se o valor for inválido
            if (valor2 == null || valor2 <= 0) {
                println("o valor deve ser maior que zero. tente de novo!")
            }
        }

        // faz a divisão do primeiro valor pelo segundo
        val resultado = valor1 / valor2
        println("o resultado da divisão é: $resultado")
    } else {
        println("por favor, digite um valor válido para o primeiro valor.")
    }
}
