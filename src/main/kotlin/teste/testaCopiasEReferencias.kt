import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente("João", 1002)
    contaJoao.titular = "João"
    var contaMaria = ContaPoupanca("Maria", 1003)
    contaMaria.titular = "Maria"

    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
}