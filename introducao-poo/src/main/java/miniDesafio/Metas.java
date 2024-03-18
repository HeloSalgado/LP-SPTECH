package miniDesafio;

import java.util.concurrent.ThreadLocalRandom;

public class Metas {
    String nomeMeta;
    Double cofre;
    Boolean cofreQuebrado = false;
    Double valorAleatorio;

    void depositar(Double valorDeposito){
        if (cofreQuebrado){
            System.out.println("Cofre já está quebrado");
        } else {
            cofre += valorDeposito;
            System.out.println("Depôsito efetuado com sucesso");
        }
    }

    void agitar(){
         valorAleatorio = ThreadLocalRandom.current().nextDouble(cofre);
    }

    void quebrar(){
        cofreQuebrado = true;
        if (cofreQuebrado){
            cofre = 0.0;
            System.out.println("\nCofre quebrado com sucesso!");
        } else {
            System.out.println("\nCofre já foi quebrado");
        }
    }
}
