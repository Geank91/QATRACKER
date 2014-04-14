/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.view;

import QATracker.domain.Proyecto;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Michelle
 */
public class ActualizarProyecto extends javax.swing.JInternalFrame {

    /**
     * Creates new form ActualizarProyecto
     */
    public ActualizarProyecto() {
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

        lbIdProyecto = new javax.swing.JLabel();
        txtIdProyecto = new javax.swing.JTextField();
        lbDecripcion = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        lbFechaInicio = new javax.swing.JLabel();
        lbFechaFinal = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtFechaInicio = new javax.swing.JTextField();
        txtFehaFinal = new javax.swing.JTextField();
        btActualizar = new javax.swing.JButton();
        comboEstado = new javax.swing.JComboBox();

        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbIdProyecto.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        lbIdProyecto.setForeground(new java.awt.Color(0, 102, 255));
        lbIdProyecto.setText("Id del Proyecto:");
        getContentPane().add(lbIdProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, -1, -1));
        getContentPane().add(txtIdProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 300, -1));

        lbDecripcion.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lbDecripcion.setText("Descripcion:");
        getContentPane().add(lbDecripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 119, -1, -1));

        lbEstado.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lbEstado.setText("Estado:");
        getContentPane().add(lbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 192, -1, -1));

        lbFechaInicio.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lbFechaInicio.setText("Fecha Inicio:");
        getContentPane().add(lbFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 260, -1, -1));

        lbFechaFinal.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lbFechaFinal.setText("Fecha Final:");
        getContentPane().add(lbFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 306, -1, -1));
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 95, 350, 62));
        getContentPane().add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 257, 340, -1));
        getContentPane().add(txtFehaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 350, -1));

        btActualizar.setText("Actualizar");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 140, 50));

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1. Entregado", "2. Pendiente", "3. Reprocesando" }));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 189, 350, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        try {
            // TODO add your handling code here:
            Proyecto proyecto= new Proyecto();
            proyecto.setDescripcionProyecto(txtDescripcion.getText());
            proyecto.setId(Integer.parseInt(txtIdProyecto.getText()));
            proyecto.setEstadoProyecto(comboEstado.getSelectedIndex()+1);
            proyecto.setFechafinal(Date.valueOf(txtFehaFinal.getText()));
            proyecto.setFechainicio(Date.valueOf(txtFechaInicio.getText()));
            QATracker.proyectoBus.actualizar(proyecto);
            JOptionPane.showMessageDialog(rootPane, "El proyecto se ha actualizado.", "Exito!", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(ActualizarProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_btActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JComboBox comboEstado;
    private javax.swing.JLabel lbDecripcion;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbFechaFinal;
    private javax.swing.JLabel lbFechaInicio;
    private javax.swing.JLabel lbIdProyecto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtFehaFinal;
    private javax.swing.JTextField txtIdProyecto;
    // End of variables declaration//GEN-END:variables
}
