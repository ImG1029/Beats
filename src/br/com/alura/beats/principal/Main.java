package br.com.alura.beats.principal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Musica lady = new Musica();
        Podcast flow = new Podcast();

        System.out.println(); // Separacao das linhas no terminal do resto pra ficar mais bonito na operacao :D

        lady.setNome("Lady - Hear me Tonight");
        lady.setArtista("Modjo");
        lady.setGenero("Pop Rock");
        lady.setAlbum("Modjo (Remastered)");
        lady.setDuracaoEmSegundos(307);
        for (int i = 0; i < 5; i++) {
            lady.curtir();
        }
        for (int i = 0; i < 373308597; i++) {
            lady.reproduzir();
        }
        
        lady.exibirMusica();

        Musica waiting = new Musica();

        waiting.setNome("Waiting On The Sky To Change");
        waiting.setArtista("Staret");
        waiting.setArtistaConvidado("Breaking Benjamin, Judge & Jury");
        waiting.setGenero("Rock");
        waiting.setAlbum("Single");
        waiting.setDuracaoEmSegundos(244);
        for (int i = 0; i < 10; i++) {
            waiting.curtir();
        }
        for (int i = 0; i < 21733752; i++) {
            waiting.reproduzir();
        }
        

        waiting.exibirMusica();

        /*
        System.out.println(lady.getNome());
        System.out.println(lady.getArtista());
        System.out.println(lady.getArtistaConvidado());
        System.out.println(lady.getAlbum());
        System.out.println(lady.getDuracaoEmSegundos());
        System.out.println(lady.getAvaliacao());
        */

        flow.setNome("Quebrando o Xbox Mil Grau");
        flow.setArtista("Flow");
        flow.setConvidados("Xbox Mil Grau");
        flow.setDescricao("Hoje temos Xbox Mil Grau, e vamos quebrar ele na porrada! Cada vez que ele falar contexto bebe uma dose de pinga galera!");
        flow.setDuracaoEmSegundos(5400);
        for (int i = 0; i < 7000000; i++) {
            flow.curtir();
        }
        for (int i = 0; i < 7000000; i++) {
            flow.reproduzir();
        }

        flow.exibirPodcast();


        ler.close();
    }
}
