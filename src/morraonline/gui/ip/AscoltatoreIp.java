package morraonline.gui.ip;

import java.awt.event.*;
import javax.swing.*;
import morraonline.MorraOnline;

/**
 *
 * @author Alex
 */
public class AscoltatoreIp implements ActionListener
{
    private JComboBox cmbByte1;
    private JComboBox cmbByte2;
    private JComboBox cmbByte3;
    private JComboBox cmbByte4;
    private JComboBox cmbPort;
    private JButton btnNext;

    public AscoltatoreIp(JComboBox cmbByte1, JComboBox cmbByte2, JComboBox cmbByte3, JComboBox cmbByte4, JComboBox cmbPort, JButton btnNext)
    {
        if(cmbByte1 == null)
            throw new IllegalArgumentException("Byte1 cannot be null");
        this.cmbByte1 = cmbByte1;
        if(cmbByte2 == null)
            throw new IllegalArgumentException("Byte2 cannot be null");
        this.cmbByte2 = cmbByte2;
        if(cmbByte3 == null)
            throw new IllegalArgumentException("Byte3 cannot be null");
        this.cmbByte3 = cmbByte3;
        if(cmbByte4 == null)
            throw new IllegalArgumentException("Byte4 cannot be null");
        this.cmbByte4 = cmbByte4;
        if(cmbPort == null)
            throw new IllegalArgumentException("Port cannot be null");
        this.cmbPort = cmbPort;
        if(btnNext == null)
            throw new IllegalArgumentException("Next cannot be null");
        this.btnNext = btnNext;
    }    
    
    @Override public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == this.btnNext)
            MorraOnline.mode(this.cmbByte1.getSelectedItem() + "." + this.cmbByte2.getSelectedItem() + "." + this.cmbByte3.getSelectedItem() + "." + this.cmbByte4.getSelectedItem() , Integer.parseInt(this.cmbPort.getSelectedItem().toString()));
    }
}