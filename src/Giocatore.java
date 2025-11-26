import java.util.Scanner;

/**
 * La classe {@code Giocatore} rappresenta un partecipante al gioco.
 * Ogni giocatore viene eseguito in un thread separato e interagisce con il GestoreGioco.
 */
public class Giocatore extends Thread {

    /**
     * Punteggio accumulato dal giocatore.
     */
    int punteggio;

    /**
     * Nome del giocatore.
     */
    String nome;

    /**
     * Identificatore numerico del giocatore.
     */
    int id;

    /**
     * Riferimento al gestore del gioco condiviso tra i giocatori.
     */
    GestoreGioco gg;

    /**
     * Costruttore che inizializza il giocatore con un nome.
     *
     * @param nome il nome del giocatore
     */
    public Giocatore(String nome) {
        this.nome = nome;
        punteggio = 0;
    }

    /**
     * Costruttore che inizializza il giocatore con un nome
     * e un riferimento al gestore del gioco.
     *
     * @param nome    il nome del giocatore
     * @param gestore il gestore del gioco a cui il giocatore è associato
     */
    public Giocatore(String nome, GestoreGioco gestore) {
        this.nome = nome;
        gg = new GestoreGioco(); //
    }

    /**
     * Comunica un messaggio di presentazione del giocatore.
     * Mostra il nome del giocatore sulla console.
     */
    public void comunica() {
        System.out.println("Sono il giocatore " + nome);
    }

    /**
     * Metodo che gestisce il turno di gioco del giocatore.
     * Chiede un numero in input, lo visualizza e lo invia al gestore del gioco per la verifica.
     */
    public void gioca() {
        // chiedere in input un numero
        System.out.println("Inserisci un numero: ");

        // leggere il numero inserito
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        // visualizzare il numero scelto
        System.out.println("Ho scelto il numero " + num);

        // invio del numero al gestore del gioco
        gg.verifica(num);
    }

    /**
     * Metodo eseguito quando il thread del giocatore viene avviato.
     * Il giocatore comunica il proprio nome, attende per 5 secondi,
     * e poi effettua la giocata.
     */
    @Override
    public void run() {
        comunica();
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("");
        }
        gioca();
    }
}