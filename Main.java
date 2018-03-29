public class Main{
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.adicionarConta(new ContaPoupanca("cliente 1", 1, 500.0, 5));
        banco.adicionarConta(new ContaEspecial("cliente 2", 2, 200.0, 50.0));

        System.out.println(banco.mostarTodasContas());

        System.out.println(banco.getConta(1) + "\n");

        banco.removerConta(1);

        System.out.println(banco.mostarTodasContas());
    }
}
