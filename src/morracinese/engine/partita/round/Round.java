package morracinese.engine.partita.round;

import morracinese.engine.partita.giocatore.*;
import morracinese.engine.partita.*;

/**
 *
 * @author Alex, Simone
 */
public class Round
{
    Partita partita;
    Scelta sceltaGiocatore1;
    Scelta sceltaGiocatore2;
    
    public Round(Partita partita)
    {
        if(partita == null)
            throw new IllegalArgumentException("Partita cannot be null");
        this.partita = partita;
    }
    
    public Partita getPartita()
    {
        return this.partita;
    }
    
    /**
     * @return the winner of this round, null if a draw occurred
     */
    public Giocatore getVincitore()
    {
        Giocatore vincitore = null;
        if(sceltaGiocatore1 != sceltaGiocatore2)
            if(sceltaGiocatore1 == Scelta.CARTA && sceltaGiocatore2 == Scelta.SASSO || sceltaGiocatore1 == Scelta.FORBICE && sceltaGiocatore2 == Scelta.CARTA || sceltaGiocatore1 == Scelta.SASSO && sceltaGiocatore2 == Scelta.FORBICE)
                vincitore = this.partita.getGiocatore1();
            else
                vincitore = this.partita.getGiocatore2();
        return vincitore;
    }
    
    public void setSceltaGiocatore1(Scelta scelta)
    {
        if(scelta == null)
            throw new IllegalArgumentException("Scelta cannot be null");
        this.sceltaGiocatore1 = scelta;
    }
    
    public void setSceltaGiocatore2(Scelta scelta)
    {
        if(scelta == null)
            throw new IllegalArgumentException("Scelta cannot be null");
        this.sceltaGiocatore2 = scelta;
    }
}