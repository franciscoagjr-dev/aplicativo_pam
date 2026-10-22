package com.example.console

class MinhaClasse {
}


fun MediaEtec(mencaoAtividade: String, mencaoProjeto: String, mencaoProva: String) {
    if (mencaoProva == "MB" &&
        (mencaoProjeto == "MB" || mencaoAtividade == "MB")
    ) {
        print("Aluno fica com MB")
    } else if (mencaoProva == "B" || (mencaoProjeto == "MB" && mencaoAtividade == "MB")) {
        print("Aluno fica com MB")
    } else if (mencaoProva == "B" && (mencaoProjeto == "B" || mencaoAtividade == "B")) {
        print("Aluno fica com B")
    } else if (mencaoProva == "B" && (mencaoProjeto == "R" && mencaoAtividade == "R")) {
        print("Aluno fica com R")
    } else {
        print("Aluno fica com I")
    }

}


fun main() {
    print("Qual é a Menção da ATividade? ")
    val mencaoAtiviade = readln().toString()

    print("Qual é a Menção da Projeto? ")
    val mencaoProjeto = readln().toString()

    print("Qual é a Menção da Prova? ")
    val mencaoProva = readln().toString()

    MediaEtec(mencaoAtiviade, mencaoProjeto, mencaoProva)


}mb




//fun saudar(nome: String) {
   // println("Olá, $nome!")
//}

//fun somar(num1: Int, num2: Int): Int {
    //return num1 + num2
//}

//fun subtrair(num1: Int, num2: Int): Int {
  //  return num1 - num2
//}

//fun main() {

    //saudar("Turma")

   // val idade = subtrair(2026, 1986)
  // val nota = subtrair(10, 7)

 //   println("Idade: $idade")
  // println("Nota: $nota")
//}



//println("Hello World!! Bem Vindo!")
    //val nome = "Ana"
    //val pontos = 21
    //println("Jogadora: $nome")
    //println("Pontos: $pontos")
    //println("Dobro: ${pontos * 2}")
    //println("Letras no nome: ${nome.length}")
    //val pontos = 21
    //if (pontos > 21) {
    //  println("Estourou!")
    //} else if (pontos == 21) {
    //  println("Vinte-e-um!")
    //} else {
    // println("Pode comprar mais uma carta.")
    //}
    //println("Digite o numero da carta: ")
    //val valor = readln().toInt()
    //val nomeDaCarta = when (valor) {
    //  1 -> "Ás"
    // 11 -> "Valete"
    // 12 -> "Dama"
    // 13 -> "Rei"
    //else -> valor.toString()
    // }
    //println(nomeDaCarta)
    // println("Digite uma nota:  ")
    //val nota = readln().toInt()
    //when (nota) {
    //  in 0..5 -> println("Precisa de recuperação")
    // in 6..8 -> println("Aprovado")
    // else -> println("Aprovado com destaque")
    //}
    // val naipes = listOf("Ouro", "Espada", "Copa", "Paus")
    //println(naipes[0])       // primeiro item
    //println(naipes.size)     // quantidade de itens
    //for (naipe in naipes) {
    //    println(naipe)
//    }
