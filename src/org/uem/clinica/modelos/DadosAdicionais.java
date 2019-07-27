package org.uem.clinica.modelos;

public class DadosAdicionais {
      private String fuma;
      private String bebe;
      private String colesterol;
      private String diabete;
      private String doencaCardiaca;
      private String cirurgias;
      private String alergias;
      // Dados adicionais do paciente e o medico que preencheu as
      // informações
      private Paciente paciente;
      private Medico medico;
      
      public DadosAdicionais() {
      }

      public DadosAdicionais(String fuma, String bebe, String colesterol, String diabete, String doencaCardiaca, String cirurgias, String alergias) {
            this.fuma = fuma;
            this.bebe = bebe;
            this.colesterol = colesterol;
            this.diabete = diabete;
            this.doencaCardiaca = doencaCardiaca;
            this.cirurgias = cirurgias;
            this.alergias = alergias;
      }

      public String getFuma() {
            return fuma;
      }

      public void setFuma(String fuma) {
            this.fuma = fuma;
      }

      public String getBebe() {
            return bebe;
      }

      public void setBebe(String bebe) {
            this.bebe = bebe;
      }

      public String getColesterol() {
            return colesterol;
      }

      public void setColesterol(String colesterol) {
            this.colesterol = colesterol;
      }

      public String getDiabete() {
            return diabete;
      }

      public void setDiabete(String diabete) {
            this.diabete = diabete;
      }

      public String getDoencaCardiaca() {
            return doencaCardiaca;
      }

      public void setDoencaCardiaca(String doencaCardiaca) {
            this.doencaCardiaca = doencaCardiaca;
      }

      public String getCirurgias() {
            return cirurgias;
      }

      public void setCirurgias(String cirurgias) {
            this.cirurgias = cirurgias;
      }

      public String getAlergias() {
            return alergias;
      }

      public void setAlergias(String alergias) {
            this.alergias = alergias;
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
