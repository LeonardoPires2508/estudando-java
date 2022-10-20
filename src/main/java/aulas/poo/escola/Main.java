package aulas.poo.escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("kkkkkkkkkk", "leonardo@gmail.com", "111.222.333-04", 5.8);
        aluno.seApresentar();

        Professor professor = new Professor("Sayure", "ssayurevieira@gmail.com", "654.654.456-02", "Analise de Sistemas");
        professor.seApresentar();

        Pessoa pessoa1 = new Pessoa("Doidim dos Pão", "pe@.gom", "65654354");
        pessoa1.seApresentar();

        //Aluno é uma Pessoa
        Pessoa pessoa2 = new Aluno("Leonardo", "ppires.leonardo@gmail.com", "111.222.333-04", 9.8);
        //Professor é uma Pessoa
        Pessoa pessoa3 = new Professor("Sayure", "ssayurevieira@gmail.com", "654.654.456-02", "Analise de Sistemas");
        System.out.println("++++++++++++++++++++++++++++++");
        pessoa2.seApresentar();
        pessoa3.seApresentar();

        //Polimorfismo
        System.out.println(" ==============PESSOAS==============");
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(professor);
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        for (Pessoa pessoa : pessoas) {
            // o metodo seApresentar se comporta diferente dependendo da classe original
            pessoa.seApresentar();
        }
    }
}
