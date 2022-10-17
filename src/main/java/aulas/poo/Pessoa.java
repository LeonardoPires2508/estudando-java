package aulas.poo;

public class Pessoa {
    //Propriedades/atributos de uma Pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    //MÉTODO CONSTRUTOR

    //Construtor da classe
    Pessoa() { // Gera apenas a pessoa descrita
        // THIS -> Representa o Objeto
        this.nome = "Leonardo";
        this.sobrenome ="Pires";
        this.idade = 40;
        this.peso = 104.5;
        this.altura = 1.73;
    }

    Pessoa(String nome, String sobrenome, int idade, double altura, double peso) { // Gera qualquer pessoa
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.altura = 0.5;
        this.peso = 3.5;
    }

    // Ações de uma Pessoa (métodos)
    // <tipo_retorno> nomeDoMetodo (PARAMETROS) {   }
    void dizOla(){
        System.out.println("Olá, tudo bem? Meu nome é " + this.nome);
    }

    void mostrarImc(){
        double imc =  this.peso / (this.altura * this.altura);
        System.out.println("Meu imc é: " + imc);
    }

    double calculaImc(){ //DEVE RETORNAR UM VALOR
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }
}
