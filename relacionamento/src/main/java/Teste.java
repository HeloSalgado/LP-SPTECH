public class Teste {
    public static void main(String[] args) {
        Contato contato01 = new Contato("Helo", "(11) 982410672");
        Contato contato02 = new Contato("Giu", "(11) 904727443");
        Contato contato03 = new Contato("Ana", "(11) 974227353");

        Grupo grupo01 = new Grupo("Trabalho");
        Grupo grupo02 = new Grupo("Amigos");

        grupo01.adicionar(contato01);
        grupo01.adicionar(contato02);

        grupo02.adicionar(contato03);
        grupo02.adicionar(contato01);

        grupo01.exibirContatos();

        System.out.println(grupo01.exixtePorNome("Helo"));
        System.out.println(grupo01.buscarPeloNome("Helo"));
    }
}
