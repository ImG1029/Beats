package br.com.alura.beats.principal;
public class Podcast extends Audio {
    private String convidados;
    private String descricao;

    public void setConvidados(String convidados) {
        this.convidados = convidados;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getConvidados() {
        return convidados;
    }
    public String getDescricao() {
        return descricao;
    }


    public void exibirPodcast() {
        System.out.println("Titulo:             " + getNome());
        System.out.println("Apresentador:       " + getArtista());
        if (convidados != null) {
            System.out.println("Convidados:         " + convidados);
        }
        System.out.println("\n" + getDescricao() + "\n");
        int horas = (getDuracaoEmSegundos() / 3600);
        int minutos = (getDuracaoEmSegundos() / 60);
        int segundos = (getDuracaoEmSegundos() % 60);
        if (horas != 0) {
            minutos = ((getDuracaoEmSegundos() / 60) % 60); 
            System.out.println("Duracao:            " + horas + ":" + minutos + ":" + segundos);
        } else {
            System.out.println("Duracao:            " + minutos + ":" + segundos);
        }
        System.out.println("Ouvido por:         " + getTotalReproducoes());
        System.out.println("Curtidas:           " + getCurtidas());
        System.out.println();
    }
    
}
