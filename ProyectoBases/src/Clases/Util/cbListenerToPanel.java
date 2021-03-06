/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 *
 * @author Clases
 */
public class cbListenerToPanel implements ActionListener{

    private JPanel panel;
    private int filas;
    
    public cbListenerToPanel(JPanel panel) {
        this.panel = panel;
        panel.setLayout(new SpringLayout());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "comboBoxChanged":{
                JComboBox box = (JComboBox) e.getSource();
                int index = box.getSelectedIndex();

                String text = (String) box.getModel().getElementAt(index);
                ClosableLabel clabel = new ClosableLabel(text);
                panel.add(clabel);
                
                if(panel.getComponentCount()%2 == 0){
                    ++filas;
                    SpringUtilities.makeCompactGrid(panel, filas, 2, 6, 6, 6, 6);
                }
                panel.revalidate();
                panel.repaint();    
            }break;
        }
    }
    public ArrayList<String> getNameLabelsPanel(){
        ArrayList<String> model = new ArrayList<>();
        for(int i = 0; i < panel.getComponentCount(); i++){
            ClosableLabel label;
            label = (ClosableLabel) panel.getComponent(i);
            String txt = label.getLbltext().getText();
            if(!txt.isEmpty())
                model.add(txt);
        }
        return model;
    }
}
