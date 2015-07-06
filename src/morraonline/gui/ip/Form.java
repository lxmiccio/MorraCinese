package morraonline.gui.ip;

import javax.swing.*;

/**
 *
 * @author Alex
 */
public class Form extends JPanel
{
    private JLabel lblTypeIp;
    private JComboBox cmbByte1;
    private JLabel lblDot1;
    private JComboBox cmbByte2;
    private JLabel lblDot2;
    private JComboBox cmbByte3;
    private JLabel lblDot3;
    private JComboBox cmbByte4;
    private JLabel lblTypePort;
    private JComboBox cmbPort;

    public Form()
    {
        this.lblTypeIp = new JLabel("Inserire l'indirizzo Ip dell'avversario");
        this.lblTypeIp.setHorizontalAlignment(SwingConstants.CENTER);
        DefaultComboBoxModel modelCmbByte1 = new DefaultComboBoxModel();
        this.cmbByte1 = new JComboBox(modelCmbByte1);
        this.lblDot1 = new JLabel(".");
        DefaultComboBoxModel modelCmbByte2 = new DefaultComboBoxModel();
        this.cmbByte2 = new JComboBox(modelCmbByte2);
        this.lblDot2 = new JLabel(".");
        DefaultComboBoxModel modelCmbByte3 = new DefaultComboBoxModel();
        this.cmbByte3 = new JComboBox(modelCmbByte3);
        this.lblDot3 = new JLabel(".");
        DefaultComboBoxModel modelCmbByte4 = new DefaultComboBoxModel();
        this.cmbByte4 = new JComboBox(modelCmbByte4);
        this.lblTypePort = new JLabel("Inserire la porta");
        this.lblTypePort.setHorizontalAlignment(SwingConstants.CENTER);
        DefaultComboBoxModel modelCmbPort = new DefaultComboBoxModel();
        this.cmbPort = new JComboBox(modelCmbPort);
        for(int iterator = 0; iterator < 65536; iterator++)
        {
            if(iterator < 256)
            {
                modelCmbByte1.addElement(iterator);
                modelCmbByte2.addElement(iterator);
                modelCmbByte3.addElement(iterator);
                modelCmbByte4.addElement(iterator);
            }
            modelCmbPort.addElement(iterator);
        }
        GroupLayout layout =  new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(this.lblTypeIp, 202, 202, 202)
            .addGroup(layout.createSequentialGroup()
                .addComponent(this.cmbByte1, 43, 43, 43)
                .addGap(3, 3, 3)
                .addComponent(this.lblDot1, 4, 4, 4)
                .addGap(3, 3, 3)
                .addComponent(this.cmbByte2, 43, 43, 43)
                .addGap(3, 3, 3)
                .addComponent(this.lblDot2, 4, 4, 4)
                .addGap(3, 3, 3)
                .addComponent(this.cmbByte3, 43, 43, 43)
                .addGap(3, 3, 3)
                .addComponent(this.lblDot3, 4, 4, 4)
                .addGap(3, 3, 3)
                .addComponent(this.cmbByte4, 43, 43, 43)
                .addGap(0, 0, 0))
            .addComponent(this.lblTypePort, 202, 202, 202)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(this.cmbPort, 65, 65, 65)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(this.lblTypeIp, 14, 14, 14)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(this.cmbByte1, 20, 20, 20)
                    .addComponent(this.lblDot1, 14, 14, 14)
                    .addComponent(this.cmbByte2, 20, 20, 20)
                    .addComponent(this.lblDot2, 14, 14, 14)
                    .addComponent(this.cmbByte3, 20, 20, 20)
                    .addComponent(this.lblDot3, 14, 14, 14)
                    .addComponent(this.cmbByte4, 20, 20, 20))
                .addGap(20, 20, 20)
                .addComponent(this.lblTypePort, 14, 14, 14)
                .addGap(20, 20, 20)
                .addComponent(this.cmbPort, 20, 20, 20)
                .addGap(0, 0, 0))
        );
    }

    public JComboBox getCmbByte1()
    {
        return this.cmbByte1;
    }

    public JComboBox getCmbByte2()
    {
        return this.cmbByte2;
    }

    public JComboBox getCmbByte3()
    {
        return this.cmbByte3;
    }

    public JComboBox getCmbByte4()
    {
        return this.cmbByte4;
    }

    public JComboBox getCmbPort()
    {
        return this.cmbPort;
    }
}