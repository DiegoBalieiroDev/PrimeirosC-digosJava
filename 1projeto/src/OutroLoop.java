import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double notaFilme = 0;
        int totalDeNotas = 0;

        while (notaFilme != -1) {
            System.out.println("Qual a sua avaliação para o filme?");
            notaFilme = leitura.nextDouble();

            if (notaFilme != -1) {
            mediaAvaliacao += notaFilme;
            totalDeNotas++;
            }
        }

        System.out.println("Média de avaviações: " + mediaAvaliacao/totalDeNotas);
    }
}
