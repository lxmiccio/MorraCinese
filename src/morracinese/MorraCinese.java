package morracinese;

import java.io.*;
import javax.swing.*;
import morracinese.engine.partita.*;
import morracinese.engine.partita.giocatore.*;
import morracinese.engine.partita.round.*;
import morracinese.gui.*;
import morracinese.gui.ascoltatore.Ascoltatore;
import morracinese.gui.posizione.Posizione;


/**
 *
 * @author Alex Miccio, Simone Raichini
 */
public class MorraCinese
{
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
    {
        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
            if ("Windows".equals(info.getName()))
                UIManager.setLookAndFeel(info.getClassName());
                
        Partita partita = new Partita(5, new Giocatore("Giocatore1", Posizione.LEFT), new Giocatore("Giocatore2", Posizione.RIGHT));
        DefaultListModel listModel1 = new DefaultListModel();
        DefaultListModel listModel2 = new DefaultListModel();
        partita.getGiocatore1().getGui().getScrPnlCronologia().setListModel(listModel1);
        partita.getGiocatore2().getGui().getScrPnlCronologia().setListModel(listModel2);
        listModel1.addElement(String.format("    #    |    Your Choice    |    Other Choice    |    Result   "));
        listModel2.addElement(String.format("    #    |    Your Choice    |    Other Choice    |    Result   "));

        for(int roundCorrente = 0; roundCorrente < partita.getNumeroRound(); roundCorrente++)
        {
            Round round = new Round(partita);
            partita.addRound(round);
            
            Ascoltatore ascoltatore1 = new Ascoltatore(partita.getGiocatore1().getGui().getPnlPulsantiera().getBtnCarta(), partita.getGiocatore1().getGui().getPnlPulsantiera().getBtnForbice(), partita.getGiocatore1().getGui().getPnlPulsantiera().getBtnSasso(), partita.getGiocatore1().getGui().getPnlPulsantiera().getBtnRinuncia(), partita.getGiocatore1().getGui().getPnlImmagine(), round.getSceltaGiocatore1());
            partita.getGiocatore1().getGui().getPnlPulsantiera().getBtnCarta().addActionListener(ascoltatore1);
            partita.getGiocatore1().getGui().getPnlPulsantiera().getBtnForbice().addActionListener(ascoltatore1);
            partita.getGiocatore1().getGui().getPnlPulsantiera().getBtnSasso().addActionListener(ascoltatore1);
            partita.getGiocatore1().getGui().getPnlPulsantiera().getBtnRinuncia().addActionListener(ascoltatore1);
            
            Ascoltatore ascoltatore2 = new Ascoltatore(partita.getGiocatore2().getGui().getPnlPulsantiera().getBtnCarta(), partita.getGiocatore2().getGui().getPnlPulsantiera().getBtnForbice(), partita.getGiocatore2().getGui().getPnlPulsantiera().getBtnSasso(), partita.getGiocatore2().getGui().getPnlPulsantiera().getBtnRinuncia(), partita.getGiocatore2().getGui().getPnlImmagine(), round.getSceltaGiocatore2());
            partita.getGiocatore2().getGui().getPnlPulsantiera().getBtnCarta().addActionListener(ascoltatore2);
            partita.getGiocatore2().getGui().getPnlPulsantiera().getBtnForbice().addActionListener(ascoltatore2);
            partita.getGiocatore2().getGui().getPnlPulsantiera().getBtnSasso().addActionListener(ascoltatore2);
            partita.getGiocatore2().getGui().getPnlPulsantiera().getBtnRinuncia().addActionListener(ascoltatore2);
            
            partita.getGiocatore1().getGui().getPnlImmagine().setDefaultLblImmagine();
            partita.getGiocatore2().getGui().getPnlImmagine().setDefaultLblImmagine();
            
            while(round.getSceltaGiocatore1() == null || round.getSceltaGiocatore2() == null)
            {
                if(ascoltatore1.getScelta() != null && round.getSceltaGiocatore1() == null)
                    round.setSceltaGiocatore1(ascoltatore1.getScelta());
                if(ascoltatore2.getScelta() != null && round.getSceltaGiocatore2() == null)
                    round.setSceltaGiocatore2(ascoltatore2.getScelta());
            }
            
            if(round.getVincitore() == null)
            {
                listModel1.addElement(Cronologia.getEntry(roundCorrente, round.getSceltaGiocatore1(), round.getSceltaGiocatore2(), "Draw"));
                listModel2.addElement(Cronologia.getEntry(roundCorrente, round.getSceltaGiocatore2(), round.getSceltaGiocatore1(), "Draw"));
            }
            else if(round.getVincitore().getNome().equals(partita.getGiocatore1().getNome()))
            {
                listModel1.addElement(Cronologia.getEntry(roundCorrente, round.getSceltaGiocatore1(), round.getSceltaGiocatore2(), "Won"));
                listModel2.addElement(Cronologia.getEntry(roundCorrente, round.getSceltaGiocatore2(), round.getSceltaGiocatore1(), "Lost"));
            }
            else if(round.getVincitore().getNome().equals(partita.getGiocatore2().getNome()))
            {
                listModel1.addElement(Cronologia.getEntry(roundCorrente, round.getSceltaGiocatore1(), round.getSceltaGiocatore2(), "Lost"));
                listModel2.addElement(Cronologia.getEntry(roundCorrente, round.getSceltaGiocatore2(), round.getSceltaGiocatore1(), "Won"));
            }
        }
    }
}