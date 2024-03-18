package miniDesafio;

public class Cofrinho {
    public static void main(String[] args) {
        Metas meta01 = new Metas();
        Metas meta02 = new Metas();

        meta01.cofre = 0.0;
        meta01.nomeMeta = "Bicicleta nova";

        meta01.depositar(100.0);
        System.out.printf("Valor no cofre: %.2f", meta01.cofre);

        meta01.agitar();
        System.out.printf("\nValor aleatório: %.2f", meta01.valorAleatorio);

        meta01.quebrar();

        meta02.cofre = 0.0;
        meta02.nomeMeta = "Bicicleta nova";

        meta02.depositar(60.0);
        System.out.printf("Valor no cofre: %.2f", meta02.cofre);

        meta02.agitar();
        System.out.printf("\nValor aleatório: %.2f", meta02.valorAleatorio);

        meta02.quebrar();
    }
}
