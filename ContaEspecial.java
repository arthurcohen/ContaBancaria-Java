public class ContaEspecial extends ContaBancaria{
    private double limite;

    public ContaEspecial(String cliente, int numConta, double saldo, double limite){
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    public boolean sacar(double valor){
        if ((valor > 0) && (this.saldo - valor >= limite * -1)){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public String toString(){
        return String.format("Cliente %s\n%d - R$ %f (limite da conta R$ %f)", super.cliente, this.numConta, this.saldo, this.limite);
    }
}
