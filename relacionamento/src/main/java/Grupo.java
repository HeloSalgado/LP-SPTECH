import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nomeGrupo;
    private List<Contato> contatos;

    public Grupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
        contatos = new ArrayList<>();
    }

    public void adicionar(Contato c){
        contatos.add(c);
    }
    public void remover(Contato c){
        contatos.remove(c);
    }

    public void exibirContatos(){
        System.out.println("Contatos:\n");

        for (Contato contatoDaVez : contatos) {
            System.out.println(contatoDaVez);
        }
    }

    public boolean exixtePorNome(String nomeBusca){
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nomeBusca)){
                return true;
            }
        }
        return false;
    }

    public Contato buscarPeloNome(String nomeBusca){
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nomeBusca)){
                return contato;
            }
        }
        return null;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return String.format("""
                Nome do grupo: %s
                Lista de contatos: %s
                """, getNomeGrupo(), contatos);
    }
}
