/**
 * Classe principale che avvia il gioco tra due giocatori.
 * Crea un gestore di gioco e due thread di tipo Giocatore che partecipano al gioco.
 */
public class GiocaNumeri {

    /**
     * Metodo principale che esegue il programma.
     *
     * @param args argomenti da riga di comando (non utilizzati)
     * @throws Exception se si verifica un errore durante l'esecuzione del programma
     */
    public static void main(String[] args) throws Exception {
        System.out.println("INIZIO!");

        // Creazione del gestore del gioco
        GestoreGioco gg = new GestoreGioco();

        // Creazione dei due giocatori che partecipano al gioco
        Giocatore g1 = new Giocatore("Mario", gg);
        Giocatore g2 = new Giocatore("Bros", gg);

        // Avvio dei thread dei giocatori
        g1.start();
        g2.start();

        // Attesa che entrambi i giocatori terminino la loro esecuzione
        try {
            g1.join();
            g2.join();
        } catch (InterruptedException e) {
            System.out.println("errore");
        }

        System.out.println("FINE GIOCO!");
    }
}
