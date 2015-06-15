package morracinese.gui;

import javax.swing.*;
import morracinese.engine.partita.round.Scelta;

/**
 *
 * @author Alex Miccio, Simone Raichini
 */
public class Cronologia extends JScrollPane
{
    private JList lstRound;
    
    public Cronologia()
    {
        this.lstRound = new JList();
        this.setViewportView(lstRound);
    }
    
    public JList getLstRound()
    {
        return this.lstRound;
    }
    
    public void setListModel(DefaultListModel listModel)
    {
        this.lstRound.setModel(listModel);
    }
    
    public static String getEntry(int numeroRound, Scelta sceltaGiocatore1, Scelta sceltaGiocatore2, String risultato)
    {
        return String.format("%5s %19s %21s %17s", Integer.toString(numeroRound), Scelta.toString(sceltaGiocatore1), Scelta.toString(sceltaGiocatore2), risultato);
    }
}