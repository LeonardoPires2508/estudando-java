package exercicios.tamagotchi;

import java.util.ArrayList;

public class Bichinho {
    private String nome;
    private int idade;
    private double peso;
    private ArrayList<Comida> bucho;
    private boolean estaDormindo;

    public Bichinho(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.bucho = new ArrayList<>(); // buchim vazio
        this.estaDormindo = false; // acordado
    }

    public void comer(Comida comida) {
        if (this.estaDormindo) {
            System.out.println("ZZZzzzzzz");
        } else { //esta acordado
            if (this.bucho.contains(comida)) { // ele já comeu?
                System.out.println("Já comi " + comida.getNome() + " !");
            } else { // a comida é nova
                this.bucho.add(comida);
                this.peso += comida.getPeso();
            }
        }
    }
    public void dormir(int horas) {
        this.estaDormindo = false;
        double porcentagemPeso = this.peso * 0.01;
        double quilosPerdidos = horas * porcentagemPeso;
        this.peso -= quilosPerdidos;
    }

    public void acordar() {
        this.estaDormindo = false;
    }
    public static void main(String[] args) {
        Bichinho tamagotchi = new Bichinho("tamagotchi", 1, 30.8);
        Comida batata = new Comida("batata", 15.0);
        tamagotchi.comer(batata);
        tamagotchi.comer(batata);
        tamagotchi.dormir(2);
        tamagotchi.comer(batata);

        tamagotchi.acordar();
        Comida frango = new Comida("Frango", 30.5);
        tamagotchi.comer(frango);
        tamagotchi.comer(frango);
    }
}
