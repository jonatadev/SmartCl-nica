package org.uem.clinica.relatorios;
        
import java.util.Scanner;
import org.uem.clinica.colaboradores.Secretaria;
import org.uem.clinica.modelos.Consulta;
import org.uem.clinica.modelos.Medico;
import org.uem.clinica.modelos.Prontuario;

public class RelatoriosMedicos {
      private static Medico medico = new Medico();
      private static Secretaria secretaria = new Secretaria();
      private static Scanner io = new Scanner(System.in);
      
      // Lista todos os prontuarios feitos por um medico.
      public static void todosProntuariosPorMedico() {
            System.out.print("Nome do medico: ");
            String nome = io.nextLine();
            System.out.println("Todos os Prontuarios do medico.");
            System.out.println("================================:");
            for(Prontuario p : medico.atualizarProntuario()) {
                  if(p.getMedico().getNome()
                          .equalsIgnoreCase(nome)) {
                        System.out.println("Nome Medico: " + p.getMedico().getNome());
                        System.out.println("Nome Paciente: " + p.getPaciente().getNome());
                        System.out.println("Diagnostico Doença: " + p.getDiagnosticoDoenca());
                        System.out.println("Sintomas: " + p.getSintomas());
                        System.out.println("Tratamento: " + p.getTratamento());
                  }
            }
            System.out.println("================================:");
      }
      
      // Lista todas as consultas feitas por um medico.
      public static void todasConsultasPorMedico() {
            System.out.print("Nome do medico: ");
            String nome = io.nextLine();
            System.out.println("Todos as Consultas por medico.");
            System.out.println("================================:");
            for(Consulta c : secretaria.atualizarConsulta()) {
                  if(c.getMedico().getNome()
                          .equalsIgnoreCase(nome)) {
                        System.out.println("Nome Medico: " + c.getMedico().getNome());
                        System.out.println("Nome Paciente: " + c.getPaciente().getNome());
                        System.out.println("Data Consulta: " + c.getData());
                        System.out.println("Horario Consulta: " + c.getHorario());
                        System.out.println("Tipo Consulta: " + c.getTipo());
                  }
            }
            System.out.println("================================:");
      }
}
