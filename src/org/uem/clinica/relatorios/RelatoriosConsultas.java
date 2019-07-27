package org.uem.clinica.relatorios;

import org.uem.clinica.colaboradores.Secretaria;
import org.uem.clinica.modelos.Consulta;

public class RelatoriosConsultas {
      private static Secretaria secretaria = new Secretaria();
      
      // Lista todas as consultas cadastradas
      public static void todasAsConsultas() {
            System.out.println("Todas as Consultas Cadastradas:");
            System.out.println("================================:");
            for(Consulta c : secretaria.atualizarConsulta()) {
                  System.out.println("Paciente: " + c.getPaciente().getNome());
                  System.out.println("Medico: " + c.getMedico().getNome());
                  System.out.println("Data: " + c.getData());
                  System.out.println("Horario: " + c.getHorario());
                  System.out.println("Tipo: " + c.getTipo());
            }
            System.out.println("================================:");
      }
}
