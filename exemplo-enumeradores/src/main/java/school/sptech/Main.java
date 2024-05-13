package school.sptech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carta c1 = new Carta(Simbolo.REI, Naipe.ESPADA);
        Carta c2 = new Carta(Simbolo.DOIS, Naipe.COPAS);
        Carta c3 = new Carta(Simbolo.DEZ, Naipe.OUROS);

        switch (c1.getNaipe()){
            case COPAS:
                System.out.println("Copas");
                break;
            case PAUS:
                System.out.println("Paus");
                break;
            case OUROS:
                System.out.println("Ouro");
                break;
            case ESPADA:
                System.out.println("Espadas");
                break;
        }

        Scanner leitor = new Scanner(System.in);

//        System.out.println(Simbolo.REI.getValor());
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);

        String naipe = leitor.next();
        String simbolo = leitor.next();

        Simbolo simboloDigitado = null;

        for (Simbolo s : Simbolo.values() ){
            if (s.getFigura().equals(simbolo)){
                simboloDigitado = s;
            }
        }

        Carta c4 = new Carta(simboloDigitado, Naipe.valueOf(naipe));
        System.out.println(c4);


    }
}