package PBL03.Classes;

public class Podcast {
    private String nome;
    private String artista;
    private int duracao;

    // construtor sem parâmetros
    public Podcast() {
        this.nome = "Podcast";
        this.artista = "Artista";
        this.duracao = 0;
    }
    // construtor com parâmetros
    public Podcast(String nome, String artista, int duracao) {
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
    }

    // getters
    public String getNome() {
        return this.nome;
    }
    public String getArtista() {
        return this.artista;
    }
    public int getDuracao() {
        return this.duracao;
    }


    public void tocarPodcast() {
        System.out.println("Tocando podcast...");
    }
    public void pausarPodcast() {
        System.out.println("Pausando podcast...");
    }
    public void pularPodcast() {
        System.out.println("Pulando podcast...");
    }
    public void voltarPodcast() {
        System.out.println("Voltando podcast...");
    }
    public void baixarPodcast() {
        System.out.println("Baixando podcast...");
    }
    public void mudarVelocidade(int velocidade) {
        System.out.println("Mudando velocidade para " + velocidade + "x...");
    }
}
