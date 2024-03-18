import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploLista {
    public static void main(String[] args) {
//        List listaMaluca = new ArrayList<>();
//        listaMaluca.add("Manoel Gomes");
//        listaMaluca.add(5);
//        listaMaluca.add(true);
//        listaMaluca.add(1.7);
//
//        System.out.println(listaMaluca);
//
//        listaMaluca.add(0, "Heloisa");
//
//        System.out.println(listaMaluca);
//
//        listaMaluca.set(1, "Luan Gomes");
//
//        System.out.println(listaMaluca);
//
////      listaMaluca.remove(2);
//        Integer valor = 5;
//        listaMaluca.remove(valor);
//
//        System.out.println(listaMaluca);
//
//        System.out.println("Primeira posição: " + listaMaluca.get(0));


        // Lista tipada
        List<Integer> listaNumeros = new ArrayList<>();
//
//        listaNumeros.add(5);
//        listaNumeros.add(99);
//        listaNumeros.add(14);
//        listaNumeros.add(52);
//        listaNumeros.add(3);
//
//        System.out.println(listaNumeros);
//
//        System.out.println("Tamanho da lista: " + listaNumeros.size());
//
//        for (int i = 0; i < listaNumeros.size(); i++) {
//            System.out.println(listaNumeros.get(i));
//        }

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos valores deseja digitar?");
        Integer qtdValores = leitor.nextInt();

        for (int i = 0; i < qtdValores; i++){
            System.out.println(String.format("Informe o %dº valor:", i + 1));

            Integer valorDigitado = leitor.nextInt();

            listaNumeros.add(valorDigitado);
        }

        System.out.println(listaNumeros);

    }
}
