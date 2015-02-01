/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesAdministrador.ingresoDatos;

import Clases.InterfaceMethods.ConnectDbInterface;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JComboBox;

/**
 *
 * @author Clases
 */
public class membresiaNuevoPanel extends javax.swing.JPanel implements ConnectDbInterface{

    private final double costoMensual = 30.0;
    private final double costoTrimensual = 70.0;
    private final double costoSemestral = 120.0;
    private final double costoAnual = 240.0;
    private Calendar cal;
    private DateFormat formatCalendar;
    /**
     * Creates new form membresiaNuevoPanel
     */
    public membresiaNuevoPanel() {
        formatCalendar = new SimpleDateFormat("dd/MM/yyyy");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbTIpoMembresia = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIniMemb = new javax.swing.JTextField();
        txtFinalMemb = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        jLabel1.setLabelFor(cbTIpoMembresia);
        jLabel1.setText("<html> Escoja un tipo de membresia </html>");

        cbTIpoMembresia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mensual", "Trimestral", "Semestral", "Anual" }));
        cbTIpoMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTIpoMembresiaActionPerformed(evt);
            }
        });

        jLabel2.setLabelFor(txtCosto);
        jLabel2.setText("Costo de membresia");

        txtCosto.setEditable(false);

        jLabel3.setLabelFor(txtIniMemb);
        jLabel3.setText("<html> Fecha Inicial de Membresia </html>");

        jLabel4.setLabelFor(txtFinalMemb);
        jLabel4.setText("Fecha Final de Membresia");

        txtIniMemb.setEditable(false);

        txtFinalMemb.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTIpoMembresia, 0, 306, Short.MAX_VALUE)
                    .addComponent(txtCosto)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIniMemb)
                    .addComponent(txtFinalMemb)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTIpoMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIniMemb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFinalMemb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbTIpoMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTIpoMembresiaActionPerformed
        // TODO add your handling code here:
        JComboBox box = (JComboBox) evt.getSource();
        int index = box.getSelectedIndex();

        String text = (String) box.getModel().getElementAt(index);
        switch (text){
            case "Mensual":{
                txtCosto.setText(String.valueOf(costoMensual));
                cal = new GregorianCalendar();
                txtIniMemb.setText(formatCalendar.format(cal.getTime()));
                cal.add(Calendar.MONTH, 1);
                txtFinalMemb.setText(formatCalendar.format(cal.getTime()));
            }break;
            case "Trimestral":{
                txtCosto.setText(String.valueOf(costoTrimensual));
                cal = new GregorianCalendar();
                txtIniMemb.setText(formatCalendar.format(cal.getTime()));
                cal.add(Calendar.MONTH, 3);
                txtFinalMemb.setText(formatCalendar.format(cal.getTime()));
            }break;
            case "Semestral":{
                txtCosto.setText(String.valueOf(costoSemestral));
                cal = new GregorianCalendar();
                txtIniMemb.setText(formatCalendar.format(cal.getTime()));
                cal.add(Calendar.MONTH, 6);
                txtFinalMemb.setText(formatCalendar.format(cal.getTime()));
            }break;
            case "Anual":{
                txtCosto.setText(String.valueOf(costoAnual));
                cal = new GregorianCalendar();
                txtIniMemb.setText(formatCalendar.format(cal.getTime()));
                cal.add(Calendar.YEAR, 1);
                txtFinalMemb.setText(formatCalendar.format(cal.getTime()));
            }break;
        }
    }//GEN-LAST:event_cbTIpoMembresiaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbTIpoMembresia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtFinalMemb;
    private javax.swing.JTextField txtIniMemb;
    // End of variables declaration//GEN-END:variables

    @Override
    public boolean verificarEscrituraDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean escribirDatosDB() {
        return true;
    }

    @Override
    public boolean verificarLecturaDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean leerDatosDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
