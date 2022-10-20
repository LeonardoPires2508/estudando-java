package aulas.poo.zoo;
//Ma interface voce define um conjunto de metodos (sem corpo)
//é a classe que "herda" deve implementar estes metodos.

public interface Animal {
    void dormir();
    void fazerSom();
    void comer(String comida);
}

class Gato implements Animal {
    @Override
    public void dormir(){
        System.out.println("zzzzzzz miau");
    }
    @Override
    public void fazerSom(){
        System.out.println("Miau");
    }
    @Override
    public void comer(String comida){
        if(comida.equals("Peixe")) {
            System.out.println("Hummmmmm que peixe gostoso");
        } else {
            System.out.println("Se não for peixe eu não quero. kiiii");
        }
    }
}
class Galinha implements Animal {
    @Override
    public void dormir() {
        System.out.println("zzzzz có có");
    }

    @Override
    public void fazerSom() {
        System.out.println("Có có pó pó");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Hummmm có pó " + comida);
    }

    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        galinha.fazerSom();
        galinha.dormir();
        galinha.comer("Milho");

        gato.fazerSom();
        gato.dormir();
        gato.comer("espetim");

        //Interface nao consigo criar um objeto
        //Animal novoAnimal = new Animal(); // nao consigo criar pois é Interface

        Animal animalGalinha = new Galinha();
        Animal animalGatinho = new  Gato();
        System.out.println("=======POLIMORFISMO=========");
        animalGalinha.fazerSom();
        animalGatinho.fazerSom();
    }

}
