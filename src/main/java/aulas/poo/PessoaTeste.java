package aulas.poo;

public class PessoaTeste {
    public static void main(String[] args) {
        // new -> constrói um NOVO objeto de Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Leonardo";
        pessoa1.sobrenome = "Pires";
        pessoa1.idade = 40;
        pessoa1.peso = 104.5;
        pessoa1.altura = 1.73;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa("Theo", "Pires", 2, .95, 14.5);

        Pessoa recemNascido = new Pessoa("Enzo", "Javavinha");

        System.out.println(recemNascido.altura);
        recemNascido.idade++;
        recemNascido.dizOla();

        pessoa4.dizOla();
        pessoa4.mostrarImc();
        double imcPessoa4 = pessoa4.calculaImc();
        System.out.println(imcPessoa4);
    }
}
