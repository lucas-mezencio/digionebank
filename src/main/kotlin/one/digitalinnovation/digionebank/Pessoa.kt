package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Lucas"
    var cpf: String = "111.222.333-44"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val lucas = Pessoa()

    println(lucas)
    println(lucas.pessoaInfo())
}