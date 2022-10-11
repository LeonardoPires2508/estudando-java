import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();
        //System.out.println(nome);

        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();
        //System.out.println(idade);

        System.out.println("Qual a sua altura em metros?");//como o scanner identifica o local, pode-se digitar a altura com virgula
        double altura = entrada.nextDouble();


        System.out.println("Olá meu nome é " + nome + ", tenho " + idade + " anos e altura de " + altura + " metros");

        System.out.println("Qual o seu peso? (kg)");
        double peso = entrada.nextDouble();

        // CALCULO DE IMC
        double imc = peso / Math.pow(altura, 2);
        System.out.println("Este é o seu IMC = " + imc);
        System.out.printf("Seu IMC é igual a: %.2f\n", imc); //insere o resultado com duas casas decimais.
        System.out.printf("Olá, meu nome é %s e tenho %d anos!\n" , nome, idade);

        if (imc < 17){
            System.out.println("Muito abaixo do peso");
        } else if (imc >= 17 && imc <= 18.49) {
            System.out.println("Abaixo do peso");
        } else if (imc >=18.5 && imc <=24.99) {
            System.out.println("Peso normal");
        } else if (imc >=25 &&  imc <= 29.99) {
            System.out.println("Acima do peso");
        } else if (imc >=30 && imc <= 34.99) {
            System.out.println("Obesidade Grau 1");
        } else if (imc >=35 && imc <=39.99) {
            System.out.println("Obesidade Grau 2 - (Severa)");
        } else {
            System.out.println("Obesidade Grau 3 - (Morbida");
        }

        //Switch-Case
        System.out.println("Selecione uma dieta (1 a 3");
        System.out.println("1 - Água");
        System.out.println("2- Fruta");
        System.out.println("3 - Batata");

        int dieta = entrada.nextInt();

        switch (dieta) {
            case 1:
                System.out.println("Voce escolheu a dieta da água");
                break; //impede de testar as condicoes abaixo
            case 2:
                System.out.println("Voce escolheu a dieta da Fruta");
                break;
            case 3:
                System.out.println("Voce escolheu a dieta da batata");
                break;
            default:
                System.out.println("esta dieta não existe");//mostra caso o usuario digite fora das opcoes

        }

        System.out.println("Voce tem quantos alimentos preferidos?");
        int totalAlimentos = entrada.nextInt();

        for (int i =0; i < totalAlimentos; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i < totalAlimentos) {
            System.out.println(i);
            i++;
        }
        System.out.println(i);
    }
}
