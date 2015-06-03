package morracinese.partita;

import java.util.ArrayList;
import morracinese.partita.giocatore.Giocatore;
import morracinese.partita.round.*;

/**
 *
 * @author Alex, Simone
 */
public class Partita
{
    private ArrayList<Round> rounds;
    private Giocatore giocatore1;
    private Giocatore giocatore2;
    private int numeroRound;
    
    public Partita(int numeroRound)
    {
        this.rounds = new ArrayList<Round>();
        this.giocatore1 = new Giocatore("Giocatore1");
        this.giocatore2 = new Giocatore("Giocatore2");
        this.numeroRound = numeroRound;
    }
    
    public Giocatore getGiocatore1()
    {
        return this.giocatore1;
    }
    
    public Giocatore getGiocatore2()
    {
        return this.giocatore2;
    }

    public int getNumeroRound()
    {
        return this.numeroRound;
    }
    
    public ArrayList<Round> getRounds()
    {
        return this.rounds;
    }
    
    public void addRound(Round round)
    {
        this.rounds.add(round);
    }
    
    public Giocatore getVincitore()
    {
        Giocatore vincitore = null;
        if(this.giocatore1.getPunteggio() != this.giocatore2.getPunteggio())
            if(this.giocatore1.getPunteggio() > this.giocatore2.getPunteggio())
                vincitore = this.giocatore1;
            else
                vincitore = this.giocatore2;
        return vincitore;
    }
    
    public Giocatore getSconfitto()
    {
        Giocatore sconfitto = null;
        if(this.giocatore1.getPunteggio() != this.giocatore2.getPunteggio())
            if(this.giocatore1.getPunteggio() < this.giocatore2.getPunteggio())
                sconfitto = this.giocatore1;
            else
                sconfitto = this.giocatore2;
        return sconfitto;
    }
}