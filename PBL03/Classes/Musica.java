package PBL03.Classes;

public class Musica {
    private String nome;
    private String artista;
    private int duracao;

    // construtor sem parâmetros
    public Musica() {
        this.nome = "musica";
        this.artista = "artista";
        this.duracao = 5;
    }

    // construtor com parâmetros
    public Musica(String nome, String artista, int duracao) {
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if (duracao >= 0) {
            this.duracao = duracao;
        } else {
            System.out.println("Duração inválida");
        }
    }

    // métodos
    public void tocarMusica() {
        System.out.println("Tocando " + this.nome + " de " + this.artista);
    }
    public void pausarMusica() {
        System.out.println("Pausando " + this.nome + " de " + this.artista);
    }
    public void curtirMusica() {
        System.out.println("Curtindo " + this.nome + " de " + this.artista);
    }
    public void pularMusica() {
        System.out.println("Pulando " + this.nome + " de " + this.artista);
    }
    public void voltarMusica() {
        System.out.println("Voltando..");
    }
}
