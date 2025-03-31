import java.util.Scanner;

public class numeropositivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vou adivinha se o número é positivo ou negativo!");
        System.out.println("Digite um número:");
        double numero = leitor.nextDouble();

        if (numero > 0) {
            System.out.println("O seu número é positivo!");
        }

        else if (numero == 0) {
            System.out.println("O número é neutro");
        }

        else {
            System.out.println("O número é negativo!");
        }
    }
}
