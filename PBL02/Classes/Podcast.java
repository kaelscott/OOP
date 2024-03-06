package PBL02.Classes;

public class Podcast {
    public String nome;
    public String artista;
    public int duracao;

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
