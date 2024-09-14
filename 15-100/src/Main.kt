fun main() {
    var soma = 0      // variável para armazenar a soma dos números
    var contador = 0  // variável para contar quantos números existem

    // loop para somar os números de 15 a 100
    for (i in 15..100) {
        soma += i       // adiciona o valor da soma
        contador++      // conta quantos números estão sendo somados
    }

    // calcule a média aritmética
    val media = soma / contador

    // mostre o resultado
    println("a média aritmética dos números entre 15 e 100 é: $media")
}
