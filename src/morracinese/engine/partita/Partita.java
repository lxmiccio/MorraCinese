package morracinese.engine.partita;

import java.util.ArrayList;
import morracinese.engine.partita.round.*;
import morracinese.engine.partita.giocatore.*;

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
    
    public Partita(int numeroRound, Giocatore giocatore1, Giocatore giocatore2)
    {
        if(numeroRound <= 0)
            throw new IllegalArgumentException("NumeroRound must be positive");
        this.numeroRound = numeroRound;
        this.giocatore1 = giocatore1;
        this.giocatore2 = giocatore2;
        this.rounds = new ArrayList<Round>();
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
    
    /**
     * @return the winner of this match, null if a draw occurred
     */
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
    
    /**
     * @return the loser of this round, null if a draw occurred
     */
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