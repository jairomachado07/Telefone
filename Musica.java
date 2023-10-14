import java.util.List;

public class Musica {
    //criar lista de msicas
    private List<Musica> musicas;
    private String Nome;
    private String Artista;

    public Musica(String Nome, String Artista) {
        this.Nome = Nome;
        this.Artista = Artista;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    void tocar(boolean reproduzindo) {
        System.out.println("Tocando musica \"" + Nome + "\" de " + Artista);
    }

    void pausar(boolean reproduzindo) {
        System.out.println("Musica \"" + Nome + "\" de " + Artista + " pausada");
    }
}
