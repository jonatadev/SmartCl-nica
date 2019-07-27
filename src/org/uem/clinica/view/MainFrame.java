package org.uem.clinica.view;

public class MainFrame extends javax.swing.JFrame {
      public MainFrame() {
            initComponents();
      }

      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            desktop = new javax.swing.JDesktopPane();
            jMenuBar1 = new javax.swing.JMenuBar();
            jMenu1 = new javax.swing.JMenu();
            menuExit = new javax.swing.JMenuItem();
            menuFrames = new javax.swing.JMenu();
            jMenuItemFrame1 = new javax.swing.JMenuItem();
            CadastrarMedico = new javax.swing.JMenuItem();
            jMenu2 = new javax.swing.JMenu();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
            desktop.setLayout(desktopLayout);
            desktopLayout.setHorizontalGroup(
                  desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 755, Short.MAX_VALUE)
            );
            desktopLayout.setVerticalGroup(
                  desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 470, Short.MAX_VALUE)
            );

            jMenu1.setText("Arquivo");

            menuExit.setText("Sair");
            menuExit.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        menuExitActionPerformed(evt);
                  }
            });
            jMenu1.add(menuExit);

            jMenuBar1.add(jMenu1);

            menuFrames.setText("Enfermeira");
            menuFrames.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        menuFramesActionPerformed(evt);
                  }
            });

            jMenuItemFrame1.setText("Cadastrar Paciente");
            jMenuItemFrame1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jMenuItemFrame1ActionPerformed(evt);
                  }
            });
            menuFrames.add(jMenuItemFrame1);

            CadastrarMedico.setText("Cadastrar Médico");
            CadastrarMedico.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        CadastrarMedicoActionPerformed(evt);
                  }
            });
            menuFrames.add(CadastrarMedico);

            jMenuBar1.add(menuFrames);

            jMenu2.setText("Médico");
            jMenuBar1.add(jMenu2);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(desktop)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(desktop)
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
            System.exit(0);
      }//GEN-LAST:event_menuExitActionPerformed

      private void jMenuItemFrame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFrame1ActionPerformed
            ViewCadastrarPaciente f = new ViewCadastrarPaciente();
            f.setVisible(true);
      }//GEN-LAST:event_jMenuItemFrame1ActionPerformed

      private void menuFramesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFramesActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_menuFramesActionPerformed

      private void CadastrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarMedicoActionPerformed
            ViewCadastrarMedico cadastrarMedico = new ViewCadastrarMedico();
            cadastrarMedico.setVisible(true);
      }//GEN-LAST:event_CadastrarMedicoActionPerformed

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
                  java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new MainFrame().setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JMenuItem CadastrarMedico;
      private javax.swing.JDesktopPane desktop;
      private javax.swing.JMenu jMenu1;
      private javax.swing.JMenu jMenu2;
      private javax.swing.JMenuBar jMenuBar1;
      private javax.swing.JMenuItem jMenuItemFrame1;
      private javax.swing.JMenuItem menuExit;
      private javax.swing.JMenu menuFrames;
      // End of variables declaration//GEN-END:variables
}
