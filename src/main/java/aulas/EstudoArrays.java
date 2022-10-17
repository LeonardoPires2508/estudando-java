package aulas;

import java.util.Scanner;

public class EstudoArrays {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros.length); // tamanho do array
        numeros[3] = 1000;
        System.out.println(numeros[3]);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("A posição " + i + " com valor de " + numeros[i]);
        }

        int[] numeros2 = new int[50]; //cria um array com 50 posicoes
        numeros2[0] = 29;
        numeros2[34] = -12; //...
        //numeros2[50] = 2; index maior que o array.

        double[] notas = new double[5];
        String[] nomes = {"Leonardo, Leandro, Zeze, di Camargo, Luciano"};
        String[] sobrenomes = new String[10];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int quantidade = entrada.nextInt();
        boolean[] valores = new boolean[quantidade];

        //Exemplo
        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt();

        double[] notasProva = new double[totalNotas];

        for (int i = 0; i < totalNotas; i++) {
            System.out.println("Digite o valor da nota ");
            notasProva[i] = entrada.nextDouble();
        }
        double soma = 0.0;
        for (double nota : notasProva) {
            soma += nota;
        }
        double media = soma / notasProva.length;
        // Condição ternaria
        String mensagem = (media < 7) ? "Voce esta reprovado" : "Voce esta aprovado";
        System.out.println(mensagem);
    }


}
