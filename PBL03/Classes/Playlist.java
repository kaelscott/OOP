package PBL03.Classes;

public class Playlist {
    private String nome;
    private String descricao;
    private String foto;
    private String[] musicas;

    // construtor sem parâmetros
    public Playlist() {
        this.nome = "playlist";
        this.descricao = "descricao";
        this.foto = "foto_1.jpg";
        this.musicas = new String[0];
    }

    // construtor com parâmetros
    public Playlist(String nome, String descricao, String foto, String[] musicas) {
        this.nome = nome;
        this.descricao = descricao;
        this.foto = foto;
        this.musicas = musicas;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public String[] getMusicas() {
        return musicas;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }

    // métodos
    public void criarPlaylist() {
        System.out.println("Criando playlist " + this.nome);
    }
    public void deletarPlaylist() {
        System.out.println("Deletando playlist " + this.nome);
    }
    public void adicionarMusica() {
        System.out.println("Adicionando música...");
    }
    public void removerMusica() {
        System.out.println("Removendo música...");
    }
    public void modoAleatorio() {
        System.out.println("Modo aleatório...");
    }
    public void downloadPlaylist() {
        System.out.println("Download da playlist...");
    }

}
