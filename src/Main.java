public class Main {
    public static void main(String[] args) {
        Cliente Alexandre = new Cliente();
        Alexandre.setNome("Alexandre");

        Conta cc = new ContaCorrente(Alexandre);
        Conta poupanca = new ContaPoupanca(Alexandre);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
