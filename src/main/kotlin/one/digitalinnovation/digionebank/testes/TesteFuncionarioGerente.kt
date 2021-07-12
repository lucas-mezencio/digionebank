package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.utils.ImprimeRelatorioFuncionario

fun main() {
    val manager = Gerente("John Doe", "123.456.789-10", 5000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(manager)

    TesteAutenticacao().autentica(manager)
}
