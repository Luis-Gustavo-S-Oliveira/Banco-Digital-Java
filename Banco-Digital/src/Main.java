public class Main {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("Alice");
        
        Banco banco1 = new Banco();
        Conta conta1 = new ContaCorrente(new Cliente("Alice"));
        Conta conta2 = new ContaPoupança(new Cliente("Bob"));
        Conta conta3 = new ContaPoupança(cliente1);
        Conta conta4 = new ContaPoupança(new Cliente("Luis"));
        Conta conta5 = new ContaPoupança(new Cliente("Maria"));


        banco1.criarContaCorrente(cliente1);
        banco1.adicionarConta(conta1);
        banco1.criarContaCorrente(new Cliente("lucas"));
        conta1.depositar(1000);
        conta1.tranferir(200, conta2);


        conta1.exibirExtrato();
        conta2.exibirExtrato();
        conta3.exibirExtrato();

        //banco1.imprimirContas(); Só imprime as contas criadas pelo banco, caso eu queira que imprima todas, tem que adicionar as outras contas ao banco1
        banco1.adicionarConta(conta2);
        banco1.imprimirContas();
        banco1.OrdernarContasPorSaldo();
        System.out.println("=== Contas Ordenadas por Saldo ===");
        banco1.imprimirContas();
        banco1.ordenaContasPorNomes();
        System.out.println("=== Contas Ordenadas por Nome ===");
        banco1.imprimirContas();


       
        
    }
}
