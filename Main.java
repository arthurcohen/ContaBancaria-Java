/** Represents an vehicle
    * @author Arthur Cohen
    * @author www.forcohen.com
*/
public class Main{
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.adicionarConta(new ContaPoupanca("cliente 1", 1, 500.0, 5));
        banco.adicionarConta(new ContaEspecial("cliente 2", 2, 200.0, 50.0));

        System.out.println(banco.mostarTodasContas());

        // System.out.println(banco.getConta(1) + "\n");

        banco.removerConta(1);

        System.out.println(banco.mostarTodasContas());

        banco.CalcularNovoSaldo(0, 10);
        banco.sacar(0, 500.0);

        System.out.println(banco.mostarTodasContas());

        banco.removerConta(0);
        banco.adicionarConta(new ContaEspecial("cliente 2", 2, 200.0, 50.0));
        
        banco.sacar(0, 250.0);
        banco.CalcularNovoSaldo(0, 10);

        System.out.println(banco.mostarTodasContas());
    }
}
