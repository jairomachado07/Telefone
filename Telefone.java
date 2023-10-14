import java.util.Arrays;
import java.util.Scanner;

public class Telefone {

    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public Telefone() {
        this.reprodutorMusical = new ReprodutorMusical(Arrays.asList(
            new Musica("Canção 1", "Artista 1")
        ));
        this.aparelhoTelefonico = new AparelhoTelefonico("1234-5678");
        this.navegadorInternet = new NavegadorInternet();
    }
    
    public void reproduzirMusica() {
        reprodutorMusical.tocar();
    }

    public void atender() {
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreiroVoz() {
        aparelhoTelefonico.iniciarCorreiroVoz();
    }

    public void exibirPagina() {
        navegadorInternet.exibirPagina("https://www.google.com");
    }

    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }

    private void exibirPagina(String httpswwwgooglecom) {
    }
    
    public void ligar() {
        aparelhoTelefonico.ligar();
    }

    private void ligar(String string) {
        aparelhoTelefonico.ligar();
    }

    private void reproduzirMusica(int i) {
    }
    
    public static void main(String[] args) {
        
        Telefone telefone = new Telefone();
        int opcao = 0;
        
        // implemntar todas as classes ao menu
        String Menu = """
                ** Digite sua opção **
                1 - Reproduzir música
                2 - Pausar/Continuar Música
                3 - Adicionar música
                4 - Ligar
                5 - Atender
                6 - Iniciar correio de voz
                7 - Exibir página da Web
                8 - Adicionar nova aba
                9 - Atualizar página
                10 - Sair
                """;

        Scanner Leitura = new Scanner(System.in);

        while (opcao != 10){
            System.out.println(Menu);
            opcao = Leitura.nextInt();

            if (opcao == 1){
                telefone.reproduzirMusica(0);
                System.out.println("Reproduzindo música");
                
            }else if (opcao == 2){
                System.out.println("Não há saldo suficiente para realizar essa transação.");
            
            }else if(opcao == 3){
                System.out.println("A ligação está em andamento");
                telefone.atender();
                
            } else if (opcao == 4) {
                System.out.println("Digite qual o número que deseja ligar");
                String numero = Leitura.nextLine();
                telefone.ligar(numero);
                System.out.println("A ligação está em andamento");
                
            }else if(opcao == 5){
                telefone.atender();
                
            } else if (opcao == 6){
                telefone.iniciarCorreiroVoz();
                
            }else if(opcao == 7){
                System.out.println("Exibindo página: ");
                telefone.exibirPagina();
                
            } else if (opcao == 8) {
                telefone.adicionarNovaAba();
                
            }else if(opcao == 9){
                telefone.atualizarPagina();
                System.out.println("Pagina atualizada");
                
            } else if (opcao == 10) {
                System.out.println("Opção invalida");
            }

        }
    }
}