/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.view;

import QATracker.business.UsuarioBusiness;
import QATracker.domain.Usuario;
import static QATracker.view.QATracker.menuSesion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JMenu;

/**
 *
 * @author Michelle
 */
public class LogIn extends javax.swing.JInternalFrame {

    /**
     * Creates new form LogIn
     */
    
    public LogIn() {
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

        txtUserName = new javax.swing.JTextField();
        lbUserName = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        btLogIn = new javax.swing.JButton();
        passPassword = new javax.swing.JPasswordField();

        lbUserName.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(0, 51, 204));
        lbUserName.setText("UserName:");

        lbPassword.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(0, 51, 255));
        lbPassword.setText("Password:");

        btLogIn.setText("Log In");
        btLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogInActionPerformed(evt);
            }
        });

        passPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbPassword)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(passPassword))
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(btLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPassword)
                            .addComponent(passPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passPasswordActionPerformed

    private void btLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogInActionPerformed
        try {
            // TODO add your handling code here:
            Usuario usuario= new Usuario();
            usuario.setDescripcionUsuario(txtUserName.getText());
            //JOptionPane.showMessageDialog(rootPane, txtUserName.getText());
            usuario.setClave(passPassword.getText());
            QATracker.usuarioBus.login(usuario);
            QATracker.usuarioBus.setUsuarioActual(usuario);
            JOptionPane.showMessageDialog(rootPane, "Bienvenido usuario " + usuario.getDescripcionUsuario(), "Inicio", JOptionPane.PLAIN_MESSAGE);
            menuSesion.setText("Usuario conectado: "+usuario.getDescripcionUsuario() + ". Puesto: " + usuario.getPuesto() + ". ");
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_btLogInActionPerformed

    public JTextField getTxtUserName() {
        return txtUserName;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogIn;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JPasswordField passPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
