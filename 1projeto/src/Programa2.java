import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número que direi se é impar ou par");
        int numero = leitor.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        }

        else {
            System.out.println("O número " + numero + " é impar.");
        }

    }
}
