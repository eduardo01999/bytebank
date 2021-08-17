abstract class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set   //só as classes filhas consegue alterar com protected

//    constructor(titular: String, numero: Int) {      //construtor secundário
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposita(valor: Double) {   // função dentro da classe é chamado de comportamentos
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    open fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if (valor > 0) {
//            saldo = valor
//        }
}