public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";


        if (anoLancamento >= 2022) {
            System.out.println("É um filme lançamento");
        }
        else {
            System.out.println("Não é um filme lançamento");
        }

        if (incluidoNoPlano || tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado");
        }
        else {
            System.out.println("Voce deve alugar ou comprar o filme.");
        }



    }
}
