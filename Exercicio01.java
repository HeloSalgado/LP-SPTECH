package school.sptech;

public class Exercicio01 {
    public static void main(String[] args) {
        Integer bebes = 5;
        Integer criancas = 3;
        Integer jovens = 2;

        Double valorBebes = 25.12;
        Double valorCriancas = 15.88;
        Double valorJovens = 12.44;

        System.out.println(
                "Você tem um total de " + (bebes + criancas + jovens) +
                        " filhos e vai receber R$" + ((bebes * valorBebes) + (criancas * valorCriancas) + (jovens * valorJovens)) +
                        " de bolsa"
        );

    }
}
