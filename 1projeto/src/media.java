public class media {
    public static void main(String[] args) {
        double dinheiro = 50;
        int precoPastel = 10;

        int trocoPastel = (int) dinheiro - precoPastel;

        String mensagem = String.format("Ao pagar %d reais com seus %.2f reais acabou restando na sua carteira %d reais", precoPastel, dinheiro, trocoPastel);

        System.out.println(mensagem);

    }
}
