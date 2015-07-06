package morraonline;

import javax.swing.*;
import morraonline.gui.ip.*;

/**
 *
 * @author Alex
 */
public class MorraOnline
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
    {
        for (UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            if ("Windows".equals(info.getName()))
            {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        MorraOnline.ip();
    }
    
    public static void ip()
    {
        new Ip().setVisible(true);
    }
    
    public static void mode(String ip, int port)
    {
        System.out.print(ip + ", " + port);
    }
}
