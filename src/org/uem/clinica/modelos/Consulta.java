package org.uem.clinica.modelos;

public class Consulta {
      private String data;
      private String horario;
      private String tipo;
      // Uma consulta tem de ter um paciente que sera consultado.
      // por um medico em uma data previamente agendada. 
      private Paciente paciente;
      private Medico medico;
      
      public Consulta() {
      }

      public Consulta(String data, String horario, String tipo) {
            this.data = data;
            this.horario = horario;
            this.tipo = tipo;
      }

      public String getData() {
            return data;
      }

      public void setData(String data) {
            this.data = data;
      }

      public String getHorario() {
            return horario;
      }

      public void setHorario(String horario) {
            this.horario = horario;
      }

      public String getTipo() {
            return tipo;
      }

      public void setTipo(String tipo) {
            this.tipo = tipo;
      }

      // getters and setters Paciente  
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
