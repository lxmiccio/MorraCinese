package morracinese.engine.partita;

import java.util.*;
import morracinese.engine.partita.round.*;
import morracinese.engine.partita.giocatore.*;

/**
 *
 * @author Alex Miccio, Simone Raichini
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
        if(giocatore1 == null)
            throw new IllegalArgumentException("Giocatore1 cannot be null");
        this.giocatore1 = giocatore1;
        if(giocatore2 == null)
            throw new IllegalArgumentException("Giocatore2 cannot be null");
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
    
    public void addRound(Round round)
    {
        this.rounds.add(round);
    }
    
    public ArrayList<Round> getRounds()
    {
        return this.rounds;
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
}