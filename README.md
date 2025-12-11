# Gioca_Numeri in Java.

## Descrizione del progetto
Questo programma simula un gioco con dei numeri utilizzando i thread in Java. 
Ogni giocatore è rappresentato da un thread separato che inserisce un numero scelto dall’utente e lo confronta con il numero vincente gestito dal GestoreGioco. 
Il gioco viene coordinato dalla classe principale, che avvia i due giocatori e attende la fine delle loro esecuzioni.

## Funzionalità principali

1. **Gestione del numero vincente**
   - Il numero vincente è gestito dalla classe GestoreGioco.
   - Il gestore verifica se il numero scelto dal giocatore corrisponde a quello vincente.
   - Comunicazione dell’esito (giusto/sbagliato).

2.  **Gestione dei giocatori**
   - Ogni giocatore è un thread rappresentato dalla classe Giocatore.
   - Ogni giocatore ha un nome e un punteggio.
   - Il giocatore si presenta, attende alcuni secondi e poi chiede all’utente di inserire un numero.
   - Il numero scelto viene inviato al gestore che ne controlla la correttezza.

3. **Interazione tra thread**
   - I giocatori condividono lo stesso oggetto GestoreGioco.
   - Ogni giocatore effettua la propria giocata indipendentemente dall’altro.
   - I risultati vengono stampati sulla console.

4. **Interattività**
   - L’utente inserisce un numero per ciascun giocatore.
   - Ogni giocatore mostra il numero scelto e l’esito della verifica.

## Esecuzione

1. All'avvio il programma mostra un messaggio di inizio.

2. Il sistema crea:
   - un gestore del gioco,
   - due giocatori che partecipano alla partita.

3. Durante il gioco:
   - ogni giocatore chiede all’utente di inserire un numero,
   - il gestore verifica il numero,
   - viene comunicato se è stato indovinato o meno.

4. Alla fine, il programma attende la chiusura dei due thread e mostra il messaggio di fine gioco.

## Note
Il progetto scolastico Gioca_Numeri è stato svolto da me (studente del 5 AINF) presso l'ITTS A. Volta di Perugia grazie anche ai materiali forniti e all'aiuto dei professori Ciuchetti Monica e Amendola Francesco.
