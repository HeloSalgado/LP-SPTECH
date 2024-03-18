import java.math.BigInteger;

public class Teste {
    public static void main(String[] args) {
        // Instanciando um objeto = criando um objeto
        BilheteUnico bilhete01 = new BilheteUnico();

        bilhete01.nomeTitular = "Heloisa";
        bilhete01.saldo = 0.0;
        bilhete01.codigo = "B001";

        bilhete01.carregar(42.0);
        System.out.printf("Saldo atual: %.2f", bilhete01.saldo);

        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.nomeTitular = "Bob da Silva";
        bilhete02.saldo = 0.0;
        bilhete02.codigo = "B002";

        bilhete02.carregar(50.0);
        System.out.printf("Saldo atual: %.2f", bilhete02.saldo);
    }
}
