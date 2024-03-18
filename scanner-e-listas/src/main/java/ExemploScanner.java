import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        Integer numeroDigitado = leitor.nextInt();

        System.out.println(String.format("O número digitado foi: %d", numeroDigitado));

        System.out.println("Digite um número real: ");
        Double numeroRealDigitado = leitor.nextDouble();

        System.out.println(String.format("O número real digitado foi: %.2f", numeroRealDigitado));

        System.out.println("Digite o seu nome:");
        String nomeDigitado = leitorTexto.nextLine();

        System.out.println(String.format("O nome digitado foi: %s", nomeDigitado));
    }
}
