import java.util.List;

public class Utilitaria {
    void exibirMensagem(){
        System.out.println("Olá, mundo!");
    }

    Integer Somar(Integer num1, Integer num2){
        return num1 + num2;
    }

    void exibirLista(List<String> lista){
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }

    Boolean buscar(List<String> lista, String pesquisa){
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).equalsIgnoreCase(pesquisa)){
                return true;
            }
        }
        return false;
    }

    void exibirMensagemDaLista(Boolean existe, String tipo){
        if (existe){
            System.out.println(tipo + " existe na lista");
        } else {
            System.out.println(tipo + " não existe na lista");
        }
    }
}
