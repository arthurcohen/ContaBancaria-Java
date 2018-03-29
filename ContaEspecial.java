/** Represents an vehicle
    * @author Arthur Cohen
    * @author www.forcohen.com
*/
public class ContaEspecial extends ContaBancaria{
    private double limite;

    /** Creates an vehicle
        * @param cliente The clientt name.
        * @param numConta The client account number.
        * @param saldo The amount of money of this account
        * @param limite How much money the client can withdraw when the saldo is below zero
    */
    public ContaEspecial(String cliente, int numConta, double saldo, double limite){
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    /**
     * @param valor How much money the client need to withdraw
	 * @return True if the client can withdraw money
	 */
    public boolean sacar(double valor){
        if ((valor > 0) && (this.saldo - valor >= limite * -1)){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    /**
	 * @return The ContaEspecial String representation with all relevant data
	 */
    public String toString(){
        return String.format("Cliente %s\n%d - R$ %f (limite da conta R$ %f)", super.cliente, this.numConta, this.saldo, this.limite);
    }
}
