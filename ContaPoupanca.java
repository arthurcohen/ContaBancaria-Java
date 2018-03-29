public class ContaPoupanca extends ContaBancaria{
    private int diaDeRendimento;

    public ContaPoupanca(String cliente, int numConta, double saldo, int diaDeRendimento){
        super(cliente, numConta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

    public void CalcularNovoSaldo(double taxaRendimento){
        this.saldo += this.saldo * (taxaRendimento/100.0);
    }

    public String toString(){
        return String.format("Cliente %s\n%d - R$ %f (dia de rendimento %d)", super.cliente, this.numConta, this.saldo, this.diaDeRendimento);
    }
}
