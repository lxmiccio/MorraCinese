package morracinese.partita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import morracinese.partita.giocatore.Giocatore;
import morracinese.partita.round.*;

/**
 *
 * @author Alex
 */
public class Partita
{
    private Round round;
    private Giocatore giocatore1;
    private Giocatore giocatore2;
    private int numeroRound;

    public Partita(int numeroRound)
    {
        this.giocatore1 = new Giocatore("Giocatore1");
        this.giocatore2 = new Giocatore("Giocatore2");
        this.numeroRound = numeroRound;
    }
    
    public void startPartita() throws IOException
    {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        boolean legalValue;
        for(int currentRound = 0; currentRound < this.numeroRound; currentRound++)
        {
            System.out.println("Round " + (currentRound+1));
            this.round = new Round();
            legalValue = false;
            while(!legalValue)
            {
                System.out.print("Scelta giocatore 1: ");
                line = keyboard.readLine();
                if(line.equals("s") || line.equals("c") || line.equals("f"))
                    legalValue = true;
                else
                    System.err.println("c: carta, f: forbice, s: sasso");
            }
            if(line.equals("c"))
                this.round.setSceltaGiocatore1(Scelta.CARTA);
            if(line.equals("f"))
                this.round.setSceltaGiocatore1(Scelta.FORBICE);
            if(line.equals("s"))
                this.round.setSceltaGiocatore1(Scelta.SASSO);
            
            legalValue = false;
            while(!legalValue)
            {
                System.out.print("Scelta giocatore 2: ");
                line = keyboard.readLine();
                if(line.equals("s") || line.equals("c") || line.equals("f"))
                    legalValue = true;
                else
                    System.err.println(line + "c: carta, f: forbice, s: sasso");
            }
            if(line.equals("c"))
                this.round.setSceltaGiocatore2(Scelta.CARTA);
            if(line.equals("f"))
                this.round.setSceltaGiocatore2(Scelta.FORBICE);
            if(line.equals("s"))
                this.round.setSceltaGiocatore2(Scelta.SASSO);
            
            this.updatePunteggio();
            System.out.println(this.giocatore1.getPunteggio() + " - " + this.giocatore2.getPunteggio() + "\n");
        }
    }
    
    public void updatePunteggio()
    {
        if(!this.round.getVincitore().equals("Draw"))
            if(this.round.getVincitore().equals("Player1"))
            {
                this.giocatore1.increasePunteggio();
            }
            else
            {
                this.giocatore2.increasePunteggio();
            }
    }
    
    public String getVincitore()
    {
        String winner;
        if(this.giocatore1.getPunteggio() == this.giocatore2.getPunteggio())
            winner = "Draw";
        else if(this.giocatore1.getPunteggio() > this.giocatore2.getPunteggio())
            winner = "Player1";
        else
            winner = "Player2";
        return winner;
    }

    public Round getRound()
    {
        return round;
    }
}