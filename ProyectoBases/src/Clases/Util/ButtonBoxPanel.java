/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Util;

import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Clases
 */
public class ButtonBoxPanel extends JPanel{
   
    private final int hgap = 4;
    private final int vgap = 2;
    
    public ButtonBoxPanel(JButton[] botones,int rows, int cols, int vgap, int hgap) {
        super(new GridLayout(rows, cols, 4, 2));
        for(JButton inicio : botones)
            this.add(inicio);
    }
    
    public ButtonBoxPanel(JButton aceptar, JButton cancelar, JButton ayuda) {
        super(new GridLayout(1, 3, 4, 2));
        this.add(aceptar);
        this.add (cancelar);
        this.add(ayuda);
    }
    
    public ButtonBoxPanel(JButton aceptar, JButton cancelar, JButton ayuda, int rows , int cols) {
        super(new GridLayout(rows, cols, 4, 2));
        this.add(aceptar);
        this.add (cancelar);
        this.add(ayuda);
    }
    
    public ButtonBoxPanel(JButton aceptar, JButton cancelar) {
        super(new GridLayout(1, 2, 4, 2));
        this.add(aceptar);
        this.add (cancelar);
    }
    
    public ButtonBoxPanel(JButton ok) {
        this.add(ok);
    }
}
