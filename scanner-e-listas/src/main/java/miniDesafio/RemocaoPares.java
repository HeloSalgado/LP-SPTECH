package miniDesafio;

import java.util.ArrayList;
import java.util.List;

public class RemocaoPares {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(7);
        listaNumeros.add(12);
        listaNumeros.add(55);
        listaNumeros.add(24);
        listaNumeros.add(10);
        listaNumeros.add(47);
        listaNumeros.add(14);

//        for (int i = 0; i < listaNumeros.size(); i++) {
//            if (listaNumeros.get(i) % 2 == 0) {
//                listaNumeros.remove(i);
//            }
//
//            if (i < listaNumeros.size() - 1) {
//                if (listaNumeros.get(i + 1) % 2 == 0) {
//                    listaNumeros.remove(i + 1);
//                }
//            }
//        }

        for (int i = listaNumeros.size() - 1; i > 0; i--) {
            if (listaNumeros.get(i) % 2 == 0) {
                listaNumeros.remove(i);
            }
        }


        System.out.println("A lista resultante da remoção é " + listaNumeros);
    }
}
