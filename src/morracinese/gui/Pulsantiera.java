package morracinese.gui;

import javax.swing.*;

/**
 *
 * @author Alex Miccio, Simone Raichini
 */
public class Pulsantiera extends JPanel
{
    private JButton btnCarta;
    private JButton btnForbice;
    private JButton btnRinuncia;
    private JButton btnSasso;

    public Pulsantiera()
    {
        this.btnCarta = new JButton("Carta");
        this.btnForbice = new JButton("Forbice");
        this.btnSasso = new JButton("Sasso");
        this.btnRinuncia = new JButton("Rinuncia");
        
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(this.btnCarta, 80, 80, 80)
                .addGap(20, 20, 20)
                .addComponent(this.btnForbice, 80, 80, 80)
                .addGap(20, 20, 20)
                .addComponent(this.btnSasso, 80, 80, 80)
                .addGap(20, 20, 20)
                .addComponent(this.btnRinuncia, 80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(this.btnRinuncia, 23, 23, 23)
                    .addComponent(this.btnSasso, 23, 23, 23)
                    .addComponent(this.btnForbice, 23, 23, 23)
                    .addComponent(this.btnCarta, 23, 23, 23)))
        );
    }

    public JButton getBtnCarta()
    {
        return this.btnCarta;
    }

    public JButton getBtnForbice()
    {
        return this.btnForbice;
    }

    public JButton getBtnSasso()
    {
        return this.btnSasso;
    }
    
    public JButton getBtnRinuncia()
    {
        return this.btnRinuncia;
    }
}