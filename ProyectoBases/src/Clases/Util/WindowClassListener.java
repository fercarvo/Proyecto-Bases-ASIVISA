/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Util;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Clases
 */
public class WindowClassListener extends WindowAdapter{
    
    @Override
    public void windowClosing(WindowEvent e){
        //e.getWindow().removeAll();
        System.exit(0);
    }
    @Override
    public void windowClosed(WindowEvent e){
        e.getWindow().dispose();
    }
    @Override
    public void windowGainedFocus(WindowEvent e){
        e.getWindow().revalidate();
        e.getWindow().repaint();
    }
}