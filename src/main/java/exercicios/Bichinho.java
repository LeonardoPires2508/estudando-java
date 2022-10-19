package exercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Bichinho {
    private String nome;
    private int idade;
    private double peso;
    private ArrayList<Comida> bucho = new ArrayList<Comida>();
    private boolean estaDormindo;
    private LocalDateTime horaDataCriacao;

    //CONSTRUTORES

    public Bichinho(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.estaDormindo = false;
        this.horaDataCriacao = LocalDateTime.now();
    }


}
