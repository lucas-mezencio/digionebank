package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.utils.ImprimeRelatorioFuncionario

fun main() {
    val analist = Analista("John Doe", "123.456.789-10", 2000.0)
    ImprimeRelatorioFuncionario.imprime(analist)
}