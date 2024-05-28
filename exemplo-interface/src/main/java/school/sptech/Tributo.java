package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Tributo {
    private List<Tributavel> tributaveis;

    public Tributo() {
        tributaveis = new ArrayList<>();
    }

    public void adicionaTributavel(Tributavel t){
        tributaveis.add(t);
    }

    public Double calculaTotalTributo(){
        Double total = 0.0;
        for (Tributavel tributaveis : this.tributaveis) {
            total += tributaveis.getValorTributo();
        }

        return total;
    }

    public void exibiTodos(){
        for (Tributavel tributavel : tributaveis) {
            System.out.println(tributavel);
        }
    }
}
