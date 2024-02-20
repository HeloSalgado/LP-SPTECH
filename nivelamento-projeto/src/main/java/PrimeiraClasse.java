public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Hello World Java");

        // principais tipos de variáveis:
        String nome = "Heloisa";
        Double altura = 1.56;
        Boolean bloqueado = true;
        Integer numeroSorteio = 4;

        // Tipos Wrapper e tipos primitivos
        Integer numeroWrapper = 21;
        int numeroPrimitivo = 21;

        Boolean bloqueadoTipoWrapper = false;
        boolean bloqueadoTipoPrimitivo = false;

        System.out.println("Meu nome é "
                                + nome + "\nmeu número da sorte é "
                                + numeroSorteio + " e eu tenho "
                                + altura +" de altura");
    }
}
