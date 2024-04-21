public class PetShop {
    private String nome;
    private Integer qtdBanhosRealizados;
    private Double valorBanho;
    private Double totalGanho;

    public PetShop(String nome, Double valorBanho) {
        this.nome = nome;
        this.qtdBanhosRealizados = 0;
        this.valorBanho = valorBanho;
        this.totalGanho = 0.0;
    }

    public String toString(){
        return String.format("""
                ---------- PetShop %s -----------                      
                * Banhos realizados: %d 
                * Valor banho: %.2f
                * Total ganho: %.2f           
                ---------------------------------------
                """, getNome(), getQtdBanhosRealizados(), getValorBanho(), getTotalGanho());
    }

    public void darBanho(Pet pet){
        darBanho(pet, 0.0);
    }

    public void darBanho(Pet pet, Double desconto){
        System.out.println("Dando banho no pet " + pet.getNome());
        pet.setQtdBanhosTomados(pet.getQtdBanhosTomados() + 1);

        Double valorComDesconto = this.valorBanho - (this.valorBanho * desconto);

        pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + valorComDesconto);
        this.qtdBanhosRealizados++;
        this.totalGanho += valorComDesconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdBanhosRealizados() {
        return qtdBanhosRealizados;
    }

    public void setQtdBanhosRealizados(Integer qtdBanhosRealizados) {
        this.qtdBanhosRealizados = qtdBanhosRealizados;
    }

    public Double getValorBanho() {
        return valorBanho;
    }

    public void setValorBanho(Double valorBanho) {
        this.valorBanho = valorBanho;
    }

    public Double getTotalGanho() {
        return valorBanho * qtdBanhosRealizados;
    }

    public void setTotalGanho(Double totalGanho) {
        this.totalGanho = totalGanho;
    }
}
