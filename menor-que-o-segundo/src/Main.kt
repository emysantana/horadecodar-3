fun main() {
    // peça ao usuário para digitar o primeiro número
    print("digita o primeiro número (menor): ")
    val primeiroNumero = readLine()!!.toInt()

    // peça ao usuário para digitar o segundo número
    print("digita o segundo número (maior): ")
    val segundoNumero = readLine()!!.toInt()

    var soma = 0   // variável para somar os números
    var contador = 0   // variável para contar quantos números tem

    // um loop para somar todos os números entre o primeiro e o segundo
    for (i in primeiroNumero..segundoNumero) {
        soma = i   // adiciona o valor atual à soma
        contador++  // aumenta o contador em 1
    }

    // calculando a média
    val media = soma / contador

    // mostra o resultado
    println("a média dos números entre $primeiroNumero e $segundoNumero é: $media")
}
