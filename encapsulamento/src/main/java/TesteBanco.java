public class TesteBanco {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria("Heloisa", "C001", 100);

        System.out.println("Nome: " + conta01.getNomeTitular());

        conta01.sacar(10.5);


        ContaBancaria conta02 = new ContaBancaria("Giuliana", "C002", 101);

        System.out.println("Nome: " + conta02.getNomeTitular());

        conta02.sacar(5.6);
    }
}
