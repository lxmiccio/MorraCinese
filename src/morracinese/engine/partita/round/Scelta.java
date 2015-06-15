package morracinese.engine.partita.round;

/**
 *
 * @author Alex Miccio, Simone Raichini
 */
public enum Scelta
{
    CARTA,
    FORBICE,
    SASSO;
    
    public static String toString(Scelta scelta)
    {
        String string = null;
        if(scelta == CARTA)
            string = "Carta";
        if(scelta == FORBICE)
            string = "Forbice";
        if(scelta == SASSO)
            string = "Sasso";
        return string;
    }
}