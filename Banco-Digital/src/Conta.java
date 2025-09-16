public class Conta implements MensagemExtrato {
    private static int agencia = 11001;    
    private static int sequencia;

    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numero = ++sequencia;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito realizado com sucesso");
    }

     public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque realizado com secesso");
    }

    public void tranferir(double valor, Conta contaDestinatario){
        this.sacar(valor);
        contaDestinatario.depositar(valor);
        System.out.println("Transferencia realizada com sucesso");

    }

    @Override
    public void exibirExtrato(){
       

    }

    public int getAgencia() {
        return agencia;
    }

}
