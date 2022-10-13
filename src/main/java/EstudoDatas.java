import java.time.LocalDate;

public class EstudoDatas {
    public static void main(String[] args) {
        // dia - mes - ano
        //LocalDate armazena qualquer data (dia, mes, ano)
        LocalDate hoje = LocalDate.now(); // pega a data atual
        System.out.println(hoje);

        LocalDate natal = LocalDate.of(2022, 12, 25);
        System.out.println(natal);

        System.out.println(hoje.isAfter(natal)); //verifica se a data de hoje é apos o natal
        System.out.println(hoje.isBefore(natal)); // verifica se a data de hoje é antes do natal
        int ano = hoje.getYear();
        int mes = hoje.getMonthValue();
        int dia = hoje.getDayOfMonth();

        int diasParaNatal = natal.getDayOfYear() - hoje.getDayOfYear();

        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);

        System.out.println("Faltam " + diasParaNatal + " dias para o Natal!"); // 73
        System.out.println(hoje.getDayOfYear() - natal.getDayOfYear()); // -73

    }
}
