package school.sptech.atleta;

public class Carteiro implements Corredor{
    private String nome;

    public Carteiro(String nome) {
        this.nome = nome;
    }

    @Override
    public void correr() {
        System.out.println("Correndo do cachorro...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
