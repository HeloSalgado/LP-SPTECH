package sptech.school;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("Bob da Silva");
        ContaPoupanca contaPoupanca1 = new ContaPoupanca("Xampson", 0.2);
        ContaCorrente contaCorrente1 = new ContaCorrente("Manoel", 500.0);

        Banco banco1 = new Banco("SPTech Bank");

        banco1.cadastrarConta(contaBancaria1);
        banco1.cadastrarConta(contaPoupanca1);
        banco1.cadastrarConta(contaCorrente1);

        //banco1.exibirContas();
        banco1.exibirSomenteContaPoupanca();
    }
}