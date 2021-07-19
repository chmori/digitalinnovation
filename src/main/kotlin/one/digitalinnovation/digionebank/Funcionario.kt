package one.digitalinnovation.digionebank

abstract class Funcionario(
    override val nome: String,
    override val cpf: String,
    open val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salario: $salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()
}