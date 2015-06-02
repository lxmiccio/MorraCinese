package morracinese.partita.round;

/**
 *
 * @author Alex
 */
public class Round
{
    Scelta sceltaGiocatore1;
    Scelta sceltaGiocatore2;
    
    public String getVincitore()
    {
        String winner;
        if(sceltaGiocatore1 == sceltaGiocatore2)
            winner = "Draw";
        else if(sceltaGiocatore1 == Scelta.CARTA && sceltaGiocatore2 == Scelta.SASSO || sceltaGiocatore1 == Scelta.SASSO && sceltaGiocatore2 == Scelta.FORBICE || sceltaGiocatore1 == Scelta.FORBICE && sceltaGiocatore2 == Scelta.CARTA)
            winner = "Player1";
        else
            winner = "Player2";
        return winner;
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