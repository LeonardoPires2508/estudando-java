package aulas;

public class Calculadora {
    public static double PI = 3.14;
    //final - impede a alteracao do valor de PI

    //Medodo Estatico
    //Nao pertence ao objeto, mas sim a classe
    public static double soma(double a, double b) {
        return a + b;
    }
    public static double subtracao(double a, double b) {
        return a - b;
    }
    public static double multiplicacao(double a, double b) {
        return a * b;
    }
    public static double divisao(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        double resultadoSoma = Calculadora.soma(1, 2 );
        double resultadoSubtracao = Calculadora.subtracao(1, 2 );
        double resultadoMultiplicacao = Calculadora.multiplicacao(1, 2 );
        double resultadoDivisao = Calculadora.divisao(1, 2 );
        System.out.println(resultadoSoma);
        System.out.println(resultadoSubtracao);
        System.out.println(resultadoMultiplicacao);
        System.out.println(resultadoDivisao);
        System.out.println("===============");
        System.out.println(Calculadora.PI);
        System.out.println(Math.pow(2,3));
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(169));
        System.out.println(Math.cbrt(8));

    }
}
