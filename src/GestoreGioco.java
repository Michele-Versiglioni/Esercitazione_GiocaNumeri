/**
 * La classe {@code GestoreGioco} gestisce la logica del gioco
 * e verifica se il numero scelto da un giocatore corrisponde al numero vincente.
 */
public class GestoreGioco {

    /** Numero vincente da indovinare. */
    private int numeroVincente;

    /**
     * Costruttore di default che imposta un numero vincente predefinito.
     * In questo caso, il numero vincente è 7.
     */
    public GestoreGioco() {
        numeroVincente = 7;
    }

    /**
     * Costruttore di copia che crea un nuovo {@code GestoreGioco}
     * con lo stesso numero vincente di un altro gestore.
     *
     * @param gg un altro oggetto {@code GestoreGioco} da cui copiare il numero vincente
     */
    public GestoreGioco(GestoreGioco gg) {
        numeroVincente = gg.numeroVincente;
    }

    /**
     * Verifica se il numero scelto dal giocatore corrisponde al numero vincente.
     * Stampa un messaggio di successo o di errore sulla console.
     *
     * @param num il numero scelto dal giocatore
     */
    public void verifica(int num) {
        System.out.println("Sono dentro verifica");
        if (num == numeroVincente) {
            System.out.println("Il numero è giusto, bravo!!");
        } else {
            System.out.println("Il numero è sbagliato, peccato!!");
        }
    }
}

