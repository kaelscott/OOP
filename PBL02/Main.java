package PBL02;
import PBL02.Classes.Usuario;
import PBL02.Classes.Playlist;
import PBL02.Classes.Musica;
import PBL02.Classes.Artista;
import PBL02.Classes.Podcast;

public class Main   {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.nome = "João";
        usuario.tipoDeConta = "Premium";
        usuario.email = "joao@123";

        Playlist playlist = new Playlist();
        playlist.nome = "musicas de ouvir";
        playlist.descricao = "as melhores músicas de ouvir";
        playlist.musicas = new String[]{"qwe", "asd", "zxc"};

        Musica musica = new Musica();
        musica.nome = "qwe";
        musica.artista = "aaa";
        musica.duracao = 3;

        Artista artista = new Artista();
        artista.nome = "aaa";
        artista.musica = "qwe";
        artista.ouvintesMensais = 1000;

        Podcast podcast = new Podcast();
        podcast.nome = "abc";
        podcast.artista = "aaa";
        podcast.duracao = 50;


        usuario.logar();
        playlist.criarPlaylist();
        musica.tocarMusica();
        artista.postarMusica();
        podcast.mudarVelocidade(3);

    }
}
