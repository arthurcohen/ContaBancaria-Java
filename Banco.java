import java.util.List;
import java.util.ArrayList;

/** Represents an vehicle
    * @author Arthur Cohen
    * @author www.forcohen.com
*/
public class Banco{
    private List<ContaBancaria> contas;

    public Banco(){
        this.contas = new ArrayList<ContaBancaria>();
    }

    /**
	 * @param conta A ContaBancaria to be add to the local contas List
	 */
    public void adicionarConta(ContaBancaria conta){
        this.contas.add(conta);
    }

    /**
	 * @param index The index of the account to return the ContaBancaria
	 * @return The selected account
	 */
    public ContaBancaria getConta(int index){
        return this.contas.get(index);
    }

    /**
	 * @param index The index of the account to CalcularNovoSaldo
     * @param valor How much money the client need to deposit 
	 * @return True if the client can deposit money
	 */
    public boolean CalcularNovoSaldo(int index, int taxaRendimento){
        try{
            ContaPoupanca conta = (ContaPoupanca)this.contas.get(index);
            conta.CalcularNovoSaldo(taxaRendimento);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    /**
	 * @param index The index of the account to CalcularNovoSaldo
	 * @param taxaRendimento The x% value that the account earns, where x/100
	 * @return True if the client can withdraw money
	 */
    public boolean sacar(int index, double valor){
        return this.contas.get(index).sacar(valor);
    }

    /**
	 * @param index The index of the account to remove from contas List
	 */
    public void removerConta(int index){
        this.contas.remove(index);
    }

    /**
	 * @return The string representation of all accounts on the contas List
	 */
    public String mostarTodasContas(){
        String message = "";
        for (ContaBancaria conta : this.contas){
            message += conta.toString() + "\n";
        }
        return message;
    }
}
