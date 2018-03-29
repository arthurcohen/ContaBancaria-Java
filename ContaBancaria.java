public class ContaBancaria{
    private String cliente;
    private int numConta;
    private double saldo;

    public ContaBancaria(String cliente, int numConta, double saldo){
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public boolean sacar(double valor){
        if (valor > saldo) return false;
        saldo -= valor;
        return true;
    }

    public boolean depositar(double valor){
        if (valor <= 0) return false;
        saldo += valor;
        return true;
    }

    public String toString(){
        return String.format("Cliente %s\n%d - %d", this.cliente, this.numConta, this.saldo);
    }
}
