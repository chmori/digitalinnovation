package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "Jether", numero = 1234)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco2")

    println(banco2.info())
}