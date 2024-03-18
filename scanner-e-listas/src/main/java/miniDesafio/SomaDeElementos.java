package miniDesafio;

import java.util.ArrayList;
import java.util.List;

public class SomaDeElementos {
    public static void main(String[] args) {
        List<Integer> listaInteiros = new ArrayList<>();

        listaInteiros.add(5);
        listaInteiros.add(20);
        listaInteiros.add(6);
        listaInteiros.add(10);


        Integer somaLista = 0;

        for (int i = 0; i < listaInteiros.size(); i++) {
            somaLista += listaInteiros.get(i);
        }
        System.out.println(listaInteiros);

        System.out.println(String.format("A soma total dos elementos é: %d", somaLista));
    }
}
