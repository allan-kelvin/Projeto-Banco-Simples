
package bancodigital;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}
