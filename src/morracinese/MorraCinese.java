package morracinese;

import java.io.IOException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import morracinese.partita.Partita;

/**
 *
 * @author Alex
 */
public class MorraCinese
{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, IOException
    {
        Partita partita = new Partita(3);
        partita.startPartita();
        System.out.println(partita.getVincitore() + " ha vinto la partita");
    }
}