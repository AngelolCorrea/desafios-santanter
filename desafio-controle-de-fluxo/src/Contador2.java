import java.util.Scanner;

public class Contador2 {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe o primeiro número escolhido como parametro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Informe o segundo número escolhido como parametro: ");
        int parametroDois = terminal.nextInt();

        try {

            contar (parametroUm , parametroDois);

        } catch (ParametrosInvalidosException e) {

            System.out.println("O segundo parametro deve ser maior que o primeiro.");
        }

    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int x = 1 ; x <= contagem ; x++ ) {
            System.out.println("Contagem numero: " + x);
        }

    }


}