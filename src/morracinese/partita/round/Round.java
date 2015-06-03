package morracinese.partita.round;

import morracinese.partita.*;
import morracinese.partita.giocatore.*;

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
        this.partita = partita;
    }
    
    public Partita getPartita()
    {
        return this.partita;
    }
    
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
        this.sceltaGiocatore1 = scelta;
    }
    
    public void setSceltaGiocatore2(Scelta scelta)
    {
        this.sceltaGiocatore2 = scelta;
    }
}