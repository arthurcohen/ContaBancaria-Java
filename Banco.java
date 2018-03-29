import java.util.List;
import java.util.ArrayList;

public class Banco{
    private List<ContaBancaria> contas;

    public Banco(){
        this.contas = new ArrayList<ContaBancaria>();
    }

    public void adicionarConta(ContaBancaria conta){
        this.contas.add(conta);
    }

    public ContaBancaria getConta(int index){
        return this.contas.get(index);
    }

    public boolean CalcularNovoSaldo(int index, int taxaRendimento){
        try{
            ContaPoupanca conta = (ContaPoupanca)this.contas.get(index);
            conta.CalcularNovoSaldo(taxaRendimento);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public boolean sacar(int index, double valor){
        return this.contas.get(index).sacar(valor);
    }

    public void removerConta(int index){
        this.contas.remove(index);
    }

    public String mostarTodasContas(){
        String message = "";
        for (ContaBancaria conta : this.contas){
            message += conta.toString() + "\n";
        }
        return message;
    }
}
