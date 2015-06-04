package morracinese;

import java.io.*;
import morracinese.engine.partita.*;
import morracinese.engine.partita.giocatore.*;
import morracinese.engine.partita.round.*;

/**
 *
 * @author Alex, Simone
 */
public class MorraCinese
{
    public static void main(String[] args) throws IOException
    {
    	BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
    	String scelta = null;
        boolean legalScelta = false;
        
        Partita partita = new Partita(5);
        partita.setGiocatore1(new Giocatore("G1"));
        partita.setGiocatore2(new Giocatore("G2"));
        
        for(int roundCorrente = 0; roundCorrente < partita.getNumeroRound(); roundCorrente++)
        {
            Round round = new Round(partita);
            partita.addRound(round);
            
            System.out.println("Round numero " + (roundCorrente+1) + "/" + partita.getNumeroRound());
            
            legalScelta = false;
            while(!legalScelta)
            {
                System.out.print("Scelta giocatore 1: ");
                scelta = tastiera.readLine();
                if(scelta.equals("c") || scelta.equals("f") || scelta.equals("s"))
                    legalScelta = true;
                else
                    System.err.println("c: carta, f: forbice, s: sasso");
            }
            if(scelta.equals("c"))
                round.setSceltaGiocatore1(Scelta.CARTA);
            else if(scelta.equals("f"))
                round.setSceltaGiocatore1(Scelta.FORBICE);
            else if(scelta.equals("s"))
                round.setSceltaGiocatore1(Scelta.SASSO);
            
            legalScelta = false;
            while(!legalScelta)
            {
                System.out.print("Scelta giocatore 2: ");
                scelta = tastiera.readLine();
                if(scelta.equals("c") || scelta.equals("f") || scelta.equals("s"))
                    legalScelta = true;
                else
                    System.err.println("c: carta, f: forbice, s: sasso");
            }
            if(scelta.equals("c"))
                round.setSceltaGiocatore2(Scelta.CARTA);
            else if(scelta.equals("f"))
                round.setSceltaGiocatore2(Scelta.FORBICE);
            else if(scelta.equals("s"))
                round.setSceltaGiocatore2(Scelta.SASSO);
            
            if(round.getVincitore() != null)
                round.getVincitore().increasePunteggio();
            
            System.out.println(partita.getGiocatore1().getPunteggio() + "-" + partita.getGiocatore2().getPunteggio() + "\n");
        }
        
        if(partita.getVincitore() != null)
            System.out.println(partita.getVincitore().getNome() + " ha vinto " + partita.getVincitore().getPunteggio() + " a " + partita.getSconfitto().getPunteggio() + "\n");
        else
           System.out.println("Pareggio" + "\n"); 
    }
}