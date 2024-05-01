import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args){
        //Criando os scanners
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next ();
        System.out.println("por favor, digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da sua conta: ");
        int numeroConta = scanner.nextInt ();

        System.out.println("Por favor, digite o número da Agência: ");
        String numeroAgencia = scanner.next ();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldoConta = scanner.nextDouble();

        //Imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, " + nomeCliente + " " + sobrenomeCliente + " obrigado(a) por criar uma conta no nosso banco!");
        System.out.println("Sua agência é: " + numeroAgencia + " Conta: " + numeroConta + " e seu saldo: " + saldoConta + " já está disponível para saque.");
        scanner.close();
    }
}

