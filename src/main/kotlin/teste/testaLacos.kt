fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular = "Eduardo $i"  //val imutavel; var mutavel
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }


    for (i in 5 downTo 1) {    //ctrl + alt + l alinha o código (indenta)

        val titular = "Eduardo $i"  //val imutavel; var mutavel
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }
}