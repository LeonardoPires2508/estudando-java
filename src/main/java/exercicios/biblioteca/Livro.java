package exercicios.biblioteca;

public class Livro {
    private String nome;
    private Autor autor; // informações do autor
    private double preco;

    public Livro(String nome, Autor autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public static void main(String[] args) {
        Autor jk = new Autor("Joane Kathleen Rowling", "info@jkr.com");
        Livro pedraFilosofal = new Livro("Harry Potter e a Pedra de Crack", jk, 12.99);

        System.out.println(pedraFilosofal.autor.getNome());
        System.out.println(pedraFilosofal.autor.getEmail());
        System.out.println("------------------------------");

        Livro camaraSecreta = jk.escreverLivro("Harry Potter e a Camara Secreta", 199.99);
        System.out.println(camaraSecreta.autor.getNome());

        System.out.println("------------------------------");
        Livro prisioneiroAzk = jk.escreverLivro("Harry Potter e o prisioneiro de Azkaban", 299.99);

        jk.setNome("Beterraba");
        System.out.println(pedraFilosofal.autor.getNome());
        System.out.println(camaraSecreta.autor.getNome());
        System.out.println(prisioneiroAzk.autor.getNome());
    }
}
