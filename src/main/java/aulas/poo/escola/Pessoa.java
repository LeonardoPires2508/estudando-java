package aulas.poo.escola;

public class Pessoa {
    //atributos
    private String nome;
    private String email;
    private String cpf;

    //Construtor
    public Pessoa(String nome, String email, String cpf){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }
    public void seApresentar(){
        System.out.println("Olá, me chamo " + this.nome);
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getCpf() {
        return cpf;
    }

    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
