package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val lucas = Pessoa("Lucas", "123.456.789-10")
    println(lucas.nome)
    println(lucas.cpf)

    val func = Funcionario("Lucas Mezencio", "123.456.789-10", BigDecimal.valueOf(10000.0))
    println(func.nome)
    println(func.cpf)
    println(func.salario)
}