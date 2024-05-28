package school.sptech.atleta;

public interface Corredor {
    void correr();

    default void teste() {
        System.out.println("Testando");
    }
}
