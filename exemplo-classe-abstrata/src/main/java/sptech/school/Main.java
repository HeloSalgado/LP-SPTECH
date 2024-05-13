package sptech.school;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Heloisa", "Ford", 100.000, 2010, 0.1, true);
        Bicicleta bicicleta = new Bicicleta(
                "Giu",
                "Caloi",
                4_000.0,
                2024,
                2.5,
                100.0);

        carro.exibirRelatorioDeRevisao();
    }
}