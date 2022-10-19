package aulas.poo;

import java.time.LocalDate;

//Encapsulamento -> escolhe quais atributos/metodos serão visiveis fora da classe.
    // public (padrão) -> visível para todos.
    //private -> os metodos/atributos sao visiveis apenas na classe.

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Sayure", "Vieira", LocalDate.of(1995, 5, 28), 1.59, 62.3);

        cliente1.crescre();

        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getNomeCompleto());

        cliente1.setAltura(1.8);
        System.out.println(cliente1.getAltura());



    }
}
