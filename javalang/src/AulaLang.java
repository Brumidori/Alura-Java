public class AulaLang {

    //o package java.lang é o único pacote que não precisa ser importado
    //nele tem classes fundamentais que qualquer aplicação precisa, como a classe String e System
    //objetos da classe String são imutáveis e usamos uma sintaxe literal para criar (object literal)
    //qualquer método de alteração da classe String devolve uma nova String que representa a alteração
    //a classe String é uma CharSequence
    //se precisamos concatenar muitos String devemos usar a classe StringBuilder
    //vimos vários métodos da classe String como trim, charAt, contains, isEmpty, length, indexOf, replace

    public static void main(String[] args) {

        //Nesse pequeno exemplo já criamos vários objetos, só porque estamos concatenando algumas Strings.
        // Isso é nada bom pensando no desempenho e para resolver isso existe a classe StringBuilder
        // que ajuda na concatenação de Strings de forma mais eficiente.
        String texto = "Socorram";
        texto = texto.concat("-");
        texto = texto.concat("me");
        texto = texto.concat(", ");
        texto = texto.concat("subi ");
        texto = texto.concat("no ");
        texto = texto.concat("ônibus ");
        texto = texto.concat("em ");
        texto = texto.concat("Marrocos");
        System.out.println(texto);

        String text = "Socorram";
        text = text.concat("-");
        text = text.concat("me");
        text = text.concat(", ");
        text = text.concat("subi ");
        text = text.concat("no ");
        text = text.concat("ônibus ");
        text = text.concat("em ");
        text = text.concat("Marrocos");
        System.out.println(text);

        CharSequence cs = new StringBuilder("também é uma sequencia de caracteres");

        String nome = "ALURA";
        CharSequence chs = new StringBuilder("al");

        nome = nome.replace("AL", chs);

        System.out.println(nome);
    }
}

