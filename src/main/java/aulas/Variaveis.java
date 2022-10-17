package aulas;

public class variaveis {
    public static void main(String[] args) {
        System.out.println("Hello World!"); //equivale ao console.log

        //aulas.variaveis do JAVA
        //fortemente tipado e estaticamente tipado
        int idade = 20; // inteiro (até 2 bilhoes)
        double salario = 4500.99; //dupla precisao
        float nota = 7.5f; // sufixo para float
        long populacaoTerra = 7_900_000_000l; //para numero muito grandes bilhoes e bilhoes
        boolean tarefaConcluida = false;
        int i = 1, j = 0, k = 1000; // multiplas aulas.variaveis
        String nomecompleto = "Leonardo Pereira Pires"; //sempre aspas duplas

        int teste = 10;
        teste = 9; // reatribuição de aulas.variaveis

        final int teste2 = 200; // impossivel mudar o valor
        // teste2 = 1000

        // OPERADORES

        int a = 10;
        int b = 5;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b ;

        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da soma é: " + subtracao);
        System.out.println("O resultado da soma é: " + multiplicacao);
        System.out.println("O resultado da soma é: " + divisao);

        int sete = 7;
        int dois = 2;
        double dois2 = 2.0;
        double resultado = sete / dois; //3.0
        System.out.println(resultado);
        double resultado2 = sete / dois2; //3.5
        System.out.println(resultado2);

        //Math
        double x = Math.sqrt(144); //12
        System.out.println(x);
        double y = Math.pow(5, 2); //25
        System.out.println(y);
        System.out.println(Math.PI);

        //casting
        int pi2 = (int) Math.PI; //casting - transforma o numero neste caso em inteiro ( so o 3)
        System.out.println(pi2);

        double resultado3 = sete / (double) dois;
        System.out.println(resultado3);

        //Operadores 2
        int valor = 5;
        valor++; //incremento
        valor--; //decremento
        valor += 10;

        // Operadores Relacionais
        boolean teste1 = 5 > 1; //true
        boolean teste3 = 5 < 1; //false
        boolean teste4 = 5 == 5; //true
        boolean teste5 = 5 != 1; //true
        boolean teste6 = 6 >= 6; //true
        boolean teste7 = 5 <= 9; //true

        //Operadores Logicos 2
        boolean teste8 = true && false; //false
        boolean teste9 = true || false; //true
        boolean teste10 = (5 > 10) && (10 < 5); //false
        boolean teste11 = (10 >= 0) || (1 < 5); //true
        boolean teste12 = (5 > 1); //true
        boolean teste13 = !teste12; // false


    }
}
