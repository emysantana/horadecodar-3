fun main() {
    var aprovados = 0  // um contador de alunos aprovados
    var resposta: String

    do {
        // peça as duas notas do aluno
        print("digita a primeira nota: ")
        val nota1 = readLine()!!.toDouble()

        print("digita a segunda nota: ")
        val nota2 = readLine()!!.toDouble()

        // calcule a média
        val media = (nota1 + nota2) / 2
        println("a média final do aluno é: $media")

        // veja se o aluno foi aprovado
        if (media >= 9.5) {
            println("aluno aprovado!")
            aprovados++  // conte mais um aprovado
        } else {
            println("aluno reprovado.")
        }

        // pergunta se quer calcular a média de outro aluno
        print("calcular a média de outro aluno? (sim/não): ")
        resposta = readLine()!!.toString()

    } while (resposta == "sim" || resposta == "s")

    // mostra quantos alunos foram aprovados
    println("quantidade de alunos aprovados: $aprovados")
}
