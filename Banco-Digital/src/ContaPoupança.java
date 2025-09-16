public class ContaPoupança extends Conta {
    
   
    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }
    

    @Override
    public void exibirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Número da Conta: " + numero);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
        System.out.println("==============================");
    }
}
