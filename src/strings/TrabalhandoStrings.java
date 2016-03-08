package strings;

public class TrabalhandoStrings {

    private static final String nomeDaEmpresa = "Info Telecom LTDA.";

    public static void main(String[] args) {
        /*Obs: As Strings são imutáveis.*/
        /*Declaração e atribuição e valores.*/
        String minhaString1 = new String();
        minhaString1 = "Java";
        String minhaString2 = "Java";
        String minhaString3 = new String("Java");
        String minhaSring4 = "";

        char[] meusChars = new char[]{'J', 'a', 'v', 'a'};
        String minhaString5 = new String(meusChars);

        /*Métodos úteis da classe String.*/
        String comentario = "Este comentário foi péssimo.";
        comentario = comentario.replace("péssimo", "ruim");
        System.out.println("Comentário: " + comentario);

        String comentario2 = "Gosto de comer frango com batata. Não gosto de batata frita.";
        comentario2 = comentario2.replace("batata", "polenta");
        System.out.println("Comentário: " + comentario2);

        String comentario3 = "    Olá Cara.      ";
        comentario3 = comentario3.trim();
        System.out.println("Comentário: " + comentario3);

        String comentario4 = "Bom Java pra você.";
        Boolean contem = comentario4.contains("Java");
        System.out.println("Comentário: " + contem);

        String comentario5 = "Seja programador.";
        Integer quantidade = comentario5.length();
        System.out.println("Comentário: " + quantidade);

        String comentario6 = "vai ficar tudo em maíusculo.";
        System.out.println("Comentário: " + comentario6.toUpperCase());

        String comentario7 = "VAI FICAR TUDO EM MINUSCULO.";
        System.out.println("Comentário: " + comentario7.toLowerCase());

        String comentario8 = "Universidade";
        comentario8 = comentario8.substring(7);
        System.out.println("Comentário: " + comentario8);

        String comentario9 = "Vish";
        char letra = comentario9.charAt(0);
        System.out.println("Letra: " + letra);

        String comentario10 = "vai ficar";
        System.out.println("Comentário: " + comentario10.concat(" tudo bem."));

        String comentario11 = "Mentira bicho.";
        Integer indice = comentario10.indexOf("Me");
        System.out.println("Índice: " + indice);

        String comentario12 = "Development";
        Boolean comecaCom = comentario12.startsWith("De");
        System.out.println("Comentário: " + comecaCom);

        String comentario13 = "Development";
        Boolean terminaCom = comentario13.endsWith("De");
        System.out.println("Comentário: " + terminaCom);

        String a1 = "ProLinki";
        String a2 = "ZeroCool";
        Boolean iguais = a1.equals(a2);
        System.out.println("Iguais: " + iguais);

        String s1 = "Meu nome era ";
        String s2 = "Michel";
        String s3 = s1;
        s1.replace("era", "é");
        String s4 = s3.replace("era", "sempre foi ");
        s3 = s4 + s2;
        System.out.println(s3);
    }
}
