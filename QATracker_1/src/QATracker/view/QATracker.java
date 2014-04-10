/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.view;

/**
 *
 * @author Michelle
 */
public class QATracker extends javax.swing.JFrame {

    /**
     * Creates new form QATracker
     */
    public QATracker() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        menuBar1 = new javax.swing.JMenuBar();
        menuStart = new javax.swing.JMenu();
        menuItemLogInInicio = new javax.swing.JMenuItem();
        menuItemSignOutInicio = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        menuProyectos = new javax.swing.JMenu();
        menuItemConsultaProyectos = new javax.swing.JMenuItem();
        menuMantenimientoProyectos = new javax.swing.JMenu();
        menuItemActualizrMantenimientoProyectos = new javax.swing.JMenuItem();
        menuItemBorrarMantenimientoProyectos = new javax.swing.JMenuItem();
        menuItemCrearMantenimientoProyectos = new javax.swing.JMenuItem();
        menuItemLeerMantenimientoProyectos = new javax.swing.JMenuItem();
        menuTareas = new javax.swing.JMenu();
        menuItemConsultaTareas = new javax.swing.JMenuItem();
        menuMantenimientoTareas = new javax.swing.JMenu();
        menuItemActualizarMantenimientoTareas = new javax.swing.JMenuItem();
        menuItemCrearMantenimientoTareas = new javax.swing.JMenuItem();
        menuItemRenombrarMantenimientoTareas = new javax.swing.JMenuItem();
        menuIssues = new javax.swing.JMenu();
        menuItemConsultaIssues = new javax.swing.JMenuItem();
        menuMantenimientoIssues = new javax.swing.JMenu();
        menuItemActualizarMantenimientoIssues = new javax.swing.JMenuItem();
        menuItemCrearMantenimientoIssues = new javax.swing.JMenuItem();
        menuItemLeerMantenimientoIssues = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 1000));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        menuStart.setText("Start");

        menuItemLogInInicio.setText("Log in");
        menuItemLogInInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLogInInicioActionPerformed(evt);
            }
        });
        menuStart.add(menuItemLogInInicio);

        menuItemSignOutInicio.setText("Sign out");
        menuStart.add(menuItemSignOutInicio);

        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        menuStart.add(menuItemExit);

        menuBar1.add(menuStart);

        menuProyectos.setText("Proyectos");

        menuItemConsultaProyectos.setText("Consulta");
        menuProyectos.add(menuItemConsultaProyectos);

        menuMantenimientoProyectos.setText("Mantenimiento");

        menuItemActualizrMantenimientoProyectos.setText("Actualizar");
        menuItemActualizrMantenimientoProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizrMantenimientoProyectosActionPerformed(evt);
            }
        });
        menuMantenimientoProyectos.add(menuItemActualizrMantenimientoProyectos);

        menuItemBorrarMantenimientoProyectos.setText("Borrar");
        menuItemBorrarMantenimientoProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBorrarMantenimientoProyectosActionPerformed(evt);
            }
        });
        menuMantenimientoProyectos.add(menuItemBorrarMantenimientoProyectos);

        menuItemCrearMantenimientoProyectos.setText("Crear");
        menuItemCrearMantenimientoProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearMantenimientoProyectosActionPerformed(evt);
            }
        });
        menuMantenimientoProyectos.add(menuItemCrearMantenimientoProyectos);

        menuItemLeerMantenimientoProyectos.setText("Leer");
        menuItemLeerMantenimientoProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLeerMantenimientoProyectosActionPerformed(evt);
            }
        });
        menuMantenimientoProyectos.add(menuItemLeerMantenimientoProyectos);

        menuProyectos.add(menuMantenimientoProyectos);

        menuBar1.add(menuProyectos);

        menuTareas.setText("Tareas");

        menuItemConsultaTareas.setText("Consulta");
        menuTareas.add(menuItemConsultaTareas);

        menuMantenimientoTareas.setText("Mantenimiento");

        menuItemActualizarMantenimientoTareas.setText("Actualizar");
        menuItemActualizarMantenimientoTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarMantenimientoTareasActionPerformed(evt);
            }
        });
        menuMantenimientoTareas.add(menuItemActualizarMantenimientoTareas);

        menuItemCrearMantenimientoTareas.setText("Crear");
        menuItemCrearMantenimientoTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearMantenimientoTareasActionPerformed(evt);
            }
        });
        menuMantenimientoTareas.add(menuItemCrearMantenimientoTareas);

        menuItemRenombrarMantenimientoTareas.setText("Renombrar");
        menuItemRenombrarMantenimientoTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRenombrarMantenimientoTareasActionPerformed(evt);
            }
        });
        menuMantenimientoTareas.add(menuItemRenombrarMantenimientoTareas);

        menuTareas.add(menuMantenimientoTareas);

        menuBar1.add(menuTareas);

        menuIssues.setText("Issues");

        menuItemConsultaIssues.setText("Consulta");
        menuIssues.add(menuItemConsultaIssues);

        menuMantenimientoIssues.setText("Mantenimiento");

        menuItemActualizarMantenimientoIssues.setText("Actualizar");
        menuItemActualizarMantenimientoIssues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarMantenimientoIssuesActionPerformed(evt);
            }
        });
        menuMantenimientoIssues.add(menuItemActualizarMantenimientoIssues);

        menuItemCrearMantenimientoIssues.setText("Crear");
        menuItemCrearMantenimientoIssues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearMantenimientoIssuesActionPerformed(evt);
            }
        });
        menuMantenimientoIssues.add(menuItemCrearMantenimientoIssues);

        menuItemLeerMantenimientoIssues.setText("Leer");
        menuItemLeerMantenimientoIssues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLeerMantenimientoIssuesActionPerformed(evt);
            }
        });
        menuMantenimientoIssues.add(menuItemLeerMantenimientoIssues);

        menuIssues.add(menuMantenimientoIssues);

        menuBar1.add(menuIssues);

        setJMenuBar(menuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void menuItemLogInInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLogInInicioActionPerformed
        // TODO add your handling code here:
        LogIn login= new LogIn();
        login.setVisible(true);
        login.setTitle("Iniciar Sesion");
        login.setClosable(true);
        login.setMaximizable(true);
        login.setResizable(true);
        jDesktopPane1.add(login);
    }//GEN-LAST:event_menuItemLogInInicioActionPerformed

    private void menuItemActualizrMantenimientoProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizrMantenimientoProyectosActionPerformed
        // TODO add your handling code here:
        ActualizarProyecto actualizar= new ActualizarProyecto();
        actualizar.setVisible(true);
        actualizar.setTitle("Actualizar Proyecto");
        actualizar.setMaximizable(true);
        actualizar.setClosable(true);
        actualizar.setResizable(true);
        jDesktopPane1.add(actualizar);
    }//GEN-LAST:event_menuItemActualizrMantenimientoProyectosActionPerformed

    private void menuItemCrearMantenimientoProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearMantenimientoProyectosActionPerformed
        // TODO add your handling code here:
        CrearProyecto crear= new CrearProyecto();
        crear.setVisible(true);
        crear.setTitle("Crear Proyecto");
        crear.setResizable(true);
        crear.setClosable(true);
        crear.setMaximizable(true);
        jDesktopPane1.add(crear);
    }//GEN-LAST:event_menuItemCrearMantenimientoProyectosActionPerformed

    private void menuItemBorrarMantenimientoProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBorrarMantenimientoProyectosActionPerformed
        // TODO add your handling code here:
        BorrarProyecto borrar= new BorrarProyecto();
        borrar.setVisible(true);
        borrar.setTitle("Borrar Proyecto");
        borrar.setClosable(true);
        borrar.setMaximizable(true);
        borrar.setResizable(true);
        jDesktopPane1.add(borrar);
    }//GEN-LAST:event_menuItemBorrarMantenimientoProyectosActionPerformed

    private void menuItemLeerMantenimientoProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLeerMantenimientoProyectosActionPerformed
        // TODO add your handling code here:
        LeerProyecto lerr= new LeerProyecto();
        lerr.setVisible(true);
        lerr.setTitle("Leer Proyecto");
        lerr.setClosable(true);
        lerr.setMaximizable(true);
        lerr.setResizable(true);
        jDesktopPane1.add(lerr);
    }//GEN-LAST:event_menuItemLeerMantenimientoProyectosActionPerformed

    private void menuItemActualizarMantenimientoTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarMantenimientoTareasActionPerformed
        // TODO add your handling code here:
        ActualizarTarea actualizar= new ActualizarTarea();
        actualizar.setVisible(true);
        actualizar.setTitle("Actualizar Tarea");
        actualizar.setClosable(true);
        actualizar.setMaximizable(true);
        actualizar.setResizable(true);
        jDesktopPane1.add(actualizar);
    }//GEN-LAST:event_menuItemActualizarMantenimientoTareasActionPerformed

    private void menuItemCrearMantenimientoTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearMantenimientoTareasActionPerformed
        // TODO add your handling code here:
        CrearTarea crear= new CrearTarea();
        crear.setVisible(true);
        crear.setTitle("Crear Tarea");
        crear.setClosable(true);
        crear.setMaximizable(true);
        crear.setResizable(true);
        jDesktopPane1.add(crear);
    }//GEN-LAST:event_menuItemCrearMantenimientoTareasActionPerformed

    private void menuItemRenombrarMantenimientoTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRenombrarMantenimientoTareasActionPerformed
        // TODO add your handling code here:
        RenombrarTarea rename= new RenombrarTarea();
        rename.setVisible(true);
        rename.setTitle("Renombrar Tarea");
        rename.setClosable(true);
        rename.setMaximizable(true);
        rename.setResizable(true);
        jDesktopPane1.add(rename);
    }//GEN-LAST:event_menuItemRenombrarMantenimientoTareasActionPerformed

    private void menuItemActualizarMantenimientoIssuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarMantenimientoIssuesActionPerformed
        // TODO add your handling code here:
        ActualizarIssues actualizar= new ActualizarIssues();
        actualizar.setVisible(true);
        actualizar.setTitle("Actualizar Issue");
        actualizar.setClosable(true);
        actualizar.setMaximizable(true);
        actualizar.setResizable(true);
        jDesktopPane1.add(actualizar);
    }//GEN-LAST:event_menuItemActualizarMantenimientoIssuesActionPerformed

    private void menuItemCrearMantenimientoIssuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearMantenimientoIssuesActionPerformed
        // TODO add your handling code here:
        CrearIssue crear= new CrearIssue();
        crear.setVisible(true);
        crear.setTitle("Crear Issue");
        crear.setClosable(true);
        crear.setMaximizable(true);
        crear.setResizable(true);
        jDesktopPane1.add(crear);
    }//GEN-LAST:event_menuItemCrearMantenimientoIssuesActionPerformed

    private void menuItemLeerMantenimientoIssuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLeerMantenimientoIssuesActionPerformed
        // TODO add your handling code here:
        LeerIssue leer= new LeerIssue();
        leer.setVisible(true);
        leer.setTitle("Leer Issue");
        leer.setClosable(true);
        leer.setMaximizable(true);
        leer.setResizable(true);
        jDesktopPane1.add(leer);
    }//GEN-LAST:event_menuItemLeerMantenimientoIssuesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QATracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QATracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QATracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QATracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QATracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar menuBar1;
    private javax.swing.JMenu menuIssues;
    private javax.swing.JMenuItem menuItemActualizarMantenimientoIssues;
    private javax.swing.JMenuItem menuItemActualizarMantenimientoTareas;
    private javax.swing.JMenuItem menuItemActualizrMantenimientoProyectos;
    private javax.swing.JMenuItem menuItemBorrarMantenimientoProyectos;
    private javax.swing.JMenuItem menuItemConsultaIssues;
    private javax.swing.JMenuItem menuItemConsultaProyectos;
    private javax.swing.JMenuItem menuItemConsultaTareas;
    private javax.swing.JMenuItem menuItemCrearMantenimientoIssues;
    private javax.swing.JMenuItem menuItemCrearMantenimientoProyectos;
    private javax.swing.JMenuItem menuItemCrearMantenimientoTareas;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemLeerMantenimientoIssues;
    private javax.swing.JMenuItem menuItemLeerMantenimientoProyectos;
    private javax.swing.JMenuItem menuItemLogInInicio;
    private javax.swing.JMenuItem menuItemRenombrarMantenimientoTareas;
    private javax.swing.JMenuItem menuItemSignOutInicio;
    private javax.swing.JMenu menuMantenimientoIssues;
    private javax.swing.JMenu menuMantenimientoProyectos;
    private javax.swing.JMenu menuMantenimientoTareas;
    private javax.swing.JMenu menuProyectos;
    private javax.swing.JMenu menuStart;
    private javax.swing.JMenu menuTareas;
    // End of variables declaration//GEN-END:variables
}
