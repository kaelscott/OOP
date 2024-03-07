package PBL03;
import PBL03.Classes.*;

public class Main   {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("Playlist", "Descrição", "foto_1.jpg", new String[]{"Lost", "Pyramids"});
        Musica musica = new Musica("Lost", "Frank Ocean", 4);
        Usuario usuario = new Usuario("samba", "premium", "gato.jpg", "sama@gmail", "12@!3");
        Artista artista = new Artista("Frank Ocean", "Lost", "Channel Orange", 1000000);
        Podcast podcast = new Podcast("Podcast", "Artista", 60);

        for (String musicaPlaylist : playlist.getMusicas()) {
            System.out.println(musicaPlaylist);
        }
        artista.postarMusica();
        musica.tocarMusica();
        musica.setDuracao(2);
        System.out.println(musica.getDuracao());
        usuario.setTipoDeConta("free");
        System.out.println(usuario.getTipoDeConta());
        usuario.setSenha("12345");
        System.out.println(usuario.getSenha());
    }
}
