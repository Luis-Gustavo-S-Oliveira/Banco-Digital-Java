public class Conta implements MensagemExtrato {
    private static int agenciaPadrao = 11001;    
    private static int sequencia;


    protected int id = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.id = id++;
        this.cliente = cliente;
        this.agencia = Conta.agenciaPadrao;
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

    public static int getSequencia() {
        return sequencia;
    }

    public int getId() {
        return id;
    }

    
    @Override
    public String toString() {
        return "Cliente: " + cliente.getNome() +
               " | Conta: " + numero +
               " | Saldo: R$ " + String.format("%.2f", saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    
}

