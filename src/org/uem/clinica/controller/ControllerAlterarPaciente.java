package org.uem.clinica.controller;
// https://docs.oracle.com/javase/8/docs/api/index.html?javax/swing/package-summary.html
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.uem.clinica.model.Paciente;
import org.uem.clinica.view.ViewAlterarPaciente;

public class ControllerAlterarPaciente {
      private ActionListener actionListenerBuscar;
      private ViewAlterarPaciente viewAlterarPaciente = new ViewAlterarPaciente();
      
      public void pesquisarPaciente() {
        viewAlterarPaciente.setVisible(true);
        // javax.​swing.​JTable
        actionListenerBuscar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paciente pacienteBusca = new Paciente();
                pacienteBusca.setNome("Jonatas Alves da Silva");
                pacienteBusca.setSexo("Masculino");
                pacienteBusca.setCpf("04553429988");
                pacienteBusca.setEmail("jonatadev@gmail.com");
// setValueAt(Object aValue, int rowIndex, int columnIndex)                
                viewAlterarPaciente.getResultadoPesquisa().getModel()
                        .setValueAt(pacienteBusca.getNome(), 0, 0);
                viewAlterarPaciente.getResultadoPesquisa().getModel()
                        .setValueAt(pacienteBusca.getSexo(), 0, 1);
                viewAlterarPaciente.getResultadoPesquisa().getModel()
                        .setValueAt(pacienteBusca.getCpf(), 0, 2);
                viewAlterarPaciente.getResultadoPesquisa().getModel()
                        .setValueAt(pacienteBusca.getEmail(), 0, 3);
            }
        };
        viewAlterarPaciente.getBuscar()
                .addActionListener(actionListenerBuscar);
      }
      
      
      
      public static void main(String[] args) {
         ControllerAlterarPaciente aP = new ControllerAlterarPaciente();
         aP.pesquisarPaciente();
    }
}



/*
Interface Table Model
https://docs.oracle.com/javase/8/docs/api/javax/swing/table/TableModel.html
The TableModel interface specifies the methods the JTable will use to interrogate a tabular data model.

Tutorial Hibernate
https://www.codejava.net/frameworks/hibernate/hibernate-enum-type-mapping-example

Hibernate netbeans
https://netbeans.org/kb/docs/java/hibernate-java-se.html

*/