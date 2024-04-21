public class ContaBancaria {
    private String nomeTitular;
    private Double saldo;
    private String codigoConta;
    private Integer agencia;

    // Construtor:
    // - Sempre público
    // - Mesmo nome da classe
    // - Não tem retorno


    public ContaBancaria(String nomeTitular, String codigoConta, Integer agencia) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
        this.codigoConta = codigoConta;
        this.agencia = agencia;
    }

    void sacar(Double valorSaque){
        if (valorSaque > saldo || valorSaque <= 0){
            System.out.println("Não é possível sacar");
        } else {
            saldo -= valorSaque;
        }
    }

    // get = retornar um valor
    // set = alterar um valor
    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular(){
        return nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(String codigoConta) {
        this.codigoConta = codigoConta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }
}
