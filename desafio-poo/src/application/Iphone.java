package application;

import Interfaces.MusicPlayer;
import Interfaces.Navegador;
import Interfaces.Telefone;

public class Iphone implements Telefone, Navegador, MusicPlayer {
    public static void main(String[] args) {


        Iphone iphone = new Iphone();
        //funcoes Telefone
        System.out.println("Funções do Telefone");
        iphone.ligar("8776");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //funções do Navegador
        System.out.println("Funções do Navegador");
        iphone.exibirPagina("www.teste.com");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();


        //testes
    }

        @Override
        public void tocar () {
            System.out.println("Telefone tocando musica");
        }

        @Override
        public void pausar () {
            System.out.println("Musica pausada");
        }

        @Override
        public void selecionarMusica (String musica){
            System.out.println("Tocando " + musica);
        }

        @Override
        public void exibirPagina (String url){
            System.out.println("Exibindo página " + url);
        }

        @Override
        public void adicionarNovaAba () {
            System.out.println("Nova aba adicionada");
        }

        @Override
        public void atualizarPagina () {
            System.out.println("Página atualizada");
        }

        @Override
        public void ligar (String numero){
            System.out.println("Ligando para " + numero);
        }

        @Override
        public void atender () {
            System.out.println("Atender telefone");
        }

        @Override
        public void iniciarCorreioVoz () {
            System.out.println("Correio de voz iniciado");
        }


    }


