package aulas.poo.escola;

public class Aluno extends Pessoa{
    private double media;

    public Aluno(String nome, String email, String cpf, double media){
        super(nome, email, cpf);
        this.media = media;
    }

    @Override
    public void seApresentar(){ // na sobrescrita mudamos o comportamento (apenas)
        super.seApresentar(); // super = Pessoa
        System.out.println(" Eu sou um aluno com média igual a " + this.media);
    }
    public double getMedia() {
        return this.media;
    }

    public static void main(String[] args) {

    }
}
