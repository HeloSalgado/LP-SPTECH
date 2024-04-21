package school.sptech;

public class Aluno {
    private String nome;
    private Double notaAtividade;
    private Double notaAvaliacao;

    public Aluno(String nome, Double notaAtividade, Double notaAvaliacao) {
        this.nome = nome;
        this.notaAtividade = notaAtividade;
        this.notaAvaliacao = notaAvaliacao;
    }


    public Double calcularNotaFinal(){
        return notaAtividade * 0.4 + notaAvaliacao * 0.6 ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaAtividade() {
        return notaAtividade;
    }

    public void setNotaAtividade(Double notaAtividade) {
        this.notaAtividade = notaAtividade;
    }

    public Double getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(Double notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    @Override
    public String toString() {
        return String.format("""
                Nome: %s
                Nota atividade: %.2f
                Nota avaliação: %.2f
                Nota final: %.2f
                """, getNome(), getNotaAtividade(), getNotaAvaliacao(), calcularNotaFinal());
    }
}
