package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Giu", 10.0, 9.0);
        AlunoPos aluno2 = new AlunoPos("Paulo", 10.0, 9.0, 8.0);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);

        for (Aluno aluno : alunos) {
            System.out.println(aluno.calcularNotaFinal());
        }
    }
}
