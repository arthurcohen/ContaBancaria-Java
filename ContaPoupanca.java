/** Represents an vehicle
    * @author Arthur Cohen
    * @author www.forcohen.com
*/
public class ContaPoupanca extends ContaBancaria{
    private int diaDeRendimento;

    /** Creates an vehicle
        * @param cliente The clientt name.
        * @param numConta The client account number.
        * @param saldo The amount of money of this account
        * @param diaDeRendimento wich day of the month that the account saldo earns
    */
    public ContaPoupanca(String cliente, int numConta, double saldo, int diaDeRendimento){
        super(cliente, numConta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

    /**
	 * @param taxaRendimento The x% value that the account earns, where x/100
	 */
    public void CalcularNovoSaldo(double taxaRendimento){
        this.saldo += this.saldo * (taxaRendimento/100.0);
    }

    /**
	 * @return The ContaPoupanca String representation with all relevant data
	 */
    public String toString(){
        return String.format("Cliente %s\n%d - R$ %f (dia de rendimento %d)", super.cliente, this.numConta, this.saldo, this.diaDeRendimento);
    }
}
