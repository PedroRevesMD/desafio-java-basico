import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String nomeCliente;
        int numeroConta;
        String numeroAgencia;
        double saldoConta;

        System.out.println("Olá, Seja bem Vindo ao nosso banco!");
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"))) {
            
            System.out.println("Por favor, Digite o seu Nome:");
            nomeCliente = scanner.nextLine();

            System.out.println("Por favor, Digite o numero da sua agência:");
            numeroAgencia = scanner.next();

            System.out.println("Por favor, Digite o numero da sua Conta Bancária:");
            numeroConta = scanner.nextInt();

            System.out.println("Por favor, Digite o numero do Saldo Inicial:");
            saldoConta = scanner.nextDouble();
        }
    }
}
