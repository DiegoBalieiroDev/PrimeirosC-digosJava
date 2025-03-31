import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tentativas = 0;
        int resultado = new Random().nextInt(100);


        System.out.println("O resultado é "+ resultado);
        System.out.println("Bem vindo");


        while (tentativas < 5) {
            System.out.println("Escolha um número de 1 a 100:");
            int chute = leitor.nextInt();
            tentativas++;
            String palavraTentativa = tentativas > 1?  "tentativas" : "tentativa";


            if (chute == resultado) {
                System.out.println("Parabéns você acertou o número em " + tentativas + palavraTentativa);
                break; // Interrompe
            } else if (chute < resultado) {
                System.out.println("O chute é menor que o número escolhido!");
            }
            else {
                System.out.println("O chute é maior que o número escolhido!");
            }

            if (tentativas == 5 && chute != resultado)
                System.out.println("Infelimente voce não conseguiu acertar o número, tente novamente!");
        }
    }
}
