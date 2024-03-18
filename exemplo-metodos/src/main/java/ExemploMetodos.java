import java.util.ArrayList;
import java.util.List;

public class ExemploMetodos {
    public static void main(String[] args) {
        Utilitaria mensagem = new Utilitaria();


        List<String> frutas = new ArrayList<>();

        frutas.add("Laranja");
        frutas.add("Carambola");
        frutas.add("Goiaba");
        frutas.add("Kiwi");

        System.out.println("Frutas: ");
        mensagem.exibirLista(frutas);

        String frutaPesquisa = "Goiaba";

        Boolean existeFruta = mensagem.buscar(frutas, frutaPesquisa);

        mensagem.exibirMensagemDaLista(existeFruta, "A fruta");

        System.out.println();

        List<String> nomes = new ArrayList<>();

        nomes.add("Heloisa");
        nomes.add("Maria");
        nomes.add("Luan");
        nomes.add("Jean");

        System.out.println("Nomes: ");
        mensagem.exibirLista(nomes);

        String nomePesquisa = "Maria";
        Boolean existeNome = mensagem.buscar(nomes, nomePesquisa);

        mensagem.exibirMensagemDaLista(existeNome, "O nome");


    }
}
