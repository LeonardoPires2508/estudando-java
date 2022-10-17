package aulas.poo;

public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ehFlex;
    int qtdPortas;
    double combustivelAtual;
    double consumo;
    boolean estaligado;

    public Carro(String modelo, String marca, int ano, boolean ehFlex, int qtdPortas, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ehFlex = ehFlex;
        this.qtdPortas = qtdPortas;
        this.combustivelAtual = 15.0; // todos os carros começam com 30 litros
        this.consumo = consumo;
        this.estaligado = false; // todos os carros começam desligados
    }

    //Abastecer
    void abastecer(double total) {
        this.combustivelAtual += total;
    }

    //Ligar
    void ligar() {
        this.estaligado = true;
    }

    //Desligar
    void desligar() {
        this.estaligado = false;
    }

    //Viajar
    boolean viajar(String local, double distancia) { // "local" é um parametro do método
        // tenta viajar, se conseguir true, senão false
        if (!this.estaligado) {
            this.ligar();
        }
        double totalLitros = distancia / this.consumo; // quantos litros serão nescessários para viajar

        if (this.combustivelAtual - totalLitros > 0) {
            this.combustivelAtual -= totalLitros;
            System.out.println("A viagem para " + local + " aconteceu e sobrou " + this.combustivelAtual + " litros de combustivel");
            return true; // a viagem aconteceu
        } else {
            System.out.println("A viagem não foi possivel");
            return false; // a viagem não será possivel
        }

    }

    // A main serve para testar a classe
    public static void main(String[] args) {
        Carro carro1 = new Carro("HB20", "Hyundai", 2020, true, 4, 15.6);
        Carro carro2 = new Carro("Corolla", "Toyota", 2015, true, 4, 10.2);

        System.out.println(carro1.combustivelAtual);
        carro1.abastecer(6);
        System.out.println(carro1.combustivelAtual);

        System.out.println(carro1.estaligado);
        carro1.ligar();
        System.out.println(carro1.estaligado);

        System.out.println(carro1.ano);
        carro1.ano = 2022;
        System.out.println(carro1.ano);

        boolean viajou = carro1.viajar("Ibiapina", 320);
        System.out.println(viajou);


    }
}

