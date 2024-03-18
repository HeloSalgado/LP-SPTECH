import java.util.Scanner;

public class ExemploSwitchCase {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de um dia da semana:");
        Integer diaDaSemana = leitor.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Aula de LP");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sextou");
                break;
            default:
                System.out.println("Número inválido");
        }

        String fruta = "Melancia";
        switch (fruta){
            case "Maça":
                System.out.println("Temos maçã no estoque!");
                break;
            case "Melancia":
                System.out.println("Temos poucas melancias no estoque");
                break;
            default:
                System.out.println("Fruta não encontrada");
                break;
        }
    }
}
