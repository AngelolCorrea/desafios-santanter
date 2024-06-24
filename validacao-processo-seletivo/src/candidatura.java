import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class candidatura {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Informe o salário desejado: ");
        //analisarCandidato(1900.0);
        //analisarCandidato(2200.0);
        //analisarCandidato(2000.0);
        //selecaoCandidatos();
        //imprimirSelecionados();
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);

        }
    }

    static boolean atender (){
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativasReaalizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasReaalizadas++;
        } while (continuarTentando && tentativasReaalizadas < 3);
        if (atendeu)
            System.out.println("Conseguimos contato com o canditato: " + candidato + " na " + tentativasReaalizadas + " temtativa");
        else
            System.out.println("Não conseguimos contato com o candidato: " +candidato +" Numero máximo de tentativas: " +tentativasReaalizadas);

    }


    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe","Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento: ");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de indice " +(indice+1) + " é: " +candidatos[indice]);
        }
        System.out.println("Forma abreviada For each");
        for(String candidato : candidatos){
            System.out.println("O candidato selecionado é: "+candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe","Marcia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados <5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " +candidato + " Soicitou este valor de salário: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " +candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
             }

    }

    static double valorPretendido (){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido) {
            System.out.println("ligar para o candidato");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar com contra-proposta");
        } else {
            System.out.println("Aguardar outras candidatures");
        }
    }
}
