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
import javax.swing.JOptionPane;

/**
 *
 * @author Michelle
 */
public class CrearProyecto extends javax.swing.JInternalFrame {

    /**
     * Creates new form CrearProyecto
     */
    public CrearProyecto() {
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

        lbDescripcion = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        lbFechaInicio = new javax.swing.JLabel();
        lbFechaFinal = new javax.swing.JLabel();
        btCrear = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        txtFechaInicio = new javax.swing.JTextField();
        txtFechaFinal = new javax.swing.JTextField();
        comboEstado9 = new javax.swing.JComboBox();

        setPreferredSize(new java.awt.Dimension(600, 600));

        lbDescripcion.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        lbDescripcion.setText("Descripcion:");

        lbEstado.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        lbEstado.setText("Estado:");

        lbFechaInicio.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        lbFechaInicio.setText("Fecha de Inicio:");

        lbFechaFinal.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        lbFechaFinal.setText("Fecha Final:");

        btCrear.setText("Crear");
        btCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearActionPerformed(evt);
            }
        });

        comboEstado9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1. Entregado", "2. Pendiente", "3. Reprocesando" }));
        comboEstado9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstado9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbDescripcion)
                                .addGap(43, 43, 43)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbFechaInicio)
                                    .addComponent(lbFechaFinal))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaInicio)
                                    .addComponent(txtFechaFinal)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbEstado)
                        .addGap(78, 78, 78)
                        .addComponent(comboEstado9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstado)
                    .addComponent(comboEstado9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFechaInicio)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFechaFinal)
                    .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboEstado9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstado9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstado9ActionPerformed

    private void btCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearActionPerformed
        try {
            // TODO add your handling code here:
            Proyecto proyecto= new Proyecto();
            proyecto.setDescripcionProyecto(txtDescripcion.getText());
            proyecto.setEstadoProyecto(comboEstado9.getSelectedIndex()+1);
            proyecto.setFechafinal(Date.valueOf(txtFechaFinal.getText()));
            proyecto.setFechainicio(Date.valueOf(txtFechaInicio.getText()));
            QATracker.proyectoBus.crear(proyecto);
            JOptionPane.showMessageDialog(rootPane, "El proyecto ha sido agregado", "Exito", JOptionPane.OK_OPTION);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        this.setVisible(false);
    }//GEN-LAST:event_btCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCrear;
    private javax.swing.JComboBox comboEstado9;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbFechaFinal;
    private javax.swing.JLabel lbFechaInicio;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFechaFinal;
    private javax.swing.JTextField txtFechaInicio;
    // End of variables declaration//GEN-END:variables
}
