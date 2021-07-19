package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    override val nome: String,
    override val cpf: String,
    val salario: BigDecimal
) : Pessoa(nome, cpf) {
    abstract fun calculoAuxilio():
}