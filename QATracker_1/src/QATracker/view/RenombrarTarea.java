/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.view;

import QATracker.domain.Tarea;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Michelle
 */
public class RenombrarTarea extends javax.swing.JInternalFrame {

    /**
     * Creates new form RenombrarTarea
     */
    public RenombrarTarea() {
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

        txtIdTarea = new javax.swing.JTextField();
        txtNuevoNombre = new javax.swing.JTextField();
        labelTask1 = new org.edisoncor.gui.label.LabelTask();
        labelRound1 = new org.edisoncor.gui.label.LabelRound();
        labelRound2 = new org.edisoncor.gui.label.LabelRound();
        buttonColoredAction1 = new org.edisoncor.gui.button.ButtonColoredAction();

        labelTask1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QATracker/imagenes/1397539638_interact.png"))); // NOI18N
        labelTask1.setText("Renombrar Tarea");
        labelTask1.setDescription(" ");

        labelRound1.setBackground(new java.awt.Color(51, 153, 255));
        labelRound1.setText("Id Tarea");

        labelRound2.setBackground(new java.awt.Color(51, 255, 51));
        labelRound2.setText("Nueva Descripcion");

        buttonColoredAction1.setText("Renombrar");
        buttonColoredAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColoredAction1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonColoredAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(labelTask1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(labelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(labelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTask1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(buttonColoredAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonColoredAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColoredAction1ActionPerformed
        try {
            // TODO add your handling code here:
            Tarea tarea= new Tarea();
            tarea.setIdTarea(Integer.parseInt(txtIdTarea.getText()));
            tarea.setDescripcionTarea(txtNuevoNombre.getText());
            QATracker.tareaBus.renombrar(tarea);
            JOptionPane.showMessageDialog(rootPane, "La tarea ha sido renombrada.", "Exito", JOptionPane.OK_OPTION);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        this.setVisible(false);
    }//GEN-LAST:event_buttonColoredAction1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonColoredAction buttonColoredAction1;
    private org.edisoncor.gui.label.LabelRound labelRound1;
    private org.edisoncor.gui.label.LabelRound labelRound2;
    private org.edisoncor.gui.label.LabelTask labelTask1;
    private javax.swing.JTextField txtIdTarea;
    private javax.swing.JTextField txtNuevoNombre;
    // End of variables declaration//GEN-END:variables
}
