package exercicios;
//3) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50). Determine e imprima quantas vezes
//que V1 e V2 possuem valores idênticos nas mesmas posições.

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        //Entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros do array: ");
        int tamanho = entrada.nextInt();

        int[] v1 = new int[tamanho];
        int[] v2 = new int[tamanho];

        System.out.println("Digite os valores de v1: ");
        for (int i = 0; i < tamanho; i++) {
            v1[i] = entrada.nextInt();
        }

        System.out.println("Digite os valores de v2: ");
        for (int i = 0; i < tamanho; i++) {
            v2[i] = entrada.nextInt();
        }
        //Processamento de dados
        // v1 = [1, 2, 3] e v2 = [3, 2, 1] => 1 vez

        int encontros = 0; // quantas vezes sao iguais

        for (int i = 0; i < tamanho; i++) {
            if (v1[i] == v2[i]) {
                encontros++;
            }
        }
        // Saída
        System.out.println("Foram " + encontros + " encontro(s)");
    }

}
