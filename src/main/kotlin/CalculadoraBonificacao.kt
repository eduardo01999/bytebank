class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun regista(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }

}