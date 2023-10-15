package Iphone;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Musica {
    //criar lista de msicas
    private static List<Musica> musicas;
    private static String Nome;
    private static String Artista;
    private boolean Tocando;

    public Musica(String Nome, String Artista) {   
        Musica.Nome = Nome;
        Musica.Artista = Artista;
    }

    public static void main(String[] args) {
        Telefone Telefone = new Telefone();

        // Inicializa a variável musicas com uma lista de músicas
        List<Musica> musicas = new ArrayList<>();
        musicas.add(new Musica("Acordei", "Marília Mendonça"));
        musicas.add(new Musica("Evidências", "Chitãozinho e Xororó"));

        // Adiciona uma música à lista
        Telefone.addMusica(musicas.get(0));
    }

    public Musica(List<Musica> musicas) {
        Musica.musicas = musicas;
    }

    public void adicionarMusica(Musica musica) {
        if (Musica.musicas == null) {
            Musica.musicas = new ArrayList<>();
        }

        Musica.musicas.add(musica);
    }

    public void adicionarMusica(String nome, String artista) {
        Musica musica = new Musica(nome, artista);
        musicas.add(musica);
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        Musica.Nome = Nome;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        Musica.Artista = Artista;
    }

    static void plause(boolean Tocando ) {
        if (Tocando) {
          System.out.println("Musica \"" + Nome + "\" de " + Artista + " pausada");
        } else {
          System.out.println("Tocando musica \"" + Nome + "\" de " + Artista);
        }
      }

    void tocar(boolean reproduzindo) {
        System.out.println("Tocando musica \"" + Nome + "\" de " + Artista);
    }

    void pausar(boolean reproduzindo) {
        System.out.println("Musica \"" + Nome + "\" de " + Artista + " pausada");
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        Musica.musicas = musicas;
    }

    public boolean isTocando() {
        return Tocando;
    }

    public void setTocando(boolean tocando) {
        Tocando = tocando;
    }

    public static void adicionarMusica() {
        try (// Solicita os dados do contato ao usuário
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nome da música: ");
            String nome = scanner.nextLine();
            System.out.print("Número do artista: ");
            String artista = scanner.nextLine();

            // Adiciona o contato à lista
            musicas.add(new Musica(nome, artista));
        }
    }

    // crie metodo para consultar a playlist musica
}
