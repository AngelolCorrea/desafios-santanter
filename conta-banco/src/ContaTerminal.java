import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double saldo = 257.50;

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe sua agência: ");
        int agencia = scanner.nextInt();
        System.out.println("Informe o numero da sua conta: ");
        String numeroConta = scanner.next();

        System.out.println("Olá: "+nome+ ". Obrigado por criar conta em nosso banco. Sua agência é: "+agencia +". Sua conta é: "+numeroConta +". Seu saldo é: "+saldo);



    }
}
