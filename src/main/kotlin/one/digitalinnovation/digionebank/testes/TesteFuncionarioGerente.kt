package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.*

fun main() {

    val maria = Gerente("Maria do Carmo", "1234567899",5000.0,"senha1235")
    ImprimeRelatorioFuncionario.imprime(maria)
    TesteAutenticacao().autentica(maria)
}