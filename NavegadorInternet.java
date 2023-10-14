
public class NavegadorInternet {
    private String urlAtual;

    public NavegadorInternet(String urlAtual) {
        this.urlAtual = "";
    }

    NavegadorInternet() {
        
    }

    public String getUrlAtual() {
        return urlAtual;
    }

    public void setUrlAtual(String urlAtual) {
        this.urlAtual = urlAtual;
    }
    
    public void exibirPagina(String url) {
        this.urlAtual = url;
        System.out.println("Exibindo página " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página " + urlAtual);
    }

    void exibirPagina() {
        }
}
