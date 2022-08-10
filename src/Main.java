public class Main {

    public static void main(String[] args ) {
        Conta cc = new ContaCorrente(Cliente);
        Conta cp = new ContaPoupanca();

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
