package Iphone;
import java.util.Scanner;

public class AparelhoTelefonico {

    private Agenda agenda;
    private String numero;
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    private Scanner scanner;

    public AparelhoTelefonico(String numero) {
        this.numero = numero;
        this.agenda = new Agenda();
        this.scanner = new Scanner(System.in);
    }

    public String consultarNumero() {
        return this.agenda.getNumero();
    }
    
    public void ligar() {
        System.out.print("Número para ligar: ");
        String numero = scanner.nextLine();

        this.ligar(numero);
    }

    public void atender() {
        System.out.println("Atendendo a chamada");
    }

    public void iniciarCorreiroVoz() {
        System.out.println("Iniciando correio de voz");
    }

    private void ligar(String numero) {
    }

}
