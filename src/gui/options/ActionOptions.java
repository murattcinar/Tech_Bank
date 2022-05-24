package gui.options;

import javax.swing.JFrame;

/**
 *
 * @author murat
 */
public class ActionOptions {
    public static void setVisible(JFrame oldFrame,JFrame newFrame){
        oldFrame.setVisible(false);
        newFrame.setVisible(true);
    }
}
