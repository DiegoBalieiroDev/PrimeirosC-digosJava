import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Você gostaria de saber a tabuada de qual número?");
        int numero = leitor.nextInt();

        System.out.println("Até quanto?");
        int valorMaximo = leitor.nextInt();

    for (int i = 1; i <= valorMaximo; i++) {
        int resultado = numero * i;


        System.out.println(numero + " x " + i + " = " + resultado);
    }
    }
}
