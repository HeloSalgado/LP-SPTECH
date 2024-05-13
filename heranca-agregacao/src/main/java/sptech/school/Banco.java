package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nomeBanco;
    private List<ContaBancaria> contas;

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        contas = new ArrayList<>();
    }

    public void cadastrarConta(ContaBancaria conta){
        contas.add(conta);
    }

    public void exibirContas(){
        for (ContaBancaria contaDavez : contas) {
            System.out.println(contaDavez);
        }
    }

    public void exibirSomenteContaPoupanca(){
        for (ContaBancaria contaDavez : contas) {
            if (contaDavez instanceof ContaPoupanca){
                System.out.println(contaDavez);
            }
        }
    }
}
