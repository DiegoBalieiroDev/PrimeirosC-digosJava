import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Qual a sua avaliação para o filme?");
        double avaliacaoFilme = leitura.nextDouble();

        String mensagem = String.format("O seu filme favorito é %s que foi lançado em %d e sua avaliação para o filme é nota: %.2f", filme, anoDeLancamento, avaliacaoFilme);

        System.out.println(mensagem);
    }
}
