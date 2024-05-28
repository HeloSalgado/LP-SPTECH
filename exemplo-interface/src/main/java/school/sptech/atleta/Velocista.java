package school.sptech.atleta;

public class Velocista implements Corredor {
    private String nome;

    public Velocista(String nome) {
        this.nome = nome;
    }

    @Override
    public void correr() {
        System.out.println("Correndo...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
