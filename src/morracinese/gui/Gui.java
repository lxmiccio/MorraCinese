package morracinese.gui;

import java.awt.*;
import javax.swing.*;
import morracinese.gui.posizione.Posizione;

/**
 *
 * @author Alex Miccio, Simone Raichini
 */
public class Gui extends JFrame
{
    private Immagine pnlImmagine;
    private Pulsantiera pnlPulsantiera;
    private Cronologia scrPnlCronologia;

    public Gui(Posizione posizione)
    {
        if(posizione == null)
            throw new IllegalArgumentException("Posizione cannot be null");
        
        this.pnlImmagine = new Immagine();
        this.pnlPulsantiera = new Pulsantiera();
        this.scrPnlCronologia = new Cronologia();
        
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(this.pnlImmagine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(this.scrPnlCronologia))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(this.pnlPulsantiera, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(this.pnlImmagine, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(this.scrPnlCronologia))
                .addGap(11, 11, 11)
                .addComponent(this.pnlPulsantiera, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        this.pack();
        
        this.setTitle("Morra Cinese");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        if(posizione == Posizione.LEFT)
            this.setLocation(0, 0);
        else if(posizione == Posizione.RIGHT)
            this.setLocation((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth()-this.getWidth(), 0);
        this.setResizable(false);
        this.setVisible(true);
    }

    public Immagine getPnlImmagine()
    {
        return this.pnlImmagine;
    }

    public Pulsantiera getPnlPulsantiera()
    {
        return this.pnlPulsantiera;
    }

    public Cronologia getScrPnlCronologia()
    {
        return this.scrPnlCronologia;
    }
}