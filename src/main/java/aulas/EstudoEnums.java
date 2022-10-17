package aulas;// Enums são estruturas com constantes definidas
// Dias da semana, meses do ano, turnos do dia, estacoes
// Niveis (junior, pleno, senior), feriados nacionais, naipes

public class EstudoEnums {
    public static void main(String[] args) {
        enum DiaDaSemana {
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }

        DiaDaSemana hoje = DiaDaSemana.QUINTA;
        System.out.println(hoje);

        enum NivelDev { Junior, Pleno, Senior }
        NivelDev nivel = NivelDev.Pleno;

        switch (nivel) {
            case Junior:
                System.out.println("Seu nivel é Junior");
                break;
            case Pleno:
                System.out.println("Seu nivel é Pleno");
                break;
            case Senior:
                System.out.println("Seu nivel é Senior");
                break;
        }
        // VERSAO ENHANCED
        switch (nivel) {
            case Junior -> {
                System.out.println("Seu nivel é Junior");
            }
            case Pleno -> {
                System.out.println("Seu nivel é Pleno");
            }
            case Senior -> {
                System.out.println("Seu nivel é Senior");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }
    }
}
