package org.uem.clinica.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class ViewCadastrarPaciente extends javax.swing.JFrame {

      public ViewCadastrarPaciente() {
            setLookAndFeel();
            initComponents();
      }

      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jLabel3 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jPanel2 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            nome = new javax.swing.JTextField();
            rg = new javax.swing.JFormattedTextField();
            cpf = new javax.swing.JFormattedTextField();
            jLabel7 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            dataNascimento = new javax.swing.JFormattedTextField();
            jLabel9 = new javax.swing.JLabel();
            sexo = new javax.swing.JComboBox<>();
            tipoConvenio = new javax.swing.JComboBox<>();
            jLabel10 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            jLabel6 = new javax.swing.JLabel();
            salvar = new javax.swing.JButton();
            jLabel11 = new javax.swing.JLabel();
            jPanel1 = new javax.swing.JPanel();
            jLabel12 = new javax.swing.JLabel();
            numeroResidencia = new javax.swing.JTextField();
            jLabel13 = new javax.swing.JLabel();
            jLabel14 = new javax.swing.JLabel();
            bairro = new javax.swing.JTextField();
            jLabel15 = new javax.swing.JLabel();
            jLabel16 = new javax.swing.JLabel();
            jLabel17 = new javax.swing.JLabel();
            cep = new javax.swing.JFormattedTextField();
            endereco = new javax.swing.JTextField();
            cidade = new javax.swing.JTextField();
            estado = new javax.swing.JTextField();
            jLabel18 = new javax.swing.JLabel();
            telefone = new javax.swing.JFormattedTextField();
            jLabel19 = new javax.swing.JLabel();
            email = new javax.swing.JTextField();
            jSeparator2 = new javax.swing.JSeparator();
            cancelar = new javax.swing.JButton();
            sair = new javax.swing.JButton();

            jLabel3.setText("jLabel3");

            jLabel5.setText("jLabel5");

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Cadastrar Paciente");
            setLocationByPlatform(true);
            setResizable(false);

            jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

            jLabel1.setText("Nome:");

            jLabel2.setText("Cpf:");

            nome.setHorizontalAlignment(javax.swing.JTextField.CENTER);

            try {
                  rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###-##")));
            } catch (java.text.ParseException ex) {
                  ex.printStackTrace();
            }
            rg.setHorizontalAlignment(javax.swing.JTextField.CENTER);

            try {
                  cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
            } catch (java.text.ParseException ex) {
                  ex.printStackTrace();
            }
            cpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

            jLabel7.setText("Rg:");

            jLabel8.setText("Data nascimento:");

            try {
                  dataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
            } catch (java.text.ParseException ex) {
                  ex.printStackTrace();
            }
            dataNascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

            jLabel9.setText("Sexo:");

            sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

            tipoConvenio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Particular", "Plano de Saúde", " " }));

            jLabel10.setText("Tipo Convenio");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel7)
                                          .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel9)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel10)
                                          .addComponent(tipoConvenio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel2)
                              .addComponent(jLabel7)
                              .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel8)
                              .addComponent(jLabel9)
                              .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(tipoConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jLabel4.setBackground(new java.awt.Color(255, 51, 51));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/64network (2).png"))); // NOI18N
            jLabel4.setText("      Digite as Informações Sobre o Paciente.");

            jLabel6.setText("Informações pessoais:");

            salvar.setText("Cadastrar");

            jLabel11.setText("Informações de contato:");

            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

            jLabel12.setText("Endereço:");

            numeroResidencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

            jLabel13.setText("Número residência:");

            jLabel14.setText("Bairro:");

            bairro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

            jLabel15.setText("Cep:");

            jLabel16.setText("Cidade:");

            jLabel17.setText("Estado:");

            try {
                  cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
            } catch (java.text.ParseException ex) {
                  ex.printStackTrace();
            }
            cep.setHorizontalAlignment(javax.swing.JTextField.CENTER);

            endereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);

            cidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);

            estado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

            jLabel18.setText("Telefone:");

            try {
                  telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-#####-####")));
            } catch (java.text.ParseException ex) {
                  ex.printStackTrace();
            }
            telefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

            jLabel19.setText("Email:");

            email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            email.setToolTipText("");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(133, 133, 133))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel14))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(numeroResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bairro)))
                        .addContainerGap())
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(telefone, javax.swing.GroupLayout.Alignment.TRAILING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel16)
                                          .addComponent(jLabel18))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(42, 42, 42))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                            .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jLabel15)
                                                            .addGap(81, 81, 81)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(jLabel17)
                                                      .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                          .addComponent(email))
                                    .addContainerGap())))
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel12)
                              .addComponent(jLabel13)
                              .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(numeroResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel16)
                              .addComponent(jLabel17)
                              .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel18)
                              .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            cancelar.setText("Cancelar");

            sair.setText("Sair");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(jLabel6)
                                                      .addComponent(jLabel11)))
                                          .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(14, Short.MAX_VALUE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                      .addComponent(salvar)
                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                      .addComponent(cancelar)
                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                      .addComponent(sair))
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE))))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(154, 154, 154)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel4)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(salvar)
                              .addComponent(cancelar)
                              .addComponent(sair))
                        .addContainerGap())
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      /**
       * @param args the command line arguments
       */
      
      public static void main(String args[]) {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
             *//*
            try {
                  for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                              javax.swing.UIManager.setLookAndFeel(info.getClassName());
                              break;
                        }
                  }
            } catch (ClassNotFoundException ex) {
                  java.util.logging.Logger.getLogger(ViewCadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(ViewCadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(ViewCadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(ViewCadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } */
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new ViewCadastrarPaciente().setVisible(true);
                  }
            });
      } 

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JTextField bairro;
      private javax.swing.JButton cancelar;
      private javax.swing.JFormattedTextField cep;
      private javax.swing.JTextField cidade;
      private javax.swing.JFormattedTextField cpf;
      private javax.swing.JFormattedTextField dataNascimento;
      private javax.swing.JTextField email;
      private javax.swing.JTextField endereco;
      private javax.swing.JTextField estado;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel10;
      private javax.swing.JLabel jLabel11;
      private javax.swing.JLabel jLabel12;
      private javax.swing.JLabel jLabel13;
      private javax.swing.JLabel jLabel14;
      private javax.swing.JLabel jLabel15;
      private javax.swing.JLabel jLabel16;
      private javax.swing.JLabel jLabel17;
      private javax.swing.JLabel jLabel18;
      private javax.swing.JLabel jLabel19;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JLabel jLabel9;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JSeparator jSeparator1;
      private javax.swing.JSeparator jSeparator2;
      private javax.swing.JTextField nome;
      private javax.swing.JTextField numeroResidencia;
      private javax.swing.JFormattedTextField rg;
      private javax.swing.JButton sair;
      private javax.swing.JButton salvar;
      private javax.swing.JComboBox<String> sexo;
      private javax.swing.JFormattedTextField telefone;
      private javax.swing.JComboBox<String> tipoConvenio;
      // End of variables declaration//GEN-END:variables
      
      private void setLookAndFeel() {
            try {
                  for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                              javax.swing.UIManager.setLookAndFeel(info.getClassName());
                              break;
                        }
                  }
            } catch (ClassNotFoundException ex) {
                  java.util.logging.Logger.getLogger(ViewCadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(ViewCadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(ViewCadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(ViewCadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
      }

      public JTextField getBairro() {
            return bairro;
      }

      public void setBairro(JTextField bairro) {
            this.bairro = bairro;
      }

      public JButton getCancelar() {
            return cancelar;
      }

      public void setCancelar(JButton cancelar) {
            this.cancelar = cancelar;
      }

      public JFormattedTextField getCep() {
            return cep;
      }

      public void setCep(JFormattedTextField cep) {
            this.cep = cep;
      }

      public JTextField getCidade() {
            return cidade;
      }

      public void setCidade(JTextField cidade) {
            this.cidade = cidade;
      }

      public JFormattedTextField getCpf() {
            return cpf;
      }

      public void setCpf(JFormattedTextField cpf) {
            this.cpf = cpf;
      }

      public JFormattedTextField getDataNascimento() {
            return dataNascimento;
      }

      public void setDataNascimento(JFormattedTextField dataNascimento) {
            this.dataNascimento = dataNascimento;
      }

      public JTextField getEmail() {
            return email;
      }

      public void setEmail(JTextField email) {
            this.email = email;
      }

      public JTextField getEndereco() {
            return endereco;
      }

      public void setEndereco(JTextField endereco) {
            this.endereco = endereco;
      }

      public JTextField getEstado() {
            return estado;
      }

      public void setEstado(JTextField estado) {
            this.estado = estado;
      }

      public JButton getLimpar() {
            return sair;
      }

      public void setLimpar(JButton limpar) {
            this.sair = limpar;
      }

      public JTextField getNome() {
            return nome;
      }

      public void setNome(JTextField nome) {
            this.nome = nome;
      }

      public JTextField getNumeroResidencia() {
            return numeroResidencia;
      }

      public void setNumeroResidencia(JTextField numeroResidencia) {
            this.numeroResidencia = numeroResidencia;
      }

      public JFormattedTextField getRg() {
            return rg;
      }

      public void setRg(JFormattedTextField rg) {
            this.rg = rg;
      }

      public JButton getSalvar() {
            return salvar;
      }

      public void setSalvar(JButton salvar) {
            this.salvar = salvar;
      }

      public JComboBox<String> getSexo() {
            return sexo;
      }

      public void setSexo(JComboBox<String> sexo) {
            this.sexo = sexo;
      }

      public JFormattedTextField getTelefone() {
            return telefone;
      }

      public void setTelefone(JFormattedTextField telefone) {
            this.telefone = telefone;
      }

      public JComboBox<String> getTipoConvenio() {
            return tipoConvenio;
      }

      public void setTipoConvenio(JComboBox<String> tipoConvenio) {
            this.tipoConvenio = tipoConvenio;
      }

      
}
