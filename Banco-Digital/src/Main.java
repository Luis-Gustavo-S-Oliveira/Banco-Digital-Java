public class Main {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("Alice");
        Cliente cliente2 = new Cliente("Bob");

        Conta conta1 = new ContaCorrente(cliente1);
        Conta conta2 = new ContaPoupança(cliente2);
        Conta conta3 = new ContaPoupança(cliente1);
        

        conta1.depositar(1000);
        conta1.tranferir(200, conta2);

        conta1.exibirExtrato();
        conta2.exibirExtrato();
        conta3.exibirExtrato();
    }
}
