package aulas.poo;

public class PetCachorro extends Pet {
    //propriedades
    private String comidaFavorita;
    private String raca;

    //construtor
    public PetCachorro(String nome, int idade, double peso, String comidaFavorita, String raca) {
        //representa a classe Pet
        super(nome, idade, peso); // chamando o construtor da classe pai/superclasse
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }

    @Override // vamos sobrescrever a ação de fazer som
    public void fazerSom() {
        System.out.println("Au au au au");
    }
    @Override
    public void brincar(){
        this.fazerSom(); // chama o fazerSom do cachorro, foi sobrescrito
        super.brincar(); //está chamando o brincar( ) de Pet
        this.dormir(); // chama o dormir do PET, pois não foi sobrescrito
    }
    @Override
    public void comer(String comida) {
        //verifica se é a comida favorita
        if (comida.equals(this.comidaFavorita)) { //a comida do paramentro é igual a comida favorita??
            super.comer(comida);
            this.peso += 0.2;
            //this.setPeso(this.getPeso() + 0.2); se peso estivesse private
        } else {
            System.out.println("Não quero comer " + comida);
        }
    }
    public void correAtrasMoto() { //método especifico do cachorro
        this.fazerSom();
        System.out.println("Correndo atrás do Motoboy");
    }


    public static void main(String[] args) {
        // testar a herança
        Pet pet1 = new Pet("RecoReco", 1, 5.3);
        pet1.dormir();
        pet1.comer("coxinha");

        System.out.println(" ============================= ");

        PetCachorro cachorro = new PetCachorro("Bolinha",2,9.2, "paodequeijo", "peduro");
        cachorro.dormir();
        cachorro.fazerSom();
        cachorro.comer("tapioca");
        cachorro.setPeso(10.4);
        cachorro.brincar();
        cachorro.comer("sushi");
        cachorro.correAtrasMoto();

    }
}
