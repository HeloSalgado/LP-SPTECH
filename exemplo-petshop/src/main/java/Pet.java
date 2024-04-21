public class Pet {
    private String nome;
    private Integer qtdBanhosTomados;
    private Double valorGastoEmPetShop;

    public Pet(String nome) {
        this.nome = nome;
        this.qtdBanhosTomados = 0;
        this.valorGastoEmPetShop = 0.0;
    }

    public String toString(){
        return String.format("""
                ---------- Relatório Pet -----------
                * Nome: %s                          
                * Banhos tomados: %d 
                * Total gasto em pet shops: %.2f           
                ------------------------------------
                """, getNome(), getQtdBanhosTomados(), getValorGastoEmPetShop());
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdBanhosTomados() {
        return qtdBanhosTomados;
    }

    public void setQtdBanhosTomados(Integer qtdBanhosTomados) {
        this.qtdBanhosTomados = qtdBanhosTomados;
    }

    public Double getValorGastoEmPetShop() {
        return valorGastoEmPetShop;
    }

    public void setValorGastoEmPetShop(Double valorGastoEmPetShop) {
        this.valorGastoEmPetShop = valorGastoEmPetShop;
    }
}
