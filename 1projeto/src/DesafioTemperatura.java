public class DesafioTemperatura {
    public static void main(String[] args) {
        double celsius = 20;
        double temperatura = (celsius * 1.8) + 32;

        String mensagem = String.format("Agora está %.1f° Celsius no Brasil, porém podemos dizer também que está %.1f Fahrenheits", celsius, temperatura);
        System.out.println(mensagem);

        System.out.println(String.format(""));
    }
}
