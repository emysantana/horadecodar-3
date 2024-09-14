fun main() {
    // peça para o usuário informar o valor de N
    print("digita o valor de N: ")
    val N = readLine()!!.toInt()  // vê o valor de N e converte para inteiro

    // imprime todos os números de 1 até N
    for (i in 1..N) {
        println(i)
    }
}
