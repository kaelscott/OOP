package PBL03.Classes;

public class Artista {
    private String nome;
    private String musica;
    private String album;
    private int ouvintesMensais;

    // construtor sem parâmetros
    public Artista() {
        this.nome = "artista";
        this.musica = "musica";
        this.album = "album";
        this.ouvintesMensais = 0; 
    }

    // construtor com parâmetros
    public Artista(String nome, String musica, String album, int ouvintesMensais) {
        this.nome = nome;
        this.musica = musica;
        this.album = album;
        this.ouvintesMensais = ouvintesMensais;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }
    public String getMusica() {
        return musica;
    }
    public String getAlbum() {
        return album;
    }
    public int getOuvintesMensais() {
        return ouvintesMensais;
    }
    public void setOuvintesMensais(int ouvintesMensais) {
        if (ouvintesMensais >= 0) {
            this.ouvintesMensais = ouvintesMensais;
        }
    }


    public void postarMusica() {
        System.out.println("Postando " + this.musica + " no álbum " + this.album);
    }
    public void deletarMusica() {
        System.out.println("Deletando " + this.musica);
    }
}
