package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.Pessoa

fun main() {

    val maria = Gerente("Maria do Carmo", "1234567899",5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}