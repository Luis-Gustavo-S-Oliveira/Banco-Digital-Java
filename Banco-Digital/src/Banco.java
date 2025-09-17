
import java.util.ArrayList;
import java.util.List;

public class Banco {
   
    private List<Conta> contas = new ArrayList<>();;

   public ContaCorrente criarContaCorrente(Cliente cliente) {
        ContaCorrente contaCorrente = new ContaCorrente(cliente);
        contas.add(contaCorrente);
        return contaCorrente;
    }

    public ContaPoupança criarContaPoupança(Cliente cliente) {
        ContaPoupança contaPoupança = new ContaPoupança(cliente);
        contas.add(contaPoupança);
        return contaPoupança;
    }
   
    public void imprimirContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }
  

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> OrdernarContasPorSaldo() {
        contas.sort((c1, c2) -> Double.compare(c1.getSaldo(), c2.getSaldo()));
        return contas;
    }

    public void ordenaContasPorNomes(){
        contas.sort((c1, c2) -> c1.cliente.getNome().compareTo(c2.cliente.getNome()));
    }


}
