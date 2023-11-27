package br.com.alura.beats.principal;
public class Audio {

    private String nome;
    private String artista;
    private int duracaoEmSegundos;
    private int totalReproducoes;
    private int curtidas;
    private boolean curtiu;

    public String getNome() {
        return nome;
    }
    public String getArtista() {
        return artista;
    }
    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }
    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public void reproduzir() {
        // Teoricamente o codigo de reproduzir a musica vem aqui :V
        totalReproducoes++;
    }
    public void curtir() {
        if (curtiu == false) {
            curtidas++;
        } else {
            System.out.println("Voce ja curtiu essa musica!");
        }
    }
}
