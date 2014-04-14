/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.view;

import QATracker.domain.Issue;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Michelle
 */
public class ActualizarIssues extends javax.swing.JInternalFrame {

    /**
     * Creates new form ActualizarIssues
     */
    public ActualizarIssues() {
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

        comboEstado = new javax.swing.JComboBox();
        btActualizar = new javax.swing.JButton();
        lbIdTarea = new javax.swing.JLabel();
        txtIdTarea = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        lbDescripcion = new javax.swing.JLabel();
        txtIdIssue = new javax.swing.JTextField();
        lbIdUsuario = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1. Entregado", "2. Pendiente", "3. Reprocesando" }));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });

        btActualizar.setText("Actualizar");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        lbIdTarea.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        lbIdTarea.setForeground(new java.awt.Color(0, 102, 255));
        lbIdTarea.setText("Id del Issue:");

        lbDescripcion.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lbDescripcion.setText("Descripcion:");

        lbIdUsuario.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lbIdUsuario.setText("Id de la Tarea:");

        lbEstado.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lbEstado.setText("Estado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbIdTarea)
                        .addGap(72, 72, 72)
                        .addComponent(txtIdIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbIdUsuario)
                                .addComponent(lbDescripcion))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(lbEstado)))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 76, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIdTarea))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescripcion))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdUsuario)
                    .addComponent(txtIdTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEstado))
                .addGap(52, 52, 52)
                .addComponent(btActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        try {
            // TODO add your handling code here:
            Issue issue= new Issue();
            issue.setDescripcionIssue(txtDescripcion.getText());
            issue.setEstadoIssue(comboEstado.getSelectedIndex()+1);
            issue.setIdIssue(Integer.parseInt(txtIdIssue.getText()));
            issue.setIdTarea(Integer.parseInt(txtIdTarea.getText()));
            QATracker.issueBus.actualizar(issue);
            JOptionPane.showMessageDialog(rootPane, "Se ha actualizado el issue.", "Exito", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        this.setVisible(false);
    }//GEN-LAST:event_btActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JComboBox comboEstado;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbIdTarea;
    private javax.swing.JLabel lbIdUsuario;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdIssue;
    private javax.swing.JTextField txtIdTarea;
    // End of variables declaration//GEN-END:variables
}
