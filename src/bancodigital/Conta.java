
package bancodigital;


public abstract class Conta implements iConta{
    
    private static final int AGENCIA_PADRAO =1;
    private static  int SEQUENCIAL=1;
    
    protected int agencia;
    protected int conta;
    protected double saldo;

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
      
    public Conta(){
       this.agencia=Conta.AGENCIA_PADRAO;
       this.conta=SEQUENCIAL++;
    }
    
  

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
       this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
      protected void imprimirExtratoGeral (){
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo da Conta : %.2f", this.saldo));
    }
}
