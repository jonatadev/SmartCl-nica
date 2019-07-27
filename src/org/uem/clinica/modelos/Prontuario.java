package org.uem.clinica.modelos;

public class Prontuario {
      private String sintomas;
      private String diagnosticoDoenca;
      private String tratamento;
      // Prontuário do paciente contem dados inseridos pelo medico
      // que realizou consulta.
      private Paciente paciente;
      private Medico medico;
      
      public Prontuario() {}

      public Prontuario(String sintomas, String diagnosticoDoenca, String tratamento) {
            this.sintomas = sintomas;
            this.diagnosticoDoenca = diagnosticoDoenca;
            this.tratamento = tratamento;
      }

      public String getSintomas() {
            return sintomas;
      }

      public void setSintomas(String sintomas) {
            this.sintomas = sintomas;
      }

      public String getDiagnosticoDoenca() {
            return diagnosticoDoenca;
      }

      public void setDiagnosticoDoenca(String diagnosticoDoenca) {
            this.diagnosticoDoenca = diagnosticoDoenca;
      }

      public String getTratamento() {
            return tratamento;
      }

      public void setTratamento(String tratamento) {
            this.tratamento = tratamento;
      }

      public Paciente getPaciente() {
            return paciente;
      }

      public void setPaciente(Paciente paciente) {
            this.paciente = paciente;
      }

      public Medico getMedico() {
        return medico;
      }

      public void setMedico(Medico medico) {
        this.medico = medico;
      }
}
