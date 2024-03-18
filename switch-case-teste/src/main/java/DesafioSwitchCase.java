import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class DesafioSwitchCase {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer num1;
        Integer num2;


        Integer operacao;

        do {
            System.out.println("""
                1 - Somar
                2 - Subtrair
                3 - Multiplicar
                """);
            operacao = leitor.nextInt();

        } while (operacao != 1 && operacao != 2 && operacao != 3);

        Integer resultadoConta = 0;

        System.out.println("Digite o primeiro número:");
        num1 = leitor.nextInt();

        System.out.println("Digite o segundo número:");
        num2 = leitor.nextInt();


        switch (operacao){
            case 1 -> {

                resultadoConta = num1 + num2;

                System.out.printf("O resultado é: %d", resultadoConta);

            }

            case 2 -> {

                resultadoConta = num1 - num2;

                System.out.printf("O resultado da subtração é: %d", resultadoConta);

            }

            case 3 -> {

                resultadoConta = num1 * num2;

                System.out.printf("O resultado da multiplicação é: %d", resultadoConta);
            }
        }
    }
}
