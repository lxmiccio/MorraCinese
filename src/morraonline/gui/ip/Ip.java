package morraonline.gui.ip;

import javax.swing.*;

/**
 *
 * @author Alex
 */
public class Ip extends JFrame
{
    private Form pnlForm;
    private JButton btnNext;
    
    public Ip()
    {
        this.pnlForm = new Form();
        this.btnNext = new JButton("Avanti");
        AscoltatoreIp listener = new AscoltatoreIp(this.pnlForm.getCmbByte1(), this.pnlForm.getCmbByte2(), this.pnlForm.getCmbByte3(), this.pnlForm.getCmbByte4(), this.pnlForm.getCmbPort(), this.btnNext);
        this.btnNext.addActionListener(listener);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(this.pnlForm, 205, 205, 205)
                    .addComponent(this.btnNext, 205, 205, 205))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(this.pnlForm, 128, 128, 128)
                .addGap(20, 20, 20)
                .addComponent(this.btnNext, 23, 23, 23)
                .addGap(20, 20, 20))
        );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Morra Cinese");
        this.setVisible(true);
        this.pack();
    }
}