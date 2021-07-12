package one.digitalinnovation.digionebank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double
    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salário: $${String.format("%.2f", salario)}
        Auxílio: $${String.format("%.2f", calculoAuxilio())}
    """.trimIndent()
}