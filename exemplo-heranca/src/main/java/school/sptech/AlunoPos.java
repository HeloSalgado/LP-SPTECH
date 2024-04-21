package school.sptech;

public class AlunoPos extends Aluno{
    private Double notaTcc;

    public AlunoPos(String nome, Double notaAtividade, Double notaAvaliacao, Double notaTcc) {
        super(nome, notaAtividade, notaAvaliacao);
        this.notaTcc = notaTcc;
    }

    @Override
    public Double calcularNotaFinal(){
        return getNotaAtividade() * 0.2 + getNotaAvaliacao() * 0.2 + notaTcc * 0.6;
    }

    public Double getNotaTcc() {
        return notaTcc;
    }

    public void setNotaTcc(Double notaTcc) {
        this.notaTcc = notaTcc;
    }

    @Override
    public String toString() {
        return String.format("""
                Nota TCC: %.2f
                """, getNotaTcc()) + super.toString();
    }
}
