package school.sptech;

import school.sptech.atleta.Carteiro;
import school.sptech.atleta.Corredor;
import school.sptech.atleta.Triatleta;
import school.sptech.atleta.Velocista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Corredor corredor = new Velocista("Bolt");
//        corredor.correr();
//
//        Carteiro carteiro = new Carteiro("Jaime");
//        carteiro.correr();
//
//        Triatleta triatleta = new Triatleta("João");
//        triatleta.correr();
//        triatleta.nadar();
//
//        List<Corredor> corredores = new ArrayList<>();
//        corredores.add(triatleta);
//        corredores.add(carteiro);
//        corredores.add(corredor);

        Servico s1 = new Servico("Netflix", 55.0);
        Alimento a1 = new Alimento(1, "Arroz 5kg", 30.0, 1);
        Perfume p1 = new Perfume(1, "212", 500.0, "Doce");

        Tributo tributo = new Tributo();
        tributo.adicionaTributavel(s1);
        tributo.adicionaTributavel(a1);
        tributo.adicionaTributavel(p1);
        tributo.exibiTodos();

        System.out.printf("Valor total de tributos: %.2f", tributo.calculaTotalTributo());
    }
}