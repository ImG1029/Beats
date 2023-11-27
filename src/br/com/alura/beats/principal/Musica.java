package br.com.alura.beats.principal;
public class Musica extends Audio{
    private String album;
    private String artistaConvidado;
    private String genero;

    public String getAlbum() {
        return album;
    }
    public String getArtistaConvidado() {
        return artistaConvidado;
    }
    public String getGenero() {
        return genero;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    public void setArtistaConvidado(String artistaConvidado) {
        this.artistaConvidado = artistaConvidado;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void exibirMusica() {
        System.out.println("Musica:             " + getNome());
        System.out.println("Artista:            " + getArtista());
        if (artistaConvidado != null) {
            System.out.println("Artista Convidado:  " + artistaConvidado);
        }
        System.out.println("Genero:             " + genero);
        System.out.println("Album:              " + album);
        int minutos = (getDuracaoEmSegundos() / 60);
        int segundos = (getDuracaoEmSegundos() % 60);
        System.out.println("Duracao:            " + minutos + ":" + segundos);
        System.out.println("Ouvida por:         " + getTotalReproducoes());
        System.out.println("Curtidas:           " + getCurtidas());
        System.out.println();
    }

}
