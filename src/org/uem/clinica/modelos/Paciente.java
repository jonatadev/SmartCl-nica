package org.uem.clinica.modelos;
import org.uem.clinica.modelos.Pessoa;

public class Paciente extends Pessoa{
      private String tipoConvenio;
      
      public Paciente() {}

      public Paciente(String nome, String cpf, String rg, String sexo, String email, String telefone) {
            super(nome, cpf, rg, sexo, email, telefone);
      }
      
      public String getNome() {
            return nome;
      }

      public void setNome(String nome) {
            this.nome = nome;
      }

      public String getCpf() {
            return cpf;
      }

      public void setCpf(String cpf) {
            this.cpf = cpf;
      }

      public String getRg() {
            return rg;
      }

      public void setRg(String rg) {
            this.rg = rg;
      }

      public String getSexo() {
            return sexo;
      }

      public void setSexo(String sexo) {
            this.sexo = sexo;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public String getTelefone() {
            return telefone;
      }

      public void setTelefone(String telefone) {
            this.telefone = telefone;
      }

      public String getTipoConvenio() {
            return tipoConvenio;
      }

      public void setTipoConvenio(String tipoConvenio) {
            this.tipoConvenio = tipoConvenio;
      }
}
