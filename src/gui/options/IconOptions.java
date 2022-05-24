package gui.options;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * @author murat
 */
public class IconOptions {

    private static Icon originalIcon;

    public static void changeIcon(JLabel label, String fileName) {
        originalIcon = label.getIcon();
        label.setIcon(new ImageIcon(Package.getPackages().getClass().getResource("/gui/iconlar/"+fileName+".png")));
    }
    
    public static void setOriginalIcon(JLabel label) {
        label.setIcon(originalIcon);
    }

}
