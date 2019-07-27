package org.uem.clinica.controller;
// Validação campos: https://www.youtube.com/watch?v=p2BU7HWrc2U
// https://knowm.org/open-source/xchart/xchart-example-code/
// https://www.youtube.com/watch?v=zmMtmpavL4I
// https://www.devmedia.com.br/forum/nao-consigo-preenche-a-tabela-jtable-junto-com-a-persistencia-hibernate-no-banco/582983
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import org.uem.clinica.model.Paciente;
import org.uem.clinica.view.ViewCadastrarPaciente;

public class ControllerCadastroPaciente {
      private ActionListener actionListenerCadastrar;
      private ViewCadastrarPaciente viewPaciente = new ViewCadastrarPaciente();
      private Paciente novoPaciente = new Paciente();
      
      public void cadastrarPaciente() {
            viewPaciente.setVisible(true);
            
            actionListenerCadastrar = new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                       novoPaciente.setNome(viewPaciente.getNome().getText());
                       novoPaciente.setCpf(viewPaciente.getCpf().getText());
                       novoPaciente.setRg(viewPaciente.getRg().getText());
                       novoPaciente.setDataNascimento(viewPaciente.getDataNascimento().getText());
                       novoPaciente.setSexo(String.valueOf(viewPaciente.getSexo().getSelectedItem()));
                       novoPaciente.setTipConvenio(String.valueOf(viewPaciente.getTipoConvenio().getSelectedItem()));
                       novoPaciente.setEndereco(viewPaciente.getEndereco().getText());
                       novoPaciente.setNumeroResidencia(viewPaciente.getNumeroResidencia().getText());
                       novoPaciente.setBairro(viewPaciente.getBairro().getText());
                       novoPaciente.setCidade(viewPaciente.getCidade().getText());
                       novoPaciente.setCep(viewPaciente.getCep().getText());
                       novoPaciente.setEstado(viewPaciente.getEstado().getText());
                       novoPaciente.setTelefone(viewPaciente.getTelefone().getText());
                       novoPaciente.setEmail(viewPaciente.getEmail().getText());
                      
                       novoPaciente.cadastrarPaciente(novoPaciente);
                  }
            };
            viewPaciente.getSalvar().
                    addActionListener(actionListenerCadastrar);
      }
      
      public static void main(String[] args) {
            ControllerCadastroPaciente cP = new ControllerCadastroPaciente();
            cP.cadastrarPaciente();
      }
}
