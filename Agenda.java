import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    //Criar lista com os dados
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionar(Contato contato) {
        try (// Solicita os dados do contato ao usuário
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nome do contato: ");
            String nome = scanner.nextLine();
            System.out.print("Número do contato: ");
            String numero = scanner.nextLine();

            // Adiciona o contato à lista
            contatos.add(new Contato(nome, numero));
        }
    }

    public String getNumero() {
        return contatos.get(0).getNumero();
    }
}


