import java.util.Scanner;

public class DesafioScanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do PET:");
        String nome = leitor.nextLine();

        System.out.println("Digite a altura do PET:");
        Double altura = leitor.nextDouble();

        System.out.println("Digite a idade do PET:");
        Integer idade = leitor.nextInt();

        String fraseFormatada = String.format("""
                -------------------------
                Ficha do PET
                -------------------------
                Nome: %s
                Altura: %.2f
                Idade: %d
                -------------------------
                """,nome, altura, idade);

        System.out.println(fraseFormatada);

    }
}
