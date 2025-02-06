import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String nomeCliente;
        int numeroConta;
        String numeroAgencia;
        double saldoConta;

        System.out.println("Olá, Seja bem Vindo ao nosso banco!");
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            
            System.out.println("Por favor, Digite o seu Nome:");
            nomeCliente = scanner.nextLine();

            System.out.println("Por favor, Digite o numero da sua agência:");
            numeroAgencia = scanner.next();

            System.out.println("Por favor, Digite o numero da sua Conta Bancária:");
            numeroConta = scanner.nextInt();

            System.out.println("Por favor, Digite o numero do Saldo Inicial:");
            saldoConta = scanner.nextDouble();
        }

        String mensagemBoasVindas = criarMensagemBoasVindas(nomeCliente, numeroConta, numeroAgencia, saldoConta);
        System.out.println(mensagemBoasVindas);
    }

    static String criarMensagemBoasVindas(String nomeCliente, int numeroConta, String numeroAgencia, double saldoConta) {
        String mensagemFinal = "Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco!, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldoConta + " R$ já está disponível para saque.";
        return mensagemFinal;
    }
}
