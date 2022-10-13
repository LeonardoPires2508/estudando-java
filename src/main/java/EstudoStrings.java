import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
        // Strings sao cadeias de caracteres
        // "José" -> J = 0, o = 1, s = 2, é = 3
        String nome = "Pedro";

        if (nome == "Pedro") {
            System.out.println("São iguais");
        }

        System.out.println("Digite seu sobrenome: ");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();

        if (sobrenome.equals("Pereira")) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");

        }
        //sobrenome.equalsIgnoreCase("pereira"); //iginora maiuscula e minusculo

        // OUTROS METODOS
        String java = "Java";
        String ja = java.substring(0, 2); // começa do 0zero e para na posicao 2dois
        String va = java.substring(2); // corta a partir do 2 ate o final da string

        System.out.println(ja);
        System.out.println(va);

        String m1 ="Hello";
        String m2 = "World";
        String m3 = m1.concat(m2); // m1 + m2
        System.out.println(m3);

        System.out.println(java.length()); //quantos caracteres ela possui
        System.out.println(java.isEmpty()); // verifica se esta vazia
        System.out.println(java.toUpperCase()); // JAVA em CAIXA ALTA
        System.out.println(java.toLowerCase()); // java em caixa baixa

        //Exemplo

        System.out.println("Digite um nome: ");
        String seuNome = entrada.nextLine();

        if (seuNome.toUpperCase().equals("JOSÉ")) {
            System.out.println("SEU NOME É JOSÉ");
        }

        String data = "13/10/2022";
        String[] valores = data.split("/"); // ["13", "10", "2022"]
        System.out.println(valores[0]);

        String email = "ppires.leonardo@gmail.com";
        String[] valoresEmail = email.split("@"); // ["ppires.leonardo", "gmail.com"]
        System.out.println(valoresEmail[0]);
        System.out.println(Arrays.toString(valoresEmail));

        String nome2 = "José Souza";
        String[] nomeSeparado = nome2.split(" ");
        System.out.println(nomeSeparado[0]);

        String teste = "Amanha é outro dia";
        String[] teste2 = teste.split("");
        System.out.println(Arrays.toString(teste2));


    }
}
