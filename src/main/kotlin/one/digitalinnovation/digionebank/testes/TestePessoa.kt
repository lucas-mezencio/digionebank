package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main() {
    val lucas = Pessoa("Lucas", "123.456.789-10")

    println(lucas.nome)
    println(lucas.cpf)
}