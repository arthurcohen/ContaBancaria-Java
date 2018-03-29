/** Represents an vehicle
    * @author Arthur Cohen
    * @author www.forcohen.com
*/
public class ContaBancaria{
    protected String cliente;
    protected int numConta;
    protected double saldo;

    /** Creates an vehicle
        * @param cliente The clientt name.
        * @param numConta The client account number.
        * @param saldo The amount of money of this account
    */
    public ContaBancaria(String cliente, int numConta, double saldo){
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    /**
     * @param valor How much money the client need to withdraw
	 * @return True if the client can withdraw money
	 */
    public boolean sacar(double valor){
        if (valor > saldo || valor <= 0) return false;
        saldo -= valor;
        return true;
    }

    /**
     * @param valor How much money the client need to deposit 
	 * @return True if the client can deposit money
	 */
    public boolean depositar(double valor){
        if (valor <= 0) return false;
        saldo += valor;
        return true;
    }

    /**
	 * @return The ContaPoupanca String representation with all relevant data
	 */
    public String toString(){
        return String.format("Cliente %s\n%d - R$ %f", this.cliente, this.numConta, this.saldo);
    }
}
