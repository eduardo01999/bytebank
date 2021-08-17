fun testaComportamentosConta() {
    val contaEduardo = ContaCorrente(titular = "Eduardo", numero = 1000)
    contaEduardo.deposita(200.0)

    val contaAlex = ContaPoupanca(numero = 1001, titular = "Alex")
    contaAlex.deposita(300.0)

    println(contaEduardo.titular)
    println(contaEduardo.numero)
    println(contaEduardo.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Eduardo")
    contaEduardo.deposita(50.0)
    println(contaEduardo.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(70.0)
    println(contaAlex.saldo)

    println("sacando na conta do Eduardo")
    contaEduardo.saca(250.0)
    println(contaEduardo.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta do Eduardo")
    contaEduardo.saca(100.0)
    println(contaEduardo.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(500.0)
    println(contaAlex.saldo)

    println("Transferência da conta do Alex para o Eduardo")

    if (contaAlex.transfere(destino = contaEduardo, valor = 300.0)) {
        println("transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaEduardo.saldo)
    println(contaAlex.saldo)
}