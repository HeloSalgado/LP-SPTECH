public class BilheteUnico {
    //Atributo = Características
    String nomeTitular;
    Double saldo;
    String codigo;

    //Métodos = Comportamentos
    void carregar(Double valorRecarga){
        if (valorRecarga <= 0 ){
            System.out.println("Valor inválido");
        } else {
            saldo += valorRecarga;
            System.out.println("Recarga efetuada");
        }
    }
}
