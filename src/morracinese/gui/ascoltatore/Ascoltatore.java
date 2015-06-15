package morracinese.gui.ascoltatore;

import java.awt.event.*;
import javax.swing.*;
import morracinese.engine.partita.round.*;
import morracinese.gui.*;

/**
 *
 * @author Alex Miccio, Simone Raichini
 */
public class Ascoltatore implements ActionListener
{
    private JButton btnCarta;
    private JButton btnForbice;
    private JButton btnSasso;
    private JButton btnRinuncia;
    private Immagine pnlImmagine;
    private Scelta scelta;

    public Ascoltatore(JButton btnCarta, JButton btnForbice, JButton btnSasso, JButton btnRinuncia, Immagine pnlImmagine, Scelta scelta)
    {
        if(btnCarta == null)
            throw new IllegalArgumentException("BtnCarta cannot be null");
        this.btnCarta = btnCarta;
        if(btnForbice == null)
            throw new IllegalArgumentException("BtnForbice cannot be null");
        this.btnForbice = btnForbice;
        if(btnSasso == null)
            throw new IllegalArgumentException("BtnSasso cannot be null");
        this.btnSasso = btnSasso;
        if(btnRinuncia == null)
            throw new IllegalArgumentException("BtnRinuncia cannot be null");
        this.btnRinuncia = btnRinuncia;
        if(pnlImmagine == null)
            throw new IllegalArgumentException("PnlImmagine cannot be null");
        this.pnlImmagine = pnlImmagine;
        this.scelta = scelta;
    }

    @Override public void actionPerformed(ActionEvent actionEvent)
    {
        if(actionEvent.getSource() == this.btnCarta)
        {
            this.pnlImmagine.setLblImmagine(Scelta.CARTA);
            this.scelta = Scelta.CARTA;
        }
        if(actionEvent.getSource() == this.btnForbice)
        {
            this.pnlImmagine.setLblImmagine(Scelta.FORBICE);
            this.scelta = Scelta.FORBICE;
        }
        if(actionEvent.getSource() == this.btnSasso)
        {
            this.pnlImmagine.setLblImmagine(Scelta.SASSO);
            this.scelta = Scelta.SASSO;
        }
        if(actionEvent.getSource() == this.btnRinuncia)
        {
            
        }
    }
    
    public Scelta getScelta()
    {
        return this.scelta;
    }
}