package morracinese.gui;

import morracinese.engine.partita.round.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 *
 * @author Alex Miccio, Simone Raichini
 */
public class Immagine extends JPanel
{
    private BufferedImage imgCarta;
    private BufferedImage imgForbice;
    private BufferedImage imgSasso;
    private BufferedImage imgPuntoInterrogativo;
    private JLabel lblImmagine;
    
    public Immagine()
    {
        try
        {
            this.imgCarta = ImageIO.read(new File("img/Carta.png"));
            this.imgForbice = ImageIO.read(new File("img/Forbice.png"));
            this.imgSasso = ImageIO.read(new File("img/Sasso.png"));
            this.imgPuntoInterrogativo = ImageIO.read(new File("img/PuntoInterrogativo.png"));
            this.lblImmagine = new JLabel();
        }
        catch(IOException exception)
        {
            System.err.println("Cannot load images");
        }
        
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(this.lblImmagine, 100, 100, 100)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(this.lblImmagine, 160, 160, 160)
        );
    }
    
    public void setDefaultLblImmagine()
    {
        this.lblImmagine.setIcon(new ImageIcon(this.imgPuntoInterrogativo));
    }
    
    public void setLblImmagine(Scelta scelta)
    {
        if(scelta == null)
            throw new IllegalArgumentException("Scelta cannot be null");
        if(scelta == Scelta.CARTA)
            this.lblImmagine.setIcon(new ImageIcon(this.imgCarta));
        if(scelta == Scelta.FORBICE)
            this.lblImmagine.setIcon(new ImageIcon(this.imgForbice));
        if(scelta == Scelta.SASSO)
            this.lblImmagine.setIcon(new ImageIcon(this.imgSasso));
    }
}