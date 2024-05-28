package school.sptech;

public class Main {
    public static void main(String[] args) {
        Double soma = Calculadora.soma(4.5, 2.7);
        Double pi = Calculadora.pi;

        System.out.println("A soma é: " + soma);
        System.out.println("Valor de PI: " + pi);
    }
}