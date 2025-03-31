import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "Harry Potter";
        double saldoFinal = 1000.00;
        int numero = 0;

        System.out.println("************************************************************");
        System.out.println("Nome:             " + nome);
        System.out.println("Tipo de conta:    Corrente");
        System.out.println("Saldo inicial:    R$ " + saldoFinal);
        System.out.println("************************************************************");

        String menu = """
                Operações
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        while (numero != 4) {

            System.out.println(menu);

            System.out.println("Digite a opção desejada:");
            numero = leitor.nextInt();


            if (numero == 1) {
                String mensagemSaldo = String.format("O seu saldo é de R$ %.2f \n", saldoFinal);
                System.out.println(mensagemSaldo);
            }
            else if (numero == 2) {
                System.out.println("Quanto você deseja receber?");
                double receber = leitor.nextDouble();

                saldoFinal = saldoFinal + receber;

                String mensagemReceber = String.format("Foi adicionado a sua conta R$ %.2f\n\n", receber);
                System.out.println(mensagemReceber);
                System.out.println("Você recebeu: \n R$ " + receber);
            }

            else if (numero == 3)  {
                System.out.println("Quanto você deseja transferir?");
                double transferir = leitor.nextDouble();

                if (transferir <= saldoFinal) {
                saldoFinal = saldoFinal - transferir;

                String mensagemTransferir = String.format("Você transferiu R$ %.2f da sua conta.", transferir);
                System.out.println(mensagemTransferir);
                }

                else {
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                }
            }

            else if (numero == 4) {
                System.out.println("\n\nObrigado pela preferência! Volte sempre!");
            }

            else {
                System.out.println("Essa opção não existe, certifique-se de uma opção disponível.\n\n");
            }



        }

    }
}
