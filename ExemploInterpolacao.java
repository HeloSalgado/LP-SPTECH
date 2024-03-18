package school.sptech;

public class ExemploInterpolacao {
    public static void main(String[] args) {
        String nome = "Bob da Silva";
        Integer idade = 42;
        Double altura = 1.63;


        // Na interpolação utilizamos:
        // Para String %s
        // Para Inteiros %d
        // Para Double %.2f (sendo 2 a quantidade de casas decimais 1,2,3...

        String faseFormatada = String.format("""
                Meu nome é: %s
                Minha idade é: %d
                Minha altura é: %.2f
                """, nome, idade, altura);

        System.out.println(faseFormatada);

        // Segunda maneira
        String fraseFormatadaSegundaTentativa = """
                Meu nome é: %s
                Minha idade é: %d
                Minha altura é: %.2f
                """.formatted(nome, idade,altura);

        Boolean petVacinado = false;
//        String frasePetVacinado = petVacinado ? "Sim" : "Não";

//        if(petVacinado){
//            frasePetVacinado = "Sim";
//        } else {
//            frasePetVacinado = "Não";
//        }

        System.out.println("""
                Meu nome é: %s
                O nome do meu pet é: %s
                Minha idade é: %d
                Minha altura é: %.2f
                Pet Vacinado: %s
                """.formatted(nome, "Caramelo", idade,altura, (petVacinado ? "Sim" : "Não"))
        );

        // Se a idade for menor que 15, o salário será de 1000
        // Se for maior ou igual a 15, o salário será de 1412
        Integer idadeParaPagamento = 15;
        Double valorSalario = idadeParaPagamento >= 15 ? 1412.0 : 1000.0;
        Boolean isMaiorDeIdade = idadeParaPagamento >= 18;

        System.out.println(valorSalario);

    }
}
