package gui.options;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TextOptions {

    /**
     * text odaklanma
     */
    private static String originalText;
    private static Color originalFgColor;

    //bos olan kutuya tiklandiginda metni yok eder
    public static void checkTheTextFocusGained(JTextField textField, String org) {
        originalText = org;

        if (textField.getText().trim().equals(org)) {
            originalFgColor = textField.getForeground();
            textField.setText("");
        }
        textField.setForeground(Color.BLACK);
    }

    //labelden cikis yapilinca metni yazar
    public static void checkTheTextFocusLost(JTextField textField) {
        if (textField.getText().trim().equals("")) {
            textField.setText(originalText);
            textField.setForeground(originalFgColor);
        }
    }

    //key ayarlari
    public static void setOnlyNumber(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {

            //klavyeden girilen karekterin kontrolu yapilir
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                //isDigit girilen karakterin rakam oldugununa bakar
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }

        });
    }

    public static void setOnlyAlphabetic(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {

            //klavyeden girilen karekterin kontrolu yapilir
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                //isDigit girilen karakterin rakam oldugununa bakar
                if (!Character.isAlphabetic(c) && c != KeyEvent.VK_SPACE) {
                    e.consume();
                }
            }

        });
    }

    /*
     *limit ayarları
     */
    private static int limit;

    public static void setMaxLimit(JTextField textField, int lim) {
        limit = lim;
        textField.setDocument(new PlainDocument() {

            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null) {
                    return;
                }
                if ((getLength() + str.length()) <= limit) {

                    super.insertString(offs, str, a);
                }
            }
        });
    }
    
    public static boolean uzunlukSundanKucukMu(int length, String str) {
        return (str.length() < length);
    }

    /**
     * para ayarları
     * @param textField
     * @param moneyLimit
     * @return 
     */
    public static int checkTheTextKeyReleased(JTextField textField, int moneyLimit) {
        String text = textField.getText();
        if (!text.equals("")) {
            int miktar = Integer.valueOf(text);
            if (miktar > moneyLimit) {
                miktar = moneyLimit;
                textField.setText(String.valueOf(miktar));
            }
            return miktar;
        }
        return 0;
    }
    
    //text alanlari kontrolu 
    public static boolean textAlanlariDolumu(JPanel panel) {
        Component[] components = panel.getComponents();
        for (Component c : components) {
            if(c instanceof JTextField) {
                JTextField textField = (JTextField) c;
                if(textField.getText().trim().equals("") && textField.isEnabled()){
                    return false;
               }
            }
        }
        return true;
    }
}
