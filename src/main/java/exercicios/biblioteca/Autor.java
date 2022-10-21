package exercicios.biblioteca;

public class Autor {
    private String nome;
    private String email;
    //construtor
    public Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public Livro escreverLivro(String nome, double preco) {
        Livro novoLivro = new Livro(nome, this, 25.99); // this é objeto de autor
        return novoLivro;
    }
    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
