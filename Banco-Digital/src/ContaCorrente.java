public class  ContaCorrente extends Conta {
   
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    Conta conta = new Conta(cliente);
    @Override
    public void exibirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Número da Conta: " + numero);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
        System.out.println("==============================");
    }
}