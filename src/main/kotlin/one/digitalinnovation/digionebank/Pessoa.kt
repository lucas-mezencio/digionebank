package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Lucas"
    var cpf: String = "111.222.333-44"
    private set
}

fun main() {
    val lucas = Pessoa()

    println(lucas.nome)
    println(lucas.cpf)
}