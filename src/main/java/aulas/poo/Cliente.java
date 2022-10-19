package aulas.poo;

import java.time.LocalDate;

public class Cliente {
    public int id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    //Metodo Construtor
    public Cliente(int id, String nome, String sobrenome, LocalDate dataNascimento, double altura, double peso) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public void crescre(){
        this.altura += 0.2;
    }

    // Getter --> possibilitam a leitura dos atributos
                // customizar a leitura dos valores


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNomeCompleto(){
        return this.nome + " " + this.sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    //Setter --> serve para alterar os valores

    public void setAltura(double altura) {
        if (altura < 2.51) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida. Atributo não modificado");
        }
    }

    public void setPeso(double novoPeso) {
        this.peso = novoPeso;
    }
}
