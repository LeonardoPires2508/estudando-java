package aulas.poo;

public class Pet {
    //propriedades
    private String nome;
    private int idade;
    protected double peso;
    //nas subclasses o atributo/metodo private não é acessivel

    //construtor
    public Pet(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    //métodos (ações)
    public void fazerSom() {
        System.out.println("...");
    }
    public void comer(String comida) {
        System.out.println("Estou comendo " + comida);
    }
    public void dormir() {
        System.out.println(" zzzzzzzzz ");
    }
    public void brincar() {
        System.out.println("Estou brincando...");
    }

    //Getters e Setters - neste caso iremos utilizar apenas uma estrutura - peso, mas poderia modificar as 3 propriedades da classe.
    //GETTERS - fazer a leitura do peso
    public double getPeso() {
        return peso;
    }
    //Setters - possibilidade de alterar o peso
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
