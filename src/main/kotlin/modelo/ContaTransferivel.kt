package modelo

import modelo.Conta

abstract class ContaTransferivel(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
){

    override fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

}