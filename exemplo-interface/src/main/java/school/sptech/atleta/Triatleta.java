package school.sptech.atleta;

public class Triatleta implements Corredor, Nadador{
    private String nome;

    public Triatleta(String nome) {
        this.nome = nome;
    }

    @Override
    public void correr() {
        System.out.println("Correndo...");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
